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

