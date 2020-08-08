package com.sda.zad31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Path resourceDirectory = Paths.get("src", "main", "resources");
        Path inputFile = resourceDirectory.resolve("exercises.txt");

        Map<String, Integer> wordCounter = new HashMap<>();

        // with Stream
        Files.lines(inputFile)
            .map(s -> s.replaceAll("[^\\p{L}\\s]", ""))
            .map(s -> s.split(" "))
            .flatMap(Stream::of)
            .forEach(s -> {
                if (!s.isEmpty()) {
                    wordCounter.compute(s, (k, v) -> (v == null) ? 1 : v + 1);
                }
            });

        // sortowanie po liczbie wystąpień
        Map<String, Integer> sortedWords = wordCounter.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //save to file
        Path resultFile = resourceDirectory.resolve("wordCounterResult.txt");
        Files.deleteIfExists(resultFile);
        Files.createFile(resultFile);
        for(String key : sortedWords.keySet()) {
            String line = String.format("%-25s %d \n", key, sortedWords.get(key));
            Files.write(resultFile, line.getBytes(), StandardOpenOption.APPEND);
        }
    }
}
