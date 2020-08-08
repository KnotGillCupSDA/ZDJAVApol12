Zadanie 27.
Zaprojektuj klasę Joiner<T>, która w konstruktorze będzie przyjmowała separator (string) oraz posiadała
metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T. Metoda ta będzie zwracać stringa
łącząc wszystkie przekazane elementy wywołując ich metodę toString() i oddzielać je separatorem.
np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4… 