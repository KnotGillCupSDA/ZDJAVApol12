package com.sda.zad33;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageSearcher {

    public List<File> getImages(Path inputDirectory) {
        File inputFile = inputDirectory.toFile();
        if (inputFile.isDirectory()) {
            File[] filtered = inputFile.listFiles((dir, name) -> {
                String lowerCase = name.toLowerCase();
                return lowerCase.endsWith(".png") || lowerCase.endsWith("jpg");
            });

            if (filtered != null) {
                return Arrays.asList(filtered);
            }
        }
        return Collections.emptyList();
    }

    public List<File> getImagesWithWalk(Path inputDirectory) throws IOException {
        try (Stream<Path> walk = Files.walk(inputDirectory, 1)) {
            return walk
                .map(Path::toFile)
                .filter(file -> file.getName().endsWith(".png") || file.getName().endsWith(".jpg"))
                .collect(Collectors.toList());
        }
    }

    public List<File> getImagesWithWalkTree(Path inputDirectory) throws IOException {
        List<File> files = new ArrayList<>();
        Files.walkFileTree(inputDirectory, Collections.emptySet(), 1, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                File f = file.toFile();
                if (f.getName().endsWith(".jpg") || f.getName().endsWith(".png")) {
                    files.add(f);
                }
                return FileVisitResult.CONTINUE;
            }
        });

        return files;
    }
}
