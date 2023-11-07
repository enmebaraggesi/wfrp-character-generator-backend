# Generator postaci dla Warhammer Fantasy Roleplay 4E

### O projekcie
Zapraszam do zapoznania się z moim finalnym projektem bootcampu Java Plus w Kodilli.
Dalej będę posługiwał się określeniem ***generator*** zamiennie z ***projekt***.

W tej chwili czytasz opis części backendowej generatora.
Część frontendową (przygotowaną we frameworku Vaadin) znajdziesz pod linkiem:
[KLIKNIJ TUTAJ!](https://github.com/enmebaraggesi/wfrp-character-generator-frontend)


### Jak uruchomić program?
_UWAGA! Projekt wciąż jest w budowie. W przyszłości chciałbym zapewnić mu bardziej "przyjazny użytkownikowi" sposób uruchamiania._

Potrzebujesz pobrać obie części projektu:
1. [backendową](https://github.com/enmebaraggesi/wfrp-character-generator-backend)
2. [frontendową](https://github.com/enmebaraggesi/wfrp-character-generator-frontend)

Następnie otwórz terminal i wpisz komendę przejścia do głównego katalogu projektu.
U mnie wygląda ona tak (podaję komendy dla Windowsa):
```
cd "C:\wfrp-character-generator-backend\wfrp"
```
Gdzie:
```
cd "[LITERA_DYSKU]:\[FOLDER_PROJEKTU]\[FOLDER_GŁÓWNY_PAKIETU]"
```
Pamiętaj, że Twoja ścieżka do mojego projektu może się różnić w zależności od tego gdzie ją umieściłeś.
Następnie sprawdź, czy posiadasz zainstalowany Gradle na swoim systemie. Możesz to zrobić otwierając terminal i wpisując:
```
gradle -v
```
Jeśli pojawi ci się opis wersji Gradle, możesz przejść dalej. Jeśli nie, udaj się pod [ten link](https://gradle.org/install/#helpful-information) i postępuj zgodnie z wytycznymi, aby poprawnie zainstalować aktualny Gradle.
Mając pewność co do posiadanego Gradle na swoim systemie i będąc w terminalu pod ścieżką do mojego projektu wpisz:
```
.\gradlew bootRun
```
Udało się! Warstwa backend już pracuje.

Teraz przejdźmy do uruchomienia warstwy frontend. Zalecam otworzyć nową etykietę w terminalu i wpisać:
```
cd "C:\wfrp-character-generator-frontend\wfrpFrontend"
```
Pamiętaj, że Twoja ścieżka do mojego projektu może się różnić w zależności od tego gdzie ją umieściłeś.
Ponownie wpisz:
```
.\gradlew bootRun
```
I voila! Warstwa frontendowa też już powinna działać. To wszystko w kwestii uruchomienia generatora.


### Jak korzystać z generatora?
Aby dostać się do generatora, wystarczy że wpiszesz w swojej przeglądarce:
```
http://localhost:8081
```

Oprowadzę cię po poszczególnych elementach generatora.
![Obraz przedstawiający część opisującą postać](https://snipboard.io/Z47QvW.jpg)

- **IMIĘ** - pole uzupełnia się samodzielnie dzięki generatorowi po wybraniu rasy, aczkolwiek możesz wpisać dowolną nazwę swojej postaci. Póki co generuje wyłącznie ludzkie imiona. Docelowo chciałbym, żeby generator tworzył imiona odmienne dla każdej z ras.
- **RASA** - pole zawiera dostępne rasy w generatorze. Wybierając jakąś, program wygeneruje imię (na razie ludzkie), wiek oraz wzrost (zależne od rasy), a także zmieni dostępne kolory oczu i włosów. Docelowo chciałbym, aby generator decydował także o dostępnych profesjach dla każdej z ras, a także uzupełniał umiejętności i talenty w zgodzie z podręcznikiem.
- **KLASA** - pole uzupełnia się samodzielnie po wybraniu profesji. Jest ono w pełni zależne od wybranej profesji.
- **PROFESJA** - pole zawiera wszystkie dostępne profesje. Wybierając jakąś, program uzupełni klasę i status postaci. Docelowo chciałbym, aby generator wybierał także umiejętności zależne od profesji, przydzielał początkowe punkty rozwoju i ekwipunek.
- **STATUS** - pole uzupełnia się samodzielnie po wybraniu profesji. Jest ono w pełni zależne od wybranej profesji.
- **WIEK** - pole uzupełnia się samodzielnie po wybraniu rasy. Jest ono w pełni zależne od wybranej rasy ale docelowo będzie możliwe również jego edytowanie.
- **WZROST** - pole uzupełnia się samodzielnie po wybraniu rasy. Jest ono w pełni zależne od wybranej rasy ale docelowo będzie możliwe również jego edytowanie.
- **KOLOR OCZU** - pole daje różnorodny wybór po wybraniu rasy. Jest ono w pełni zależne od wybranej rasy.
- **KOLOR WŁOSÓW** - pole daje różnorodny wybór po wybraniu rasy. Jest ono w pełni zależne od wybranej rasy.

![Obraz przedstawiający część atrybutów postaci](https://snipboard.io/cuXADO.jpg)

- **CECHY**
  - **Początkowe** - pola uzupełniane są w sposób losowy od 1 do 60 ale docelowo mają być uzależnione od wyboru rasy dla każdej cechy.
  - **Rozwinięcia** - wpisując zakupione rozwinięcia do postaci wpływamy na zwiększenie aktualnej ich wartości. Docelowo chciałbym aby początkowe rozwinięcia uzupełniały się wraz z generowaniem postaci.
  - **Aktualne** - pola niedostępne dla użytkownika, przedstawiają sumę początkowych wartości cech z rozwinięciami.
- **BOHATER**
  - **Punkty Bohatera i Determinacji** - pola są uzupełniane w sposób losowy od 0 do 2 ale docelowo mają być uzależnione od wyboru rasy.
- **PRZEZNACZENIE**
  - **Punkty Przeznaczenia i Szczęścia** - pola są uzupełniane w sposób losowy od 0 do 2 ale docelowo mają być uzależnione od wyboru rasy.
- **SZYBKOŚĆ**
  - **Szybkość, Chód, Bieg** - pole szybkości przyjmuje uniwersalną wartość 4 (dla człowieka i podobnego wzrostu istot) ale docelowo ma być uzależnione od wyboru rasy. Pozostałe pola są dwukrotnością poprzedniego zgodnie z podręcznikiem.

![Obraz przedstawiający część umiejętności postaci](https://snipboard.io/7YLsnQ.jpg)

- **UMIEJĘTNOŚCI PODSTAWOWE**
  - **Nazwa** - na stałe przypisane nazwy umiejętności podstawowych dostępnych dla każdej postaci.
  - **Cecha** - nazwy skrócone odpowiadającej cesze dla umiejętności oraz pola, które są uzupełniane w zależności od wartości cech.
  - **Roz** - pola rozwinięć, które można uzupełniać po ich wykupieniu. Ich wpisanie i zatwierdzenie powoduje zwiększenie sumy poziomu umiejętności. Docelowo będą uzupełniane podczas darmowego rozwoju postaci przy wyborze profesji.
  - **Suma** - pola niedostępne dla użytkownika, przedstawiają sumę początkowych wartości umiejętności z rozwinięciami.
- **UMIEJĘTNOŚCI ZAAWANSOWANE**
  - **Nazwa** - pole zawiera wszystkie dostępne umiejętności zaawansowane. Po wyborze którejś z nich pozostałe pola są uzupełniane w zgodzie z pożądanymi wartościami.
  - **Cecha** - pola nazwy skróconej cech oraz pola wartości odpowiadającej cechy. Oba pola są uzupełniane podczas wyboru nazwy umiejętności.
  - **Roz** - pola rozwinięć, które można uzupełniać po ich wykupieniu. Ich wpisanie i zatwierdzenie powoduje zwiększenie sumy poziomu umiejętności. Docelowo będą uzupełniane podczas darmowego rozwoju postaci przy wyborze profesji.
  - **Suma** - pola niedostępne dla użytkownika, przedstawiają sumę początkowych wartości umiejętności z rozwinięciami.

![Obraz przedstawiający część broni i pancerza postaci](https://snipboard.io/7gIHkM.jpg)

- **BROŃ**
  - **Nazwa** - pole zawierające nazwy wszystkich rodzajów uzbrojenia. Ich wybór powoduje uzupełnienie odpowiednimi wartościami następnych pól.
  - **Kategoria** - pole kategorii broni uzupełnia się samodzielnie po wyborze broni.
  - **Waga** - pole uzupełnia się samodzielnie po wyborze broni. Docelowo chciałbym zamieścić licznik obciążenia postaci sugerujący kary ponoszone za przeciążenie.
  - **Zasięg** - pole uzupełnia się samodzielnie po wyborze broni.
  - **Obrażenia** - pole uzupełnia się samodzielnie po wyborze broni. Docelowo chciałbym zamieścić licznik możliwych i średnich obrażeń przy każdej broni.
  - **Cechy** - pole cech broni, uzupełnia się samodzielnie po wyborze broni. Docelowo chciałbym, aby każda cecha miała możliwość podświetlenia i wyświetlenia opisu.
- **PANCERZ**
  - **Nazwa** - pole zawierające nazwy wszystkich rodzajów pancerza. Ich wybór powoduje uzupełnienie odpowiednimi wartościami następnych pól.
  - **Lokacja** - pole części ciała, której dotyczy pancerz. Pole uzupełnia się samodzielnie po wyborze pancerza.
  - **Waga** - pole uzupełnia się samodzielnie po wyborze pancerza. Docelowo chciałbym zamieścić licznik obciążenia postaci sugerujący kary ponoszone za przeciążenie.
  - **Kary** - pole kar ponoszonych przez postać z powodu pancerza. Uzupełnia się po wyborze pancerza.
  - **P.panc.** - pole uzupełnia się samodzielnie po wyborze pancerza. Chciałbym, aby docelowo istniał szkic postaci, na którym będą wyświetlane sumy punktów pancerza w danej części ciała.
  - **Cechy** - pole cech pancerza, uzupełnia się samodzielnie po wyborze pancerza. Docelowo chciałbym, aby każda cecha miała możliwość podświetlenia i wyświetlenia opisu.
