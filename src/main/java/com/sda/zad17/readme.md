Zadanie 17.
Stwórz klasę enum ConversionType ze stałymi METERS_TO_YARDS, YARDS_TO_METERS,
CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę convert(int value,
ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji, korzystała z
Convertera danego typu i zwracała wynik.