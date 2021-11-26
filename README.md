Zadání Pokojové rostliny
Model dat — pokojová rostlina
Připravte třídu pro ukládání informací o pokojových rostlinách (plant).

U každé rostliny budeme mít uložen:
název (name),
poznámky (notes),
datum, kdy byly zasazena (planted),
datum poslední zálivky (watering)
běžnou frekvenci zálivky ve dnech (frequency of watering)
Vytvořte tři konstruktory:
jeden pro nastavení všech atributů
druhý nastaví jako poznámku prázdný řetězec a datum poslední zálivky nastaví na dnešní datum.
třetí nastaví totéž co druhý a navíc výchozí frekvenci zálivky na 7 dnů a datum zasazení na dnešní datum. (Uživatel tedy bude zadávat pouze název rostliny.)
Vytvořte výchozí přístupové metody pro všechny atributy.
Připravte metodu getWateringInfo(), která vrátí název květiny, datum poslední zálivky a datum doporučené další zálivky. (Metoda vrátí textový řetězec, obsahující požadované informace.)
Ošetření vstupů a výjimky
Vytvořte novou třídu výjimek s názvem PlantException. Bude potomkem (extends) třídy Exception.
Ošetřete zadávání frekvence zálivky — pokud je parametrem 0 nebo záporné číslo, systém vyhodí výjimku třídy PlantException s vhodným popisem.
Obdobně ošetřete zadávání data poslední zálivky — nesmí být starší než datum zasazení rostliny.
Vytvoření seznamu květin
Vytvořte třídu pro ukládání seznamu pokojových květin. Jako atribut bude mít kolekci, uchovávající květiny.
Přidejte metody pro přidání nové květiny, získání květiny na zadaném pořadí a odebrání květiny ze seznamu.
Načtení ze souboru
Přidejte do seznamu květin metodu pro načtení květin ze souboru.
V případě chybného vstupu vraťte výjimku.
Přidejte do seznamu květin metodu pro uložení aktualizovaného seznamu do souboru.
Ověření
Načtěte seznam květin ze souboru kvetiny.txt.
Vypište na obrazovku informace o zálivce pro všechny květiny.
Přidejte dvě nové květiny do seznamu. Jednu květinu odeberte.
Uložte seznam květin do nového souboru a ověřte, že je jeho obsah správný. Výsledný soubor by měl vypadat takto: vystup.txt.
Vyzkoušejte opětovné načtení vygenerovaného souboru.
