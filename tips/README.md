

# Co z tym IT?
Co ja robię na SPIO?

# Oragnizacja pracy, zarządzanie projektem

## SCRUM
https://www.scrumguides.org/scrum-guide.html

## Narzędzia zadaniowe
 - JIRA
 - Kanbanflow.com
 - Trello
 - Asana

## Organizacja wiedzy
 - Confluence/wiki
 - GDocs/GDrive
 - git + markdown

# Proces wytwórczy

## Przeglądy kodu
Są nieodłącznym elementem procesu wytwórczego i stanowią znaczący wkład do zapewniania jakości kodu. Wszystkie wiodące serwisy dostarczające repozytoria kodu jednocześnie udostępniają narzędzia do przeglądów on-line.

## CI/CD
Continuous integration, delivery i deployment.
https://www.atlassian.com/continuous-delivery/principles/continuous-integration-vs-delivery-vs-deployment

W wersji minimum jest to automatyczne budowanie i testowanie aplikacji przy operacji merge oraz przy wypchnięciu zmian do przeglądu.

Popularne narzędzia:
 - Jenkins
 - Bamboo
 - Travis
 - CircleCI
 - gitlab

# Knowledge sharing
Siłą środowiska programistycznego i testerskiego jest dzielenie się wiedzą. Zwracam uwagę na trzy aspekty:
 - open source - czyli otwarte oprogramowanie, z reguły dostępne nieodpłatnie. Świat jest pełen świetnego kodu dostępnego od ręki. Zawsze warto poszukać, czy ktoś nie napisał już potrzebnej biblioteki. Jeśli stworzymy coś dobrego, publiczne repozytoria kodu to świetny pomysł, żeby się podzielić oraz przy okazji podnieść swoją atrakcyjność rynkową.
 - spotkania i wydarzenia branżowe - nie trzeba od razu jechać na zagraniczną konferencję, ale można spróbować zaliczyć lokalne wydarzenia organizowane przez pajonatów. https://www.meetup.com/
 - jeśli twojego problemu nie ma na https://stackoverflow.com/ to opcje są dwie:
   - problem nie istnieje,
   - jesteś bardzo głęboko w kropce ;-)

## Plus atrakcyjność na rynku pracy
 - w IT liczą się umiejętności, wykształcenie jest miłym dodatkiem,
 - nie musisz wiedzieć wszystkiego, ale musisz umieć się szybko uczyć,
 - znajomość podstawowego procesu, SCRUMa,
 - należy znać podstawy:
   - podstawowe algorytmy i struktury danych,
   - jakiś język programowania?
   - jakieś środowisko programistyczne,
   - git,
 - dzielenie się wiedzą, profil github/gitlab, udział w otwartym projekcie, udział w spotkaniach to solidne plusy,
 - praca własna to podstawa.

# Rodzaje aplikacji, oprogramowania
 - desktop
 - web, rwd, spa
 - mobile/native/webview
 - frontend/backend
 - sass/pass
 - ...

# Języki programowania
 - Backend:
   - Java
   - Kotlin
   - Scala
   - Ruby
   - PHP
   - Python
   - JS/Node
   - ...
 - Frontend:
   - JS/TS
   - HTML/SCSS

# Biblioteki i frameworki
 - Backend:
   - Spring/Boot/Java/Kotlin
   - Micronaut/Java/Kotlin
   - Ruby on Rails
   - NestJS/NodeJS
   - ...
 - Frontend:
   - ReactJS
   - AngularJS
   - VueJS
   - ...
 - Testerskie:
   - JUnit
   - Spring internals
   - TestNG
   - Mockito
   - AssertJ
   - Karma/Jasmine
   - Jest
   - ...

## Związane z paczkowaniem aplikacji
- mvn
- gradle
- npm/yarn
- ...

# Narzędzia programistyczne i testerskie
**Know your tools!**

## GIT
Korzystanie z repozytorium kodu to konieczność. Testerzy też powinni wiedzieć do czego służy git.
 - https://mukul-rathi.github.io/git-beginner-cheatsheet/
 - https://rachelcarmena.github.io/2018/12/12/how-to-teach-git.html

Popularni dostawcy:
 - https://github.com/
 - https://gitlab.com/
 - https://bitbucket.org/product/

## IDE
Wybór środowiska jest podyktowany w pierwszej kolejności wspieranym zakresem technologii. Często firmy informatyczne korzystają z jednego zbioru narzędzi komercyjnych, narzucając wybór pracownikom. Jeśli nie wiesz co wybrać, to bierz to co jest popularne na rynku - łatwo znajdziesz rozwiązania typowych problemów.

 - IntelliJ - Java, wersja Ultimate takze technologie web (type script, java script, html, scss)
 - VS Code - Java, Python, TypeScript, wiele innych popularnych języków oraz frameworków. Narzędzie jest darmowe i działa na wszystkich popularnych systemach operacyjnych.
 - vi - dla prawdziwych twardzieli ;-)
 - Eclipse - wsparcie wielu języków, dalej popularny wybór wśród programistów.

Jeśli nie wiesz co wybrać, to VS Code i plugin do wybranego języka będzie niezłą opcją.

## System operacyjny
Można pracować na dowolnym systemie, wszystko sprowadza się do rozumienia specyficznego ekosystemu aplikacji pomocniczych - niektóre narzędzia są wprost przenośne, inne nie. Każdy system ma swoje specyficzne cechy, wady i zalety. Należy je znać, żeby dostosować swoją maszynę do wydajnej pracy.

### Terminal i konsola
Każdy początkujący adept sztuki komputerowej podchodzi z rezerwą do konsoli, ale to właśnie konsola pozwala robić pewne operacje w sposób wydajny, zautomatyzowany i przenośny. Konsola i skrypty powłoki to potężne narzędzia w pracy testera i programisty.

 - Linux, MacOS - konsola sh, bash, zsh lub podobna, popularny i domyślny wybór do pisania skryptów; skrypty z tych środowisk mogą być przydatne także w środowisku Windows,
 - Windows:
   - CMD - domyślna konsola nie pozwala na zbyt wiele, nieprzydatna,
   - PowerShell -  na pewno jest power, ale zdaje się że tylko w środowisku Windows,
   - alternatywy bashowe:
      - https://www.cygwin.com/
      - git bash, czyli powłoka która przychodzi wraz z instalacją gita
      - Windows Linux Subsystem - czyli Linux na Windows. Działa, można korzystać

## Narzędzia testerskie
Czynnikiem decydującym jest rodzaj testowanego oprogramowania, więc poniższy przegląd jest bardzo orientacyjny i ma podłoże webowe:
 - curl i wget - wysyłanie żądań z konsoli,
 - SoapUI - aplikacja desktop do testowania komunikacji webowej, w szczególności SOAP. Można używać zamiennie z curl,
 - https://www.browserstack.com/
 - dev tools przeglądarki
 - dedykowane dodatki do przeglądarki

## DevOps
Czyli programiści i administratorzy w jednym worku. Tworzenie oprogramowania bliskie jego osadzaniu/instalacji/dostarczaniu. Dużo zależy od przyjętego modelu instalacji systemu, na pewno można rozważać fizyczne serwery, maszyny wirtualne czy kontenery. Zależnie od używanych platform i systemów operacyjnych warto znać narzędzia do zdalnego dostępu:
 - ssh/scp, PuTTY
 - vnc
 - remote desktop

Już w ramach konkretnego serwera należy umieć poruszać się po systemie plików, uruchamiać komendy czy dedykowane oprogramowanie związane z monitorowaniem czy przeglądaniem. Dla systemów linux i podobnych:
 - cd, mv, rm, touch, mkdir, pushd, popd, ls, pwd
 - cat, head, tail, less, vi
 - chmod, chown, sudo
 - ping, curl, wget
 - man

### Automatyzacja instalacji - ansible
https://docs.ansible.com/ansible/latest/user_guide/playbooks_intro.html#playbook-language-example

### Konteneryzacja - docker
https://docs.docker.com/get-started/part2/

# Let's get it started
