---
title: Testowanie oprogramowania
---

# Wprowadzenie do testowania

```mermaid
graph TD
    przyczyna --> skutek
    przyczyna("Przyczyna: Błąd – usterka (defekt, pomyłka, rozbieżność) w programie, która może skutkować nieprawidłowym (tj. niezgodnym z oczekiwaniami użytkownika) działaniem")
    skutek("Skutek: Błędne wykonanie (awaria) – niepoprawne działanie programu w trakcie jego pracy")
```

 - Skutkiem błędu w programie może być wiele jego błędnych wykonań 
 - Takie samo błędne wykonanie programu może być skutkiem różnych błędów

 ## Najbardziej spektakularne błędy w programach oraz ich skutki
  - 1988: Zestrzelenie samolotu Airbus A320 – śmierć 290 osób 
  - 1991: Błąd naprowadzania rakiet Patriot – śmierć 28 osób 
  - 1994: Błąd dzielenia zmiennoprzecinkowego w procesorze Pentium – koszt ok. 475 000 000 USD 
  - 1996: Katastrofa rakiety Ariane5 – koszt ok. 500 000 000 USD 
  - 1999: Katastrofa sondy kosmicznej Mars Polar Lander 5 – koszt samego lądownika ok. 120 000 000 USD 
  - 2000: „pluskwa milenijna”

## Kiedy w oprogramowaniu znajduje się błąd? 
 - Oprogramowanie nie wykonuje czegoś, co według specyfikacji powinno wykonywać 
 - Oprogramowanie robi coś, czego według specyfikacji nie powinno robić 
 - Oprogramowanie wykonuje coś, o czym specyfikacja w ogóle nie wspomina 
 - Oprogramowanie nie wykonuje czegoś, o czym specyfikacja nie wspomina, ale powinna 
 - Oprogramowanie jest trudne do zrozumienia, trudne do użycia, powolne albo – zdaniem testera – będzie w oczach użytkownika po prostu nieprawidłowe

 ## Źródła powstawania błędów, udział od największych do najmniejszych
  - Specyfikacja,
  - Projekt,
  - Kod,
  - Inne.

Istotnymi czynnikami mającymi wpływ na powstawanie błędów wprogramach jest ich rosnąca złożoność i wielkość.

## Kontekst i zrozumienie
![projekt](img/projekt.png "Projekt")

## Błędy w programie można rozpatrywać na poziomie: 
 - mechanizmu powstawania błędu (error), związanego najczęściej zfazą analizy wymagań i projektowania (błędne założenia projektowe, niewłaściwa interpretacja specyfikacji, dobór niewłaściwego algorytmu, itp.) 
 - programowym (fault), związanym najczęściej z fazą implementacji (błędy programisty)
 - użytkowym ( failure ), kiedy można zaobserwować błędne działanie funkcji program

## Szacunkowe koszty błędów

Dynamiczny rozwój branży IT powoduje obserwowalne i rosnące koszty będące skutkami błędów w programach


| Faza           | Koszt [EUR] | czas naprawy [h] |
| ---            |  ------     | ---------:       |
| Analiza        | 1           | 0.1              |
| Projektowanie  | 5           | 0.5              |
| Kodowanie      | 10          | 1                |
| Testowanie     | 15-50       | 1.5-5            |
| Wdrożenie      | >100        | >10              |

## Czy testowanie się opłaca?
 - Scenariusz #1: 
   - Liczba błędów znalezionych w programie – 1000 
   - Liczba błędów znalezionych przez deweloperów – 750 
   - Liczba błędów znalezionych przez użytkowników – 250 
   - Średni koszt wykrycia i naprawy błędu: przed wdrożeniem – 10€, po wdrożeniu – 250€
   - Koszt zapewnienia jakości: 750 * 10€ + 250 * 250€ = 70 000€
 - Scenariusz #2:
   - Liczba błędów znalezionych w programie – 1000 
   - Liczba błędów znalezionych przez deweloperów – 750 
   - Liczba błędów znalezionych przez testerów – 200 
   - Liczba błędów znalezionych przez użytkowników – 50 
   - Średni koszt wykrycia i naprawy błędu: przed testowaniem – 10€, w fazie testowania – 50€, po wdrożeniu – 250€
   - Koszt przygotowania i przeprowadzenia testów – 10 000
   - Koszt zapewnienia jakości: 750 * 10€ + 200 * 50€ + 50 * 250€ + 10 000€ = 40 000€
- Wniosek: Naprawa błędnego oprogramowania jest droższa (finansowoi marketingowo) niż koszt pracy testerów

## Podstawowe pojęcia
 - Testowanie oprogramowania to wykonanie kodu dla różnych kombinacji danych wejściowych i stanów, mające na celu wykrycie błędów w programie
 - Zasadniczym celem testowania jest dążenie do uzyskania odpowiednio wysokiego poziomu niezawodności i jakości oprogramowania, stosownie do zdefiniowanych wymagań, ograniczeń czasowych i kryteriów ekonomicznych
 - Testowanie powinno umożliwiać wykrycie jak największej liczby błędów → wzrost niezawodności programu
 - Testowanie powinno zapewniać na jak najwcześniejsze wykrycie błędów → redukcja kosztów naprawy błędów
 - Test zakończony sukcesem to test, którego skutkiem jest wykrycie nieznalezionego dotychczas błędu w programie 
 - Test uznaje się za efektywny, jeżeli ma zdolność wykrycia jaknajwiększej liczby błędów zjak największym prawdopodobieństwem
 - Uruchamianie programów („odpluskwianie”, debugowanie) jest działaniem mającym na celu zlokalizowanie, a następnie poprawienie wykrytych w trakcie testowania błędów 
 - Do uruchamiania programów wykorzystuje się przypadki testowe zaprojektowane w taki sposób, aby były pomocne wznajdowaniu przyczyny błędu 
 - Uruchamianie programów jest procesem, w trakcie którego formułuje się, a następnie weryfikuje praktycznie hipotezy, dotyczące przyczyn błędnego działania programu 
 - W trakcie debugowaniabardzo pomocne jest doświadczenie iwiedza, dotycząca typowych błędów programistycznych

## Podstawowe zasady
  - podczas testowania ważniejsze jest sprawdzenie typowych przypadków użycia programu, niż przypadków rzadkich (skrajnych) 
  - testowanie istniejącej funkcjonalności programu powinno być ważniejsze od testowania nowej funkcjonalności 
  - należy unikać testowania przez autorów oprogramowania 
  - należy dokumentować testy i zasady ich użycia 
  - należy zbierać i poddawać analizie wyniki testów 
  - trzeba uwzględniać w testach zarówno poprawne, jak i niepoprawne dane wejściowe oraz warunki wykonania 
  - należy sprawdzać, nie tylko czy w trakcie działania program wykonuje to co powinien, ale także czy nie wykonuje tego, czego nie powinien

# Walidacja i weryfikacja oprogramowania

 - Atestowanie, walidacja (validation) jest sprawdzaniem zgodności działania programu z oczekiwaniami użytkownika w rzeczywistych warunkach i w środowisku, dla których został on zaprojektowany Walidacja zajmuje się wykrywaniem błędów związanych znieprawidłową specyfikacją wymagań
 - Weryfikacja (verification) jest procesem mającym na celu sprawdzenie, czy program na danym etapie wytwarzania jest zgodny z wymaganiami i oczekiwaniami użytkownika Weryfikacja nie zajmuje się wykrywaniem błędów związanych z nieprawidłową specyfikacją wymagań

 - Walidacja stara się odpowiedzieć na pytanie: „Czy budujemy prawidłowy produkt?” i w tym sensie dotyczy całościowej oceny programu pod kątem spełniania oczekiwań użytkownika
 - Weryfikacja natomiast stara się odpowiedzieć na pytanie: „Czy prawidłowo budujemy produkt?” i obejmuje szerszy zakres zagadnień niż testowanie
 - Zarówno weryfikacja, jak i walidacja powinny być wykonywane na każdym etapie tworzenia oprogramowania

 - Weryfikacja może mieć charakter: 
   - statyczny – związany z analizą (przeglądem, inspekcją) specyfikacji, projektu lub kodu programu (bez konieczności jego uruchamiania) 
   - dynamiczny – polegający na wykonaniu programu lub jego fragmentu  z danymi testowymi i porównaniu uzyskanych wyników z wynikami poprawnymi → testowanie oprogramowania
 - Typową techniką statycznej weryfikacji są inspekcje kodu, podczas których zespoły inspekcyjne dokonują przeglądu kodu pod kątem sprawdzenia jego poprawności oraz spełnienia dodatkowych kryteriów (prostota, poprawność zastosowanych konstrukcji programistycznych, zgodność ze standardami kodowania, …)

 - Inną formą statycznej weryfikacji kodu jest zastosowanie narzędzi do automatycznej analizy kodu Tego typu analizatory przeglądają kod źródłowy analizując jego składnię, np. w celu sprawdzenia poprawności użytych konstrukcji programistycznych, czy też wnioskowania oprzepływie sterowania w programie. Automatyczne analizatory kodu bazują na metodach formalnych, które dla wielu systemów generują bardzo wysokie koszty, a ponadto nie są w stanie poradzić sobie ztrudnościami podczas definiowania wymagań

## Weryfikacja dynamiczna – testowanie kodu programu lub jego fragmentu
```mermaid
graph TD
    dane --> uut
    dane --> wyrocznia
    stan --> uut
    stan --> wyrocznia
    uut -- Obserwowane wyjście --> wynik
    wyrocznia -- Oczekiwane wyjście --> wynik

    dane("Dane testowe")
    uut("Testowana implementacja")
    wyrocznia("Wyrocznia")
    stan("Stan systemu")
    wynik(("Wynik testu"))
```

 - Kod poddawany testowaniu to: 
   - implementacja testowana – IUT (Implementation Under Test) 
   - metoda testowana – MUT (Method Under Test) 
   - obiekt testowany – OUT (Object Under Test) 
   - klasa testowana – CUT (Class Under Test) 
   - składowa testowana – CUT (Component Under Test) 
   - system testowany – SUT (System Under Test)
 - Przypadek testowy (Test case) – specyficzny zestaw danych wejściowych, warunków początkowych oraz oczekiwanych wyników iwarunków końcowych, służący do testowania kodu programu

 - Typowe aktywności związane z weryfikacją: 
   - sprawdzanie, czy wymagania użytkownika są weryfikowalne
   - sprawdzanie, czy elementy składowe projektu są weryfikowalne zgodnie z wymaganiami użytkownika
   - testowanie jednostek oprogramowania (modułów)
   - testowanie modułów po ich integracji
   - testowanie programu przez jego twórców
   - testowanie akceptacji programu przez użytkowników
   - okresowe inspekcje i przeglądy
   - audyt (kontrola jakości)

 - Testowanie jest jedyną techniką walidacji w odniesieniu do wymagań niefunkcjonalnych, takich jak np. rozszerzalność, bezpieczeństwo, wydajność czy skalowalność systemu
 - Przeglądy wymagań ( reviews ) są najbardziej efektywną metodą walidacji wymagań
 - Aby osiągnąć zadowalający poziom weryfikacji i walidacji, konieczne jest stosowanie zarówno techniki statycznej weryfikacji, jak i testowania, wykorzystującego odpowiednio adekwatny zestaw przypadków testowych

## Cele testowania
 - Ostatecznym celem weryfikacji i walidacji nie jest sprawdzenie, czy kod programu jest wolny od błędów, leczczy będzie on spełniał swoje funkcje i nadawał się dowykorzystania przez użytkownika
 - Osiągnięcie tak zdefiniowanego celu można utożsamiać zuzyskaniem odpowiedniego poziomu pewnościdziałania programu
 - Poziom pewności zależy przede wszystkim od:
   - przeznaczenia oprogramowania (stopnia krytyczności)
   - oczekiwań użytkowników
   - uwarunkowań na rynku

# Model V

 - Model V definiuje podstawowe fazy testowania systemu oraz pokazuje ich zależność z fazami projektowania systemu
 - Podstawowe fazy testowania systemu:
   - testowanie modułów – testowanie najmniejszych jednostek kodu, realizowane bezpośrednio po zakończeniu ich implementacji
   - testowanie systemu – testowanie poszczególnych podsystemów oraz systemu jako całości, realizowane po zintegrowaniu modułów składowych
   - testowanie akceptacji użytkowników – oprogramowanie poddawane jest testowaniu przez przyszłego użytkownika lub niezależny od producenta zespół testowy (testy alfa, testy beta)

![Model V](img/vmodel.svg "Model V")

# Aksjomaty testowania
Testowanie w żaden sposób nie jest w stanie wykazać, że oprogramowanie nie zawiera błędów, a także nie jest w stanie udowodnić, że program będzie zawsze prawidłowo realizował swoje funkcje.

>>>
„Testing shows the presence, not the absence of bugs” Edsger W. Dijkstra
>>>

## Nawet najprostszego programu nie da się przetestować całkowicie (wyczerpująco)

Przyczyny:
 - ogromna liczba danych wejściowych i wyjściowych
 - ogromna liczba możliwych ścieżek wykonania kodu programu
 - specyfikacja wymagań jest często subiektywna i ocena, czy program działa prawidłowo czy nie, zależy od tego, kto ten program ocenia (użytkownik, obserwator, tester)
 - definicje miar jakości są subiektywne i często trudno mierzalne

Przykład #1:
```
double sum(int a, int b)
```

Zakładając, że typ int jest 32-bitowy, ile mamy kombinacji danych wejściowych?

(0, 0), (0, 1), (0, 2), . . ., (0, 2<sup>32</sup>-1),

(1, 0), (1, 1), (1, 2), . . ., (1, 2<sup>32</sup>-1),

(2, 0), (2, 1), (2, 2), . . ., (2, 2<sup>32</sup>-1),

. . .

 (2<sup>32</sup>-1, 0), (2<sup>32</sup>-1, 1), (2<sup>32</sup>-1, 2), . . ., (2<sup>32</sup>-1, 2<sup>32</sup>-1)

Odpowiedź: 2<sup>64</sup> = ~1.8 * 10<sup>19</sup> (zakładając testowanie z szybkością 1test/s, to testowanie zajęłoby ok. 500 miliardów lat)  

Przykład #2
```
for (int i = 0; i < n; i++) {
    if (tab[i] == i % 2) {
        tab[i]++; 
    } else {
        tab[i] = 0;
    }
}
```

Ile potrzeba testów, aby sprawdzić wszystkie ścieżki wykonania kodu?

n = 1 → 3 ścieżki, n = 2 → 5 ścieżek, n = 5 → 33 ścieżki,

n = 10 → 1025 ścieżek, n = 100 → ~1.3 * 10<sup>30</sup> ścieżek, . . .

Odpowiedź: 2<sup>n</sup>+1 → zależność wykładnicza!!!

## Testowanie oprogramowania jest ryzykowne

Skoro nie da się przetestować wszystkiego, to trzeba pójść na kompromis i wybrać nieduży, lecz reprezentatywny podzbiór danych do testowania Podejmujemy jednocześnie ryzyko, że nie będziemy w stanie wykryć takiego błędu, który objawi się wyłącznie dla takiej kombinacji danych wejściowych, której nie testujemy
Ile testów potrzeba, aby wykryć jak największą liczbę błędów,zachowując jednocześnie koszty testowania na akceptowalnym poziomie?

![Optimal](img/optimal.png "Optimal")

## Im więcej błędów zostało znalezionych, tym więcej błędów pozostaje jeszcze nieznalezionych

Błędy programistyczne wykazują tendencję do występowania w grupach, co oznacza, że szczególną uwagę należy poświęcać tym fragmentom kodu, w których już wcześniej wykryto jakieś błędy

Przyczyny: 
 - błędy popełniane przez programistę w trakcie pracy zależą od jego sprawności (kondycji) psychicznej, samopoczucia, itp. 
 - programiści często powtarzają te same błędy
 - niektóre fragmenty kodu są bardziej podatne na błędy niż inne


## Nie wszystkie znalezione błędy zostaną naprawione

Wykrycie błędu nie oznacza, że automatycznie zostanie on poprawiony

Przyczyny:
 - brak czasu (są inne ważniejsze zadania do wykonania) 
 - menadżerowie zarządzający projektem mogą podjąć inną decyzję (napięty harmonogram, zbyt duże koszty naprawy) 
 - zbyt duże ryzyko związane z koniecznością wprowadzenia bardzo istotnych zmian w oprogramowaniu 
 - nieopłacalność (błąd ujawnia się bardzo rzadko, ma niską „szkodliwość”, można go w prosty sposób ominąć)

## Trudno jest zawsze jednoznacznie określić, co jest, a co nie jest błędem

Czy błąd, którego skutków nie można zaobserwować pozostaje błędem? Czy zawsze obserwowane zachowanie programu będzie przez wszystkich obserwatorów (programistów, testerów, użytkowników) zinterpretowane w taki samsposób (jakodziałanie prawidłowe albo błędne)?

# Warunki wykrycia błędu
 - Dobrze zaprojektowany test powinien wykrywać jak największą liczbę błędów
 - Aby wykryć błąd konieczne jest spełnienie trzech warunków: 
   - osiągalności miejsca błędu (reachability) – dane testowe powinny być tak dobrane, aby spowodować wykonanie instrukcji zawierającej błąd 
   - uczulenia błędu (necessity) – dane testowe powinny być tak dobrane, aby wykonanie instrukcji zawierającej błąd, spowodowało błędne wykonanie 
   - propagacji efektu błędu (propagation) – efekt błędu powinien zostać zaobserwowany, tzn. musi mieć wpływ na wynik działania programu
  - Spełnienie powyższych trzech warunków często nazywane jest warunkiem detekcji błędu (ideal fault condition)

Przykład:
```
if (x >= 0) {
  y = x * x;  // błąd – powinno być: y = x + x;
} else {
  y = 0;
}
returny >= 8;
```
x < 0 → brak osiągalności błędu

x = 0 lub x = 2 → brak uczulenia błędu

x >= 4 → brak propagacji (obserwowalności) efektu błędu

# Dokumentowanie błędnego wykonania
Każde błędne wykonanie programu powinno zostać udokumentowane przez:
 - podanie stanu początkowego wraz z sekwencją kroków, które doprowadziły do zaobserwowania błędnego wykonania programu
 - określenie, czy podana sekwencja kroków jest minimalna
 - podanie alternatywnych sekwencji kroków, dających taki sam obserwowalny skutek 
 - określenie w miarę podobnych sekwencji kroków, które nie powodują błędnego wykonania programu
 - opis środowiska, w którym uruchamiany był program
 - listę obserwacji skutków błędu (np. uszkodzonych danych)
 - opis konsekwencji błędu dla użytkownika

# Metodyka testowania oprogramowania
Elementy systematycznej metodyki procesu testowania:
 - określenie przesłanek i wymagań dotyczących generowanych testów
 - wybór strategii testowania
 - projektowanie testów (opracowanie i weryfikacja specyfikacji testów)
 - planowanie procesu testowania
 - wzbogacanie testów poprzez inspekcję kodu
 - wybranie (ewentualnie opracowanie) narzędzi wspomagających testowanie
 - implementacja testów
 - dokumentowanie testowania
 - ocena testów, identyfikowanie pominiętych przesłanek testowania wcelu udoskonalenia testów

Testowanie możemy podzielić ze względu na
 - sposób przeprowadzania testowania
 - zakres testowania
 - przeznaczenie testowania

## Podział testów ze względu na sposób ich przeprowadzenia
 - manualnie – przez testera wykonującego zaplanowaną sekwencję operacji
 - automatycznie – za pomocą odpowiednich narzędzi (testing framework), pozwalających na uruchomienie napisanych testów lub odtworzenie testów uprzednio nagranych

## Podział testów ze względu na zakres testowania
 - testy specyfikacji (specification testing) – pozwalają sprawdzić statycznie poprawność opracowanych lub dostarczonych specyfikacji (wymagań,danych, projektu)
 - testy modułów, testy jednostkowe (unit testing) – testują one system na poziomie pojedynczych funkcji (metod) 
 - testy integracyjne (integration testing) – pozwalają sprawdzić poprawność współpracy różnych komponentów składowych systemu
 - testy systemowe (system testing) – dotyczą testowania aplikacji jako całości, zwłaszcza w kontekście weryfikacji specyfikacji wymagań
 - testy akceptacyjne (acceptance testing) – służą do oceny zgodności działania programu z wymaganiami użytkownika

## Podział testów ze względu na ich przeznaczenie
 - testy funkcjonalne (functional testing) – pozwalają ocenić, czy oprogramowanie działa zgodnie ze specyfikacją
 - testy regresyjne (regression testing) – służą do sprawdzenia, czy wprowadzone w kodzie modyfikacje bądź zmiany w środowisku, nie skutkują powstaniem nowych błędów lub ujawnieniem się błędów dotychczas niewykrytych
 - testy przenaszalności/testy konfiguracji (portability/configuration testing) – pozwalają ocenić, czy oprogramowanie będzie działać na różnych platformach sprzętowych lub systemach operacyjnych
 - testy post-awaryjne (disaster recovery testing) – służą ocenie zachowania aplikacji po wystąpieniu sytuacji awaryjnej
 - testy bezpieczeństwa (safety testing) – służą ocenie bezpieczeństwa aplikacji

 ## Strategie testowania
 - Przed rozpoczęciem testowania konieczne jest przyjęcie pewnych założeń dotyczących wyboru strategii (koncepcji) testowania programu i projektowania przypadków testowych
 - Najczęściej stosowane strategie testowania:
   - testowanie funkcjonalne, zwane także testowaniem metodą „czarnej skrzynki” (black-box testing), testowaniem sterowanym danymi (data-driven testing) lub testowaniem wejścia-wyjścia (input/output testing)
   - testowanie strukturalne, zwane także testowaniem metodą „białej skrzynki” (white-box testing), metodą „szklanej skrzynki” (glass-box testing) lub testowaniem sterowanym logiką (logic-driven testing)
   - testowanie oparte na doświadczeniu (experience-based testing) 

### Testowanie funkcjonalne (black-box)
 - Podstawowym założeniem testowania funkcjonalnego jest znajomość wymagań dla testowanej funkcjonalności 
 - System traktowany jest jak „czarna skrzynka”, o której nic nie wiemy, a testowanie polega na wprowadzeniu na jej wejście danych testowych i porównaniu otrzymanych wyników zdanymi oczekiwanymi

```mermaid
graph LR
    wejście --> system
    system --> wyjście
    wejście("Dane wejściowe (testowe)")
    system("Testowany system")
    wyjście("Dane wyjściowe")
```

Techniki testowania funkcjonalnego wykorzystują:
 - podział na klasy równoważności (equivalence partitioning)
 - analizę wartości brzegowych (boundary value analysis)
 - tablice przejść stanów (state transition testing)
 - tablice decyzyjne (decision table testing) lub grafy przyczynowoskutkowe (cause-effect graphs)
 - przypadki użycia (use case testing)
 - kontrolę składni (syntax testing)
 - kombinacje par parametrów wejściowych (pairwise testing)
 - losowy lub pseudo-losowy dobór danych testowych (random testing) 

#### Klasy równoważności
Technika oparta na podziale na klasy równoważności zakłada podział dziedziny wartości danych wejściowych na skończoną liczbę podzbiorów (klas równoważności) w taki sposób, aby:
 - program zachowywał się analogicznie dla wszystkich wartości danych z tej samej klasy
 - zastąpienie testowania wszystkich wartości danych z klasy równoważności przez testowanie pojedynczej (reprezentatywnej) wartości danej z tej klasy, pozwalało na wykrycie błędu z takim samymp rawdopodobieństwem
 
Przypadki testowe projektuje się tak, aby pokrywały wszystkie możliwe scenariusze

Przykład:
>>>
„Oddział banku umożliwia podjęcie pieniędzy z rachunku klienta po okazaniu dowodu osobistego. Wypłata kwoty przekraczającej 1000 złotych wymaga weryfikacji stanu konta klienta. Kwoty wypłat przekraczające 50 000 złotych muszą zostać dodatkowo zatwierdzone przez kierownika placówki.”
>>>

Przypadki testowe: -10.00, 100.00, 1 200.00, 55 000.00

#### Wartości brzegowe
Technika oparta na analizie wartości brzegowych bada zachowanie programu dla brzegowych (granicznych) wartości danych wejściowych oraz „w pobliżu” wartości rozgraniczających klasy równoważności, wychodząc z założenia, że prawdopodobieństwo wystąpienia błędnego wykonania programu dla takich właśnie wartości jest dużo większe niż dla wartości „ze środka” klas równoważności

Przypadki testowe: -0.01, 0.00, 0.01, 999.99, 1 000.00, 1 000.01, 49 999.99, 50 000.00, 50 000.01

#### Tablice przejść stanów
Technika wykorzystująca tablice przejść między stanami służy do testowania systemów wyspecyfikowanych lub modelowanych jako maszyna stanowa Przypadki testowe projektuje się tak, aby sprawdzały osiągalność poszczególnych stanów, a także dozwolone orazniedozwolone przejścia między stanami 

Przykład

```mermaid
graph LR
    s1 -- 0 --> s1
    s2 -- 0 --> s2
    s1 -- 1 --> s2
    s2 -- 1 --> s1
    s1(("S1"))
    s2(("S2"))
```

| stan/pobudzenie | 0  | 1  |
| ---             | -- | -- |
| S1              | S1 | S2 |
| S2              | S2 | S1 |

#### Tablice decyzyjne i grafy przyczynowo-skutkowe
Technika wykorzystująca tablice decyzyjne lub grafy przyczynowo-skutkowe bada zachowanie programu dla różnych kombinacji logicznych warunków wejściowych (decyzji logicznych). Podejście to wymaga ujęcia specyfikacji działania programu jako logicznej sieci kombinatorycznej, przedstawionej albo bezpośrednio w postaci tablicy decyzyjnej, albo w postaci grafu przyczynowo-skutkowego, który następnie przekształca się w równoważną mu tablicę decyzyjną, wykorzystując tzw. technikę śledzenia wstecznego.

#### Przypadki użycia
Technika wykorzystująca przypadki użycia lub scenariusze zastosowania pozwala na tworzenie przypadków testowych na podstawie informacji o programie z punktu widzenia użytkownika. Przypadki użycia opisują interakcje między aktorami a systemem (sekwencje działań użytkowników mające określony cel biznesowy) i są użyteczne do sprawdzania poprawności działania programu, związanego z typowymi aktywnościami użytkowników (badanie przepływów, warunków początkowych i końcowych)

#### Kontrola składni
Technika wykorzystująca kontrolę składni jest użyteczna do projektowania przypadków testowych na podstawie definicji dziedziny danych wejściowych i/lub dziedziny danych wyjściowych. Kontrolę składni stosuje się najczęściej do weryfikowania poprawności danych złożonych (łańcuchy znaków, formaty plików, struktury rekordów), dla których można zdefiniować formalne reguły sprawdzania ich poprawności, np. w postaci gramatyk formalnych, wyrażeń regularnych, itp. 

#### Kombinacje par parametrów
Technika wykorzystująca kombinacje par parametrów wejściowych zakłada taki sposób projektowania przypadków testowych, aby przetestować wszystkie możliwe, dyskretne kombinacje każdej pary parametrów wejściowych. Najprostsze błędy w programie są najczęściej związane z przetwarzaniem pojedynczego parametru; drugą najczęściej występującą przyczyną najprostszych błędów są nieprawidłowe interakcje pomiędzy parami parametrów wejściowych, które można wykryć stosując tę technikę. Technika ta stanowi alternatywę dla testowania losowego oraz testowania wyczerpującego dla niewielkich problemów

#### Losowy dobór danych
Technika oparta na losowym (pseudo-losowym) doborze danych testowych wykorzystuje pseudolosowy algorytm generujący ciąg danych na podstawie pewnej uprzednio przygotowanej sekwencji lub rozkładu wartości. Podejście to jest wykorzystywane do testowania wymagań niefunkcjonalnych takich, jak wydajność lub niezawodność.
Odmianą tego typu podejścia w odniesieniu do interfejsu użytkownika jest tzw. „małpie testowanie” – metoda  testowania programu polegająca na losowym naciskaniu klawiszy oraz losowym poruszaniu i klikaniu myszką

#### Podsumowanie (black-box)
 - testy funkcjonalne są powtarzalne
 - testy funkcjonalne nadają się do wielokrotnego użycia
 - testowanie funkcjonalne można stosunkowo łatwo zautomatyzować
 - testowany jest nie tylko sam program, lecz jednocześnie środowisko, w którym się wykonuje
 - nie wszystkie aspekty działania programu można w ten sposób przetestować
 - wyniki testów mogą nie być do końca wiarygodne (niedoszacowanie liczby błędów)
 - przyczyny i lokalizacje odnalezionych błędów nie są znane

### Testowanie strukturalne (white-box)
 - Podstawowym założeniem testowania strukturalnego jest znajomość sposobu implementacji testowanych funkcji
 - Testy opracowywane są na podstawie wiedzy o kodzie źródłowym (strukturze programu), a testowanie polega na wprowadzeniu na wejście danych testowych i porównaniu otrzymanych wyników zdanymi oczekiwanymi

```mermaid
graph LR
    wejście --> system
    system --> wyjście
    wejście("Dane wejściowe (testowe)")
    system("Testowana funkcja systemu: while(true) {...}")
    wyjście("Dane wyjściowe")
```

 - Podstawowym ograniczeniem testów strukturalnych jest to, że nie są one w stanie wykryć błędów wynikających z braku funkcjonalności programu
 - Testowanie strukturalne można podzielić na:
   - testowanie dynamiczne (wymagające uruchomienia programu)
   - testowanie statyczne (nie wymagające uruchomienia programu)
 - Ogólna strategia przeprowadzania większości testów strukturalnych polega na testowaniu istniejącego kodu, aby:
   - każda instrukcja zawarta w kodzie źródłowym została wykonana co najmniej jeden raz
   - niezależnie przetestować każdą funkcję (metodę, procedurę) zdefiniowaną w kodzie źródłowym

Techniki testowania strukturalnego opierają się na analizie:
 - przepływu danych
 - pokrycia kodu
 - strukturalnej kodu

#### Analiza przepływu danych
Polega na sprawdzeniu sposobu przetwarzania danych wejściowych przez poszczególne fragmenty kodu programu (funkcje, moduły). Porównanie wartości wybranych zmiennych programu na różnych etapach przetwarzania, zwartościami oczekiwanymi lub wartościami niedozwolonymi umożliwia wykrycie iprzybliżone zlokalizowanie błędu

#### Analiza pokrycia kodu
 - Analiza służy do projektowania przypadków testowych, przeznaczonych do testowania wewnętrznej struktury programu w taki sposób, aby były one w stanie wykonać jak największą część testowanego kodu
 - Analiza pokrycia kodu może być przeprowadzana z użyciem:
   - programów śledzących (debugerów), pozwalających obserwować, które instrukcje kodu są wykonywane w trakcie przetwarzania danych testowych
   - analizatorów pokrycia kodu, które automatyzują proces zbierania informacji o pokryciu kodu przez poszczególne testy, wyświetlają szczegółowe statystyki dotyczące testowania oraz pozwalają na uzyskanie informacji, która część kodu nie została pokryta przez zastosowane testy
 - Stopień pokrycia kodu jest miarą oceny jakości zestawu testów, pozwalającą na:
   - oszacowanie, czy program został przetestowany w wystarczającym stopniu
   - znalezienie minimalnego podzbioru testów (np. do testowania regresyjnego
 - Podstawowe kryteria projektowania testów pokrycia kodu:
   - pokrycie wyrażeń (statement coverage)
   - pokrycie rozgałęzień (branch coverage)
   - pokrycie ścieżek (path coverage)
   - pokrycie decyzji (decision coverage)
   - pokrycie warunków logicznych (branch condition coverage)


##### Pokrycie wyrażeń
Test pokrycia wyrażeń (instrukcji programu) polega na takim doborze danych testowych, aby każda instrukcja wynikająca z grafu sterowania została wykonana co najmniej jeden raz. Tego typu testowanie nie bierze pod uwagę zależności instrukcji sterujących (pętle, instrukcje warunkowe, instrukcje wyboru) od przetwarzanych danych i dlatego uzyskanie w nim 100% pokrycia (tj. wykonanie każdej instrukcji programu) nie oznacza przetestowania wszystkich możliwych ścieżek wykonania programu. Jeżeli każda instrukcja znajduje się w osobnej linii kodu źródłowego, to taki test jest równoważny testowi pokrycia wierszy programu (linii kodu)

Przykład
```
  a = 10;
  if (x > 0 && y < 5) 
    y = a * x;
  else
    y = a – x;
  a += x;
```

```mermaid
graph TD
    a("a#equals;10") --> d{"x#gt;0 AND y#lt;5"}
    d -- No --> y1
    d -- Yes --> y2
    y1 --> fin
    y2 --> fin
    y1("y#equals;a-x")
    y2("y#equals;a*x")
    fin("a+#equals;x")
```

Jak dobrać dane testowe (x, y), aby uzyskać jak największe pokrycie instrukcji?

Test TC1: {x = 1 , y = 2} pokrywa instrukcje w liniach: 1, 2, 3 i 6

Test TC2: {x = 0 , y = 0} pokrywa instrukcje w liniach: 1, 2, 4, 5 i 6

Odpowiedź: Testy TC1 i TC2 pozwalają na uzyskanie 100% pokrycia instrukcji

##### Pokrycie rozgałęzień

Test pokrycia rozgałęzień polega na takim doborze danych testowych, aby wykonać co najmniej jeden raz każdą krawędź w grafie przepływu sterowania (tzn. zapewnić przejście przez wszystkie możliwe rozgałęzienia wynikające z instrukcji warunkowych, pętli oraz instrukcji wyboru). Każde rozgałęzienie w grafie sterowania traktowane jest w tym teście niezależnie od pozostałych. Wynikiem instrukcji warunkowej i instrukcji pętli są dwa rozgałęzienia, zaś instrukcji wyboru tyle rozgałęzień, ile jest możliwych opcji wyboru. Test pokrycia rozgałęzień stanowi uogólnienie testu pokrycia wyrażeń.

Przykład
```
  a = -1;
  if (x > 0) 
    a = 5;
  if (y < 9)
    a = 0
  else
    a += 10
```

```mermaid
graph TD
    a("a#equals;-1") --> d1{"x#gt;0"}
    d1 -- No --> d2("y#lt;9")
    d1 -- Yes --> a2("a#equals;5")
    a2 --> d2
    d2 -- No --> a3("a+#equals;10")
    d2 -- Yes --> a4("a#equals;0")
    a3 --> fin
    a4 --> fin
    fin((""))
```


# Literatura
 - Ron Patton, Testowanie oprogramowania, MIKOM, 2002
 - Glenford J. Myers, et al, Sztuka testowania oprogramowania, Helion, 2005
 - Dick Hamlet, Joe Maybee, Podstawy techniczne inżynierii oprogramowania, WNT, 2003
 - Robert V. Binder, Testowanie systemów obiektowych. Modele, wzorce, narzędzia, WNT, 2003 
 - Janusz Sosnowski, Testowanie i niezawodność systemów komputerowych, EXIT, 2005 
 - Kent Beck, Test-Driven Development by example , AddisonWesley Professional, 2003