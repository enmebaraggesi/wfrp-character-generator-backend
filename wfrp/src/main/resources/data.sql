#  wybór rasy
CREATE TABLE IF NOT EXISTS RACES_ROLL
(
    ID         INT AUTO_INCREMENT PRIMARY KEY,
    NAME       VARCHAR(255) NOT NULL,
    CHANCE_MIN INT          NOT NULL,
    CHANCE_MAX INT          NOT NULL
);

INSERT INTO RACES_ROLL (NAME, CHANCE_MIN, CHANCE_MAX)
VALUES ('Człowiek', 1, 90),
       ('Niziołek', 91, 94),
       ('Krasnolud', 95, 98),
       ('Wysoki elf', 99, 99),
       ('Leśny elf', 100, 100);
COMMIT;

# wybór profesji
CREATE TABLE IF NOT EXISTS PROFESSIONS_ROLL
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    CLASS       VARCHAR(255) NOT NULL,
    NAME        VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT,
    HU_MIN      INT,
    HU_MAX      INT,
    DW_MIN      INT,
    DW_MAX      INT,
    HAL_MIN     INT,
    HAL_MAX     INT,
    H_ELF_MIN   INT,
    H_ELF_MAX   INT,
    W_ELF_MIN   INT,
    W_ELF_MAX   INT
);

INSERT INTO PROFESSIONS_ROLL (CLASS, NAME, DESCRIPTION, HU_MIN, HU_MAX, DW_MIN, DW_MAX, HAL_MIN, HAL_MAX, H_ELF_MIN,
                              H_ELF_MAX, W_ELF_MIN, W_ELF_MAX)
VALUES ('UCZENI', 'APTEKARKA', '', 1, 1, 1, 1, 1, 1, 1, 2, NULL, NULL),
       ('UCZENI', 'CZARODZIEJ', '', 2, 2, NULL, NULL, NULL, NULL, 3, 6, 1, 4),
       ('UCZENI', 'INŻYNIER', '', 3, 3, 2, 4, 2, 2, NULL, NULL, NULL, NULL),
       ('UCZENI', 'KAPŁAN', '', 4, 8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('UCZENI', 'MEDYK', '', 9, 9, 5, 5, 3, 4, 7, 8, NULL, NULL),
       ('UCZENI', 'MNICH', '', 10, 11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('UCZENI', 'PRAWNIK', '', 12, 12, 6, 7, 5, 6, 9, 12, NULL, NULL),
       ('UCZENI', 'UCZONY', '', 13, 14, 8, 9, 7, 8, 13, 16, 5, 5),
       ('MIESZCZANIE', 'AGITATOR', '', 15, 15, 10, 11, 9, 10, NULL, NULL, NULL, NULL),
       ('MIESZCZANIE', 'KUPIEC', '', 16, 16, 12, 15, 11, 14, 17, 21, NULL, NULL),
       ('MIESZCZANIE', 'MIESZCZANIN', '', 17, 19, 16, 21, 15, 17, 22, 23, NULL, NULL),
       ('MIESZCZANIE', 'RZEMIEŚLNIK', '', 20, 21, 22, 27, 18, 22, 24, 26, 06, 10),
       ('MIESZCZANIE', 'STRAŻNIK', '', 22, 22, 28, 30, 23, 24, 27, 27, NULL, NULL),
       ('MIESZCZANIE', 'SZCZUROŁAP', '', 23, 24, 31, 31, 25, 27, NULL, NULL, NULL, NULL),
       ('MIESZCZANIE', 'ŚLEDCZY', '', 25, 25, 32, 33, 28, 29, 28, 29, NULL, NULL),
       ('MIESZCZANIE', 'ŻEBRAK', '', 26, 27, 34, 34, 30, 33, NULL, NULL, NULL, NULL),
       ('DWORZANIE', 'ARTYSTA', '', 28, 28, 35, 35, 34, 35, 30, 30, 11, 14),
       ('DWORZANIE', 'DORADCA', '', 29, 29, 36, 37, 36, 36, 31, 32, 15, 18),
       ('DWORZANIE', 'NAMIESTNIK', '', 30, 30, 38, 39, 37, 38, 33, 34, NULL, NULL),
       ('DWORZANIE', 'POSEŁ', '', 31, 31, 40, 41, 39, 39, 35, 37, 19, 25),
       ('DWORZANIE', 'SŁUŻĄCY', '', 32, 34, 42, 42, 40, 45, NULL, NULL, NULL, NULL),
       ('DWORZANIE', 'SZLACHCIC', '', 35, 35, 43, 43, NULL, NULL, 38, 40, 26, 31),
       ('DWORZANIE', 'SZPIEG', '', 36, 36, 44, 44, 46, 46, 41, 43, 32, 35),
       ('DWORZANIE', 'ZWADŹCA', '', 37, 37, 45, 45, NULL, NULL, 44, 45, NULL, NULL),
       ('POSPÓLSTWO', 'CHŁOP', '', 38, 42, 46, 46, 47, 49, NULL, NULL, NULL, NULL),
       ('POSPÓLSTWO', 'GÓRNIK', '', 43, 43, 47, 51, 50, 50, NULL, NULL, NULL, NULL),
       ('POSPÓLSTWO', 'GUŚLARZ', '', 44, 44, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('POSPÓLSTWO', 'ŁOWCZY', '', 45, 46, 52, 53, 51, 52, 46, 48, 36, 45),
       ('POSPÓLSTWO', 'MISTYK', '', 47, 47, NULL, NULL, NULL, NULL, NULL, NULL, 46, 50),
       ('POSPÓLSTWO', 'ZARZĄDCA', '', 48, 48, 54, 55, 53, 53, NULL, NULL, NULL, NULL),
       ('POSPÓLSTWO', 'ZIELARZ', '', 49, 49, NULL, NULL, 54, 56, 49, 50, 51, 57),
       ('POSPÓLSTWO', 'ZWIADOWCA', '', 50, 50, 56, 56, 57, 57, 51, 56, 58, 68),
       ('WĘDROWCY', 'BICZOWNIK', '', 51, 52, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'DOMOKRĄŻCA', '', 53, 53, 57, 58, 58, 59, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'KUGLARZ', '', 54, 55, 59, 60, 60, 62, 57, 59, 69, 73),
       ('WĘDROWCY', 'ŁOWCA CZAROWNIC', '', 56, 56, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'ŁOWCA NAGRÓD', '', 57, 57, 61, 64, 63, 63, 60, 62, 74, 75),
       ('WĘDROWCY', 'POSŁANIEC', '', 58, 58, 65, 66, 64, 65, 63, 63, 76, 78),
       ('WĘDROWCY', 'STRAŻNIK DRÓG', '', 59, 59, NULL, NULL, 66, 66, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'WOŹNICA', '', 60, 60, 67, 67, 67, 68, NULL, NULL, NULL, NULL),
       ('WODNIACY', 'DOKER', '', 61, 62, 68, 69, 69, 71, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'FLISAK', '', 63, 65, 70, 71, 72, 74, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'PILOT RZECZNY', '', 66, 66, 72, 72, 75, 75, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'PIRAT RZECZNY', '', 67, 67, 73, 73, NULL, NULL, NULL, NULL, 79, 79),
       ('WĘDROWCY', 'PRZEMYTNIK', '', 68, 68, 74, 75, 76, 79, 64, 64, NULL, NULL),
       ('WĘDROWCY', 'PRZEWOŹNIK', '', 69, 70, 76, 77, 80, 80, 65, 65, NULL, NULL),
       ('WĘDROWCY', 'STRAŻNIK RZECZNY', '', 71, 72, NULL, NULL, 81, 81, NULL, NULL, NULL, NULL),
       ('WĘDROWCY', 'ŻEGLARZ', '', 73, 74, 78, 78, 82, 82, 66, 80, NULL, NULL),
       ('ŁOTRY', 'BANITA', '', 75, 78, 79, 81, 83, 83, 81, 83, 80, 85),
       ('ŁOTRY', 'CZAROWNIK', '', 79, 79, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('ŁOTRY', 'HIENA CMENTARNA', '', 80, 80, 82, 82, 85, 85, NULL, NULL, NULL, NULL),
       ('ŁOTRY', 'PASER', '', 81, 81, NULL, NULL, 84, 84, NULL, NULL, NULL, NULL),
       ('ŁOTRY', 'RAJFUR', '', 82, 83, NULL, NULL, 86, 88, 84, 85, NULL, NULL),
       ('ŁOTRY', 'REKIETER', '', 84, 84, 83, 83, 89, 89, NULL, NULL, NULL, NULL),
       ('ŁOTRY', 'SZARLATAN', '', 85, 85, NULL, NULL, 90, 90, 86, 88, NULL, NULL),
       ('ŁOTRY', 'ZŁODZIEJ', '', 86, 88, 84, 84, 91, 94, NULL, NULL, NULL, NULL),
       ('WOJOWNICY', 'GLADIATOR', '', 89, 89, 85, 87, 95, 95, 89, 90, 86, 87),
       ('WOJOWNICY', 'KAPŁAN BITEWNY', '', 90, 90, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
       ('WOJOWNICY', 'KAWALERZYSTA', '', 91, 92, NULL, NULL, NULL, NULL, 91, 94, 88, 92),
       ('WOJOWNICY', 'OCHRONIARZ', '', 93, 94, 88, 90, 96, 97, 95, 96, 93, 94),
       ('WOJOWNICY', 'OPRYCH', '', 95, 95, 91, 93, NULL, NULL, 97, 97, NULL, NULL),
       ('WOJOWNICY', 'RYCERZE', '', 96, 96, NULL, NULL, NULL, NULL, 98, 98, 95, 96),
       ('WOJOWNICY', 'ZABÓJCA', '', NULL, NULL, 94, 97, NULL, NULL, NULL, NULL, NULL, NULL),
       ('WOJOWNICY', 'ŻOŁNIERZ', '', 97, 100, 98, 100, 98, 100, 99, 100, 97, 100);
COMMIT;

# losowanie atrybutów
# ustalenie punktów przeznaczenia, szczęścia, bohatera, determinacji
# ustalenie szybkości
# rozdzielenie 5 rozwinięć na 3 cechy z profesji

# przypisanie umiejętności i talentów rasowych
# pomiędzy 8 umiejętności profesji można rozdysponować 40 rozwinięć
CREATE TABLE IF NOT EXISTS SKILLS
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    NAME        VARCHAR(255) NOT NULL,
    ATTRIBUTE   VARCHAR(3)   NOT NULL,
    IS_ADVANCED BOOLEAN      NOT NULL,
    IS_GROUP    BOOLEAN      NOT NULL,
    DESCRIPTION TEXT
);

INSERT INTO SKILLS (NAME, ATTRIBUTE, IS_ADVANCED, IS_GROUP, DESCRIPTION)
VALUES ('Atletyka', 'Zw', FALSE, FALSE, ''),
       ('Badania Naukowe', 'Int', TRUE, FALSE, ''),
       ('Broń Biała', 'WW', FALSE, TRUE, ''),
       ('Broń Zasięgowa', 'US', TRUE, TRUE, ''),
       ('Charyzma', 'Ogd', FALSE, FALSE, ''),
       ('Dowodzenie', 'Ogd', FALSE, FALSE, ''),
       ('Hazard', 'Int', FALSE, FALSE, ''),
       ('Intuicja', 'I', FALSE, FALSE, ''),
       ('Jeździectwo', 'Zw', FALSE, TRUE, ''),
       ('Język', 'Zw', TRUE, TRUE, ''),
       ('Kuglarstwo', 'Ogd', FALSE, FALSE, ''),
       ('Leczenie', 'Int', TRUE, FALSE, ''),
       ('Mocna Głowa', 'Wt', FALSE, FALSE, ''),
       ('Modlitwa', 'Ogd', TRUE, FALSE, ''),
       ('Muzyka', 'Zr', TRUE, TRUE, ''),
       ('Nawigacja', 'I', FALSE, FALSE, ''),
       ('Odporność', 'Wt', FALSE, FALSE, ''),
       ('Opanowanie', 'SW', FALSE, FALSE, ''),
       ('Opieka nad Zwierzętami', 'Int', TRUE, FALSE, ''),
       ('Oswajanie', 'SW', FALSE, FALSE, ''),
       ('Otwieranie Zamków', 'Zr', TRUE, FALSE, ''),
       ('Percepcja', 'I', FALSE, FALSE, ''),
       ('Plotkowanie', 'Ogd', FALSE, FALSE, ''),
       ('Pływanie', 'S', TRUE, FALSE, ''),
       ('Powożenie', 'Zw', FALSE, FALSE, ''),
       ('Przekupstwo', 'Ogd', FALSE, FALSE, ''),
       ('Rzemiosło', 'Zr', TRUE, TRUE, ''),
       ('Sekretne Znaki', 'Int', TRUE, TRUE, ''),
       ('Skradanie', 'Zw', FALSE, TRUE, ''),
       ('Splatanie Magii', 'SW', TRUE, TRUE, ''),
       ('Sztuka', 'Zr', FALSE, TRUE, ''),
       ('Sztuka Przetrwania', 'Int', FALSE, FALSE, ''),
       ('Targowanie', 'Ogd', FALSE, FALSE, ''),
       ('Tresura', 'Int', TRUE, TRUE, ''),
       ('Tropienie', 'I', TRUE, FALSE, ''),
       ('Unik', 'Zw', FALSE, FALSE, ''),
       ('Wiedza', 'Int', TRUE, TRUE, ''),
       ('Wioślarstwo', 'S', FALSE, FALSE, ''),
       ('Wspinaczka', 'S', FALSE, FALSE, ''),
       ('Wycena', 'Int', TRUE, FALSE, ''),
       ('Występy', 'Ogd', FALSE, TRUE, ''),
       ('Zastawianie Pułapek', 'Zr', TRUE, FALSE, ''),
       ('Zastraszanie', 'S', FALSE, FALSE, ''),
       ('Zwinne Palce', 'Zr', TRUE, FALSE, ''),
       ('Żeglarstwo', 'Zw', TRUE, TRUE, '');
COMMIT;

CREATE TABLE IF NOT EXISTS TALENTS
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    NAME        VARCHAR(255) NOT NULL,
    MAX_VALUE   INT,
    BONUS       VARCHAR(3),
    TESTED      VARCHAR(255),
    DESCRIPTION TEXT
);

# MAX_VALUE -1 = brak, 0 = bonus, 1+ = sztywna
INSERT INTO TALENTS (NAME, MAX_VALUE, BONUS, TESTED, DESCRIPTION)
VALUES ('Aptekarz', 0, 'Int', 'Rzemiosło (Aptekarstwo)', ''),
       ('Arcydzieło', NULL, NULL, NULL, ''),
       ('Artylerzysta', 0, 'Zr', 'Przeładowanie (Broń Prochowa)', ''),
       ('Atak Wyprzedzający', 0, 'I', 'Walka (Inicjatywa)', ''),
       ('Atrakcyjny', 0, 'Ogd', 'Wywieranie wpływu (Charyzma)', ''),
       ('Bardzo Silny', 1, NULL, NULL, ''),
       ('Bardzo Szybki', 1, NULL, NULL, ''),
       ('Berserkerska Szarża', 0, 'S', 'Walka (Szarża)', ''),
       ('Biczownik', 0, 'Wt', 'Opieranie się (Chaos)', ''),
       ('Bitewna Furia', 0, 'SW', 'Walka (Szał Bitewny)', ''),
       ('Bitewny Refleks', 0, 'I', NULL, ''),
       ('Błękitna Krew', 1, NULL, 'Wywieranie wpływu', ''),
       ('Błogosławieństwo (Boska tradycja)', 1, NULL, NULL, ''),
       ('Błyskawiczny Strzał', 0, 'Zw', 'Walka (Broń Zasięgowa)', ''),
       ('Błyskotliwość', 1, NULL, NULL, ''),
       ('Celny Strzał', 0, 'US', NULL, ''),
       ('Charyzmatyczny', 1, NULL, NULL, ''),
       ('Chirurgia', 0, 'Int', 'Leczenie', ''),
       ('Chodu!', 0, 'Zw', 'Ucieczka (Atletyka)', ''),
       ('Cień', 0, 'Zw', 'Śledzenie', ''),
       ('Cios Mierzony', 0, 'I', 'Walka', ''),
       ('Cios Poniżej Pasa', 0, 'WW', 'Broń Biała (Bijatyka)', ''),
       ('Czarownica!', 0, 'SW', NULL, ''),
       ('Człowiek Guma', 0, 'Zw', 'Zwinność/Kuglarstwo', ''),
       ('Czujny', 1, NULL, NULL, ''),
       ('Czysta Dusza', 0, 'SW', 'Zepsucie', ''),
       ('Czytanie z Ruchu Warg', 0, 'I', 'Percepcja', ''),
       ('Czytanie/Pisanie', 1, NULL, NULL, ''),
       ('Defraudant', 0, 'Int', 'Defraudacja (Inteligencja)', ''),
       ('Dobrze Przygotowany', 0, 'I', NULL, ''),
       ('Doświadczony Wędrowiec (Wybrany teren)', 0, 'Zw', 'Podróż (Atletyka)', ''),
       ('Dwie Bronie', 0, 'Zw', 'Walka (Broń Biała lub Zasięgowa)', ''),
       ('Etykieta (Grupa społeczna)', 0, 'Ogd', 'Charyzma/Plotkowanie', ''),
       ('Finta', 0, 'WW', 'Broń Biała (Szermiercza)', ''),
       ('Gadanina', 0, 'Ogd', 'Charyzma', ''),
       ('Geniusz Arytmetyczny', 0, 'Int', 'Wycena/Hazard', ''),
       ('Gładkie Słówka', 0, 'Ogd', 'Kłamstwo (Charyzma)', ''),
       ('Groźny', 0, 'S', 'Zastraszanie', ''),
       ('Hulaka', 0, 'Wt', 'Przyjęcia (Charyzma/Plotkowanie/Mocna Głowa)', ''),
       ('Inspirujący', 0, 'Ogd', 'Wojna (Dowodzenie)', ''),
       ('Intrygant', 0, 'Int', 'Inteligencja', ''),
       ('Inwokacja (Boska tradycja)', 1, NULL, NULL, ''),
       ('Krasomówstwo', 0, 'Ogd', 'Charyzma', ''),
       ('Krzepki', 0, 'Wt', NULL, ''),
       ('Łapówkarz', 0, 'Ogd', 'Łapówkarstwo', ''),
       ('Mag Bitewny', 1, NULL, NULL, ''),
       ('Magia Chaosu (Tradycja)', 0, '!', NULL, ''),
       ('Magia Prosta', 1, NULL, NULL, ''),
       ('Magia Tajemna (Tradycja)', 1, NULL, NULL, ''),
       ('Majętny', -1, NULL, NULL, ''),
       ('Mały', 1, NULL, NULL, ''),
       ('Mistrz Charakteryzacji', 0, 'Ogd', 'Występy (Aktorstwo)', ''),
       ('Mistrz Rzemiosła (Rzemiosło)', 0, 'Zr', 'Rzemiosło', ''),
       ('Mistrz Walki', 0, 'Zw', NULL, ''),
       ('Mocne Plecy', 0, 'S', 'Wiosłowanie/Pływanie', ''),
       ('Morderczy Atak', 0, 'I', 'Walka', ''),
       ('Mól Książkowy', 0, 'Int', 'Badania naukowe', ''),
       ('Mówca', 0, 'Ogd', 'Przemawianie (Charyzma)', ''),
       ('Musztra', 0, 'WW', 'Broń Biała', ''),
       ('Na Cztery Łapy', 0, 'Zw', 'Spadanie (Atletyka)', ''),
       ('Naciągacz', 0, 'Ogd', 'Żebractwo (Charyzma)', ''),
       ('Naśladowca', 0, 'I', 'Występy (Aktorstwo)', ''),
       ('Niegodny Uwagi', 0, 'Ogd', 'Skradanie', ''),
       ('Nienawiść (Grupa)', 0, 'SW', 'Siła Woli', ''),
       ('Nieubłagany', 0, 'Wt', NULL, ''),
       ('Nieugięty', 0, 'S', NULL, ''),
       ('Nieustępliwy', 0, 'Zw', NULL, ''),
       ('Nieustraszony (Wróg)', 0, 'SW', 'Opanowanie', ''),
       ('Niewzruszony', 0, 'SW', 'Wystrzały (Opanowanie)', ''),
       ('Niezwykle Odporny', 1, NULL, NULL, ''),
       ('Nos do Kłopotów', 0, 'I', 'Każdy', ''),
       ('Numizmatyka', 0, 'I', 'Wycena', ''),
       ('Obieżyświat', 0, 'Int', 'Wiedza (Okolica)', ''),
       ('Oburęczność', 2, NULL, NULL, ''),
       ('Odporność na Magię', 0, 'Wt', NULL, ''),
       ('Odporność Psychiczna', 0, 'SW', NULL, ''),
       ('Odporny na (Zagrożenie)', 0, 'Wt', 'Każdy', ''),
       ('Odwrócenie Szans', 0, 'Wt', 'Obrona (Broń Biała)', ''),
       ('Ogłuszenie', 0, 'WW', 'Broń Biała', ''),
       ('Oko Łowcy', 0, 'I', 'Tropienie/Polowanie', ''),
       ('Percepcja Magiczna', 0, 'I', 'Wykrywanie Wiatrów Magii', ''),
       ('Pierwsza Pomoc', 0, 'Int', 'Walka (Leczenie)', ''),
       ('Pilot', 0, 'I', 'Wiosłowanie/Żeglowanie', ''),
       ('Pilot Rzeczny', 0, 'I', 'Wiedza (Rzeki)', ''),
       ('Poliglota', 0, 'Int', 'Język (Każdy)', ''),
       ('Pomocny', 0, 'Ogd', 'Wywieranie wpływu', ''),
       ('Porywcza Gorliwość', 0, 'Ogd', 'Charyzma', ''),
       ('Posłuch u Zwierząt', 0, 'SW', 'Oswajanie', ''),
       ('Precyzyjne Inkantowanie', 0, 'I', 'Język (Magiczny)', ''),
       ('Prosto Między Oczy', 1, NULL, NULL, ''),
       ('Przekonujący', 0, 'Ogd', 'Charyzma', ''),
       ('Przestępca', -1, NULL, NULL, ''),
       ('Przyrządzanie Mikstur', 0, 'Int', 'Rzemiosło (Aptekarstwo)', ''),
       ('Riposta', 0, 'Zw', 'Broń Biała', ''),
       ('Rozbrojenie', 0, 'I', 'Broń Biała', ''),
       ('Rozpoznanie Artefaktu', 0, 'I', 'Intuicja', ''),
       ('Rozproszenie Uwagi', 0, 'Zw', 'Atletyka', ''),
       ('Ruchliwe Dłonie', 0, 'Zr', 'Zwinne Palce/Broń Biała (Bijatyka)', ''),
       ('Rybak', 0, 'I', 'Rybołówstwo', ''),
       ('Sekretna Tożsamość', 0, 'Int', 'Występy (Aktorstwo)', ''),
       ('Silne Nogi', 0, 'S', 'Atletyka', ''),
       ('Silny Cios', 0, 'S', NULL, ''),
       ('Skrócenie Dystansu', 0, 'Zr', 'Walka', ''),
       ('Słuch Absolutny', 0, 'I', 'Występy (Śpiewanie)/Języki(Eltharin, Kitajski, Magiczny)', ''),
       ('Snajper', 4, NULL, 'Broń Strzelecka', ''),
       ('Sprężynka', 1, NULL, 'Atletyka', ''),
       ('Straszny', 0, 'S', NULL, ''),
       ('Strzał Przebijający', 0, 'I', 'Broń Zasięgowa', ''),
       ('Strzał w Dziesiątkę', 1, NULL, NULL, ''),
       ('Strzelec Wyborowy', 1, NULL, NULL, ''),
       ('Szał Bojowy', 1, NULL, NULL, ''),
       ('Szczęście', 0, 'Ogd', NULL, ''),
       ('Szczur Tunelowy', 0, 'Zw', 'Skradanie', ''),
       ('Szósty Zmysł', 0, 'I', 'Intuicja', ''),
       ('Szuler', 0, 'Int', 'Hazard/Zwinne Palce', ''),
       ('Szuler Kościany', 0, 'Int', 'Hazard/Zwinne Palce', ''),
       ('Szybki Refleks', 1, NULL, NULL, ''),
       ('Szybkie Czytanie', 0, 'Int', 'Badania Naukowe/Język', ''),
       ('Szybkie Przeładowanie', 0, 'Zr', 'Przeładowanie', ''),
       ('Szybkobiegacz', 0, 'S', 'Bieg (Atletyka)', ''),
       ('Szycha', 1, NULL, NULL, ''),
       ('Świetny Pływak', 0, 'S', 'Pływanie', ''),
       ('Święta Nienawiść', 0, 'Ogd', NULL, ''),
       ('Święte Wizje', 0, 'I', 'Intuicja', ''),
       ('Talent Artystyczny', 0, 'Zr', 'Sztuka (Dowolna)', ''),
       ('Tarczownik', 0, 'S', NULL, ''),
       ('Towarzyski', 0, 'Ogd', 'Plotkowanie', ''),
       ('Tragarz', 0, 'S', 'Siła', ''),
       ('Traper', 0, 'I', 'Percepcja', ''),
       ('Twardziel', 0, 'Wt', NULL, ''),
       ('Ulicznik', 0, 'I', 'Skradanie (Miasto)', ''),
       ('Urodzony w Siodle', 0, 'Zw', 'Jeździectwo (Konie)', ''),
       ('Urodzony Wojownik', 1, NULL, NULL, ''),
       ('Urodzony Żeglarz', 0, 'Wt', 'Choroba morska', ''),
       ('Waleczne Serce', 0, 'SW', 'Panika (Opanowanie)', ''),
       ('Walka w Ciasnocie', 0, 'Zw', 'Unik', ''),
       ('Widzenie w Ciemności', 0, 'I', 'Percepcja', ''),
       ('Wieża Pamięci', 0, 'Int', NULL, ''),
       ('Wilk Morski', 0, 'Zw', 'Żeglowanie', ''),
       ('Władcza Postura', 0, 'Ogd', 'Dowodzenie', ''),
       ('Włóczykij', 0, 'Zr', 'Skradanie (Wieś)', ''),
       ('Wodniak', 0, 'Zw', 'Żeglarstwo (Rzeczne)', ''),
       ('Woltyżerka', 0, 'Zw', 'Unik konno/Jeździectwo (Konie)', ''),
       ('Wódz', 0, 'Ogd', 'Wojna (Dowodzenie)', ''),
       ('Wróżba Losu', 1, NULL, NULL, ''),
       ('Wstrzemięźliwy', 0, 'Wt', 'Głód (Odporność)', ''),
       ('Wściekły Atak', 0, 'Zw', 'Broń Biała', ''),
       ('Wtargnięcie z Włamaniem', 0, 'S', 'Niszczenie (Broń Biała)', ''),
       ('Wyborny Wspinacz', 0, 'S', 'Wspinaczka', ''),
       ('Wyczucie Kierunku', 0, 'I', 'Nawigacja', ''),
       ('Wyczulony Zmysł', 0, 'I', 'Percepcja', ''),
       ('Wykrywanie Magii', 0, 'I', 'Intuicja', ''),
       ('Wytrwały', 0, 'Wt', 'Odporność', ''),
       ('Wytwórca', 0, 'Zr', 'Rzemiosło (Dowolne)', ''),
       ('Z Bata', 0, 'Zr', 'Ucieczka lub Bieg (Powożenie/Jeździectwo)', ''),
       ('Zabójca', 1, NULL, NULL, ''),
       ('Zbicie Broni', 0, 'WW', 'Broń Biała', ''),
       ('Zejście z Linii', 0, 'Zw', 'Unik', ''),
       ('Zimna Krew', 1, NULL, NULL, ''),
       ('Złota Rączka', 0, 'Zr', 'Naprawianie (Rzemiosło)', ''),
       ('Zmysł Bitewny', 0, 'I', 'Percepcja', ''),
       ('Zmysł Magii', 0, 'I', 'Splatanie Magii', ''),
       ('Znawca (Dziedzina)', 0, 'Int', 'Wiedza (Dziedzina)', ''),
       ('Zręczny', 1, NULL, NULL, ''),
       ('Żelazna Szczęka', 0, 'Wt', 'Oszołomienie (Odporność)', ''),
       ('Żelazna Wola', 0, 'SW', 'Zastraszanie (Opanowanie)', ''),
       ('Żyłka Handlowa', 0, 'Ogd', 'Targowanie', '');
COMMIT;

CREATE TABLE IF NOT EXISTS TALENT_ROLL
(
    ID       INT AUTO_INCREMENT PRIMARY KEY,
    ROLL_MIN INT NOT NULL,
    ROLL_MAX INT NOT NULL,
    TALENT   INT,
    FOREIGN KEY (TALENT) REFERENCES TALENTS (ID)
);

INSERT INTO TALENT_ROLL (ROLL_MIN, ROLL_MAX, TALENT)
VALUES (1, 3, 5),
       (4, 6, 6),
       (7, 8, 12),
       (9, 11, 15),
       (12, 14, 17),
       (15, 17, 19),
       (18, 20, 25),
       (21, 24, 26),
       (25, 27, 28),
       (28, 31, 36),
       (32, 34, 62),
       (35, 37, 70),
       (38, 40, 74),
       (41, 43, 77),
       (44, 46, 85),
       (47, 49, 88),
       (50, 52, 101),
       (53, 55, 104),
       (56, 58, 110),
       (59, 62, 112),
       (63, 66, 114),
       (67, 69, 117),
       (70, 72, 125),
       (73, 75, 128),
       (76, 79, 130),
       (80, 82, 133),
       (83, 85, 137),
       (86, 88, 150),
       (89, 91, 151),
       (92, 94, 154),
       (95, 97, 159),
       (98, 100, 164);

#  przypisanie wyposażenia z klasy i profesji
#  przypisanie statusu społecznego

# wybór/losowanie imienia
CREATE TABLE IF NOT EXISTS ELF_NAME_GENERATION
(
    ID     INT AUTO_INCREMENT PRIMARY KEY,
    FIRST  VARCHAR(10) NOT NULL,
    SECOND VARCHAR(10) NOT NULL,
    THIRD  VARCHAR(10) NOT NULL,
    FOURTH VARCHAR(10) NOT NULL
);

INSERT INTO ELF_NAME_GENERATION (FIRST, SECOND, THIRD, FOURTH)
VALUES ('Aes', 'a', 'andril', 'arha'),
       ('Ath', 'ath', 'anel', 'anhu'),
       ('Dor', 'dia', 'ellion', 'dda'),
       ('Far', 'en', 'fin', 'han'),
       ('Gal', 'for', 'il', 'loc'),
       ('Im', 'lor', 'irian', 'noc'),
       ('Lin', 'mar', 'mor', 'oth'),
       ('Mal', 'ol', 'nil', 'ryn'),
       ('Mor', 'sor', 'ric', 'stra'),
       ('Ullia', 'than', 'wing', 'wyth');
COMMIT;

# losowanie wieku

# losowanie koloru oczu
CREATE TABLE IF NOT EXISTS HUMAN_EYE_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO HUMAN_EYE_COLOR (COLOR)
VALUES ('Dowolny wybór'),
       ('Zielony'),
       ('Błękitny'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Blady szary'),
       ('Blady szary'),
       ('Blady szary'),
       ('Blady szary'),
       ('Szary'),
       ('Szary'),
       ('Szary'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Orzechowy'),
       ('Ciemnobrązowy'),
       ('Czarny');

CREATE TABLE IF NOT EXISTS DWARF_EYE_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO DWARF_EYE_COLOR (COLOR)
VALUES ('Czarny jak węgiel'),
       ('Szary jak ołów'),
       ('Stalowoszary'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Brązowy jak ziemia'),
       ('Brązowy jak ziemia'),
       ('Brązowy jak ziemia'),
       ('Brązowy jak ziemia'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Orzechowy'),
       ('Orzechowy'),
       ('Orzechowy'),
       ('Zielony'),
       ('Ciemny miedziany'),
       ('Złoty');

CREATE TABLE IF NOT EXISTS HALFLING_EYE_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO HALFLING_EYE_COLOR (COLOR)
VALUES ('Jasnoszary'),
       ('Szary'),
       ('Błękitny'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Niebieski'),
       ('Zielony'),
       ('Zielony'),
       ('Zielony'),
       ('Zielony'),
       ('Orzechowy'),
       ('Orzechowy'),
       ('Orzechowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Miedziany'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy');

CREATE TABLE IF NOT EXISTS HIGH_ELF_EYE_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(50) NOT NULL
);

INSERT INTO HIGH_ELF_EYE_COLOR (COLOR)
VALUES ('Ciemny jak smoła'),
       ('Ametystowy'),
       ('Akwamaryna'),
       ('Szafirowy'),
       ('Szafirowy'),
       ('Szafirowy'),
       ('Szafirowy'),
       ('Turkusowy'),
       ('Turkusowy'),
       ('Turkusowy'),
       ('Turkusowy'),
       ('Szmaragdowy'),
       ('Szmaragdowy'),
       ('Szmaragdowy'),
       ('Bursztynowy'),
       ('Bursztynowy'),
       ('Bursztynowy'),
       ('Miedziany'),
       ('Cytrynowożółty'),
       ('Złoty');

CREATE TABLE IF NOT EXISTS WOOD_ELF_EYE_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO WOOD_ELF_EYE_COLOR (COLOR)
VALUES ('Kości słoniowej'),
       ('Antracyt'),
       ('Zielony jak bluszcz'),
       ('Zielony jak mech'),
       ('Zielony jak mech'),
       ('Zielony jak mech'),
       ('Zielony jak mech'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Jasnobrązowy'),
       ('Złotobrązowy'),
       ('Fiołkowy');

# losowanie koloru włosów
CREATE TABLE IF NOT EXISTS HUMAN_HAIR_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO HUMAN_HAIR_COLOR (COLOR)
VALUES ('Biały'),
       ('Złoty blond'),
       ('Rudoblond'),
       ('Złoty'),
       ('Złoty'),
       ('Złoty'),
       ('Złoty'),
       ('Jasny brąz'),
       ('Jasny brąz'),
       ('Jasny brąz'),
       ('Jasny brąz'),
       ('Ciemny brąz'),
       ('Ciemny brąz'),
       ('Ciemny brąz'),
       ('Czarny'),
       ('Czarny'),
       ('Czarny'),
       ('Kasztanowy'),
       ('Rudy'),
       ('Siwy');

CREATE TABLE IF NOT EXISTS DWARF_HAIR_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO DWARF_HAIR_COLOR (COLOR)
VALUES ('Blond'),
       ('Siwy'),
       ('Jasny blond'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Miedziany'),
       ('Miedziany'),
       ('Miedziany'),
       ('Miedziany'),
       ('Brąz'),
       ('Brąz'),
       ('Brąz'),
       ('Brąz'),
       ('Brąz'),
       ('Brąz'),
       ('Ciemny brąz'),
       ('Rudy brąz'),
       ('Czarny');

CREATE TABLE IF NOT EXISTS HALFLING_HAIR_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO HALFLING_HAIR_COLOR (COLOR)
VALUES ('Biały'),
       ('Lniany'),
       ('Rudawy'),
       ('Złoty'),
       ('Złoty'),
       ('Złoty'),
       ('Złoty'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Kasztanowy'),
       ('Rudy'),
       ('Rudy'),
       ('Rudy'),
       ('Musztardowy'),
       ('Musztardowy'),
       ('Musztardowy'),
       ('Migdałowy'),
       ('Czekoladowy'),
       ('Lukrecjowy');

CREATE TABLE IF NOT EXISTS HIGH_ELF_HAIR_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(50) NOT NULL
);

INSERT INTO HIGH_ELF_HAIR_COLOR (COLOR)
VALUES ('Srebrnosiwy'),
       ('Popielaty'),
       ('Jasny blond'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Żółty'),
       ('Żółty'),
       ('Żółty'),
       ('Żółty'),
       ('Miedziany blond'),
       ('Miedziany blond'),
       ('Miedziany blond'),
       ('Blond'),
       ('Blond'),
       ('Blond'),
       ('Migdałowy'),
       ('Czerwony'),
       ('Czarny');

CREATE TABLE IF NOT EXISTS WOOD_ELF_HAIR_COLOR
(
    ID    INT AUTO_INCREMENT PRIMARY KEY,
    COLOR VARCHAR(25) NOT NULL
);

INSERT INTO WOOD_ELF_HAIR_COLOR (COLOR)
VALUES ('Brzozowobiały'),
       ('Blond'),
       ('Różowe złoto'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Miodowoblond'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Brązowy'),
       ('Mahoniowy'),
       ('Mahoniowy'),
       ('Mahoniowy'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Ciemnobrązowy'),
       ('Sjena'),
       ('Hebanowy'),
       ('Niebiesko-czarny');

# losowanie wzrostu

# KONIEC

CREATE TABLE IF NOT EXISTS INVENTORY_WEAPONS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    TYPE         VARCHAR(25) NOT NULL,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL,
    LENGTH       VARCHAR(25) NOT NULL,
    DAMAGE       VARCHAR(20),
    TRAITS       VARCHAR(255)
);

INSERT INTO INVENTORY_WEAPONS (TYPE, NAME, COST, WEIGHT, AVAILABILITY, LENGTH, DAMAGE, TRAITS)
VALUES ('Podstawowa', 'Broń Ręczna', '1 ZK', 1, 'Powszechna', 'Średnia', '+BS+4', NULL),
       ('Podstawowa', 'Broń Improwizowana', 'darmo', 'Różne', 'inwencja', 'Różna', '+BS+1', 'Tępa'),
       ('Podstawowa', 'Sztylet', '16 s', '0', 'Powszechna', 'Bardzo krótka', '+BS+2', NULL),
       ('Podstawowa', 'Nóż', '8 s', '0', 'Powszechna', 'Bardzo krótka', '+BS+1', 'Tępy'),
       ('Podstawowa', 'Tarcza (puklerz)', '18 s 2 p', '0', 'Powszechna', 'Kontaktowa', '+BS+1',
        'Tarcza 1, Parująca, Tępa'),
       ('Podstawowa', 'Tarcza', '2 ZK', '1', 'Powszechna', 'Bardzo krótka', '+BS+2', 'Tarcza 2, Parująca, Tępa'),
       ('Podstawowa', 'Tarcza (duża)', '3 ZK', '3', 'Powszechna', 'Bardzo krótka', '+BS+3', 'Tarcza 3, Parująca, Tępa'),
       ('Kawaleryjska', '(2R) Młot kawaleryjski', '3 ZK', '3', 'Ograniczona', 'Długa', '+BS+5', 'Ogłuszający'),
       ('Kawaleryjska', 'Kopia', '1 ZK', '3', 'Rzadka', 'Bardzo długa', '+BS+6*', 'Druzgocząca, Nadziewająca'),
       ('Szermiercza', 'Floret', '5 ZK', '1', 'Ograniczona', 'Średnia', '+BS+3',
        'Nadziewający, Szybki, Precyzyjny, Tępy'),
       ('Szermiercza', 'Rapier', '5 ZK', '1', 'Ograniczona', 'Długa', '+BS+4', 'Nadziewający, Szybki'),
       ('Bijatyka', 'Pięści i kopniaki', 'darmo', '0', 'zawsze przy sobie', 'Kontaktowa', '+BS+0', 'Tępe'),
       ('Bijatyka', 'Kastet', '2 s 6 p', '0', 'Powszechna', 'Kontaktowa', '+BS+2', NULL),
       ('Korbacze', 'Cep bojowy', '10 s', '1', 'Powszechna', 'Średnia', '+BS+3',
        'Dekoncentrujący, Nieprecyzyjny, Plączący'),
       ('Korbacze', 'Korbacz', '2 ZK', '1', 'Ograniczona', 'Średnia', '+BS+5', 'Dekoncentrujący, Plączący'),
       ('Korbacze', '(2R) Kiścień', '3 ZK', '2', 'Rzadka', 'Długa', '+BS+6',
        'Ciężki, Dekoncentrujący, Druzgoczący, Plączący'),
       ('Parująca', 'Lewak', '1 ZK', '0', 'Rzadka', 'Bardzo krótka', '+BS+2', 'Parujący'),
       ('Parująca', 'Łamacz mieczy', '1 ZK 2 s 6 p', '1', 'Ograniczona', 'Krótka', '+BS+3', 'Łamacz mieczy, Parujący'),
       ('Drzewcowa', '(2R) Halabarda', '2 ZK', '3', 'Powszechna', 'Długa', '+BS+4', 'Nadziewająca, Parująca, Rąbiąca'),
       ('Drzewcowa', '(2R) Włócznia', '15 s', '2', 'Powszechna', 'Bardzo długa', '+BS+4', 'Nadziewająca'),
       ('Drzewcowa', '(2R) Pika', '18 s', '4', 'Rzadka', 'Ogromna', '+BS+4', 'Nadziewająca'),
       ('Drzewcowa', '(2R) Kostur', '3 s', '2', 'Powszechna', 'Długa', '+BS+4', 'Ogłuszający, Parujący'),
       ('Dwuręczna', '(2R) Półtorak', '8 ZK', '3', 'Ograniczona', 'Długa', '+BS+5', 'Parujący, Przebijający'),
       ('Dwuręczna', '(2R) Wielki topór', '4 ZK', '3', 'Ograniczona', 'Długa', '+BS+6', 'Ciężki, Druzgoczący, Rąbiący'),
       ('Dwuręczna', '(2R) Nadziak', '9 s', '3', 'Powszechna', 'Średnia', '+BS+5',
        'Nadziewający, Powolny, Przebijający'),
       ('Dwuręczna', '(2R) Młot bojowy', '3 ZK', '3', 'Powszechna', 'Średnia', '+BS+6',
        'Ogłuszający, Powolny, Przebijający'),
       ('Dwuręczna', '(2R) Miecz dwuręczny', '10 ZK', '3', 'Ograniczona', 'Długa', '+BS+5', 'Przebijający, Rąbiący'),
       ('Prochowa', '(2R) Garłacz*', '2 ZK', '1', 'Ograniczona', '20', '+8',
        'Niebezpieczny, Przeładowanie 2, Odłamkowy 3'),
       ('Prochowa', '(2R) Muszkiet hochlandzki*', '100 ZK', '3', 'Egzotyczna', '100', '+9',
        'Celny, Precyzyjny, Przeładowanie 4'),
       ('Prochowa', '(2R) Rusznica*', '4 ZK', '2', 'Ograniczona', '50', '+9', 'Niebezpieczny, Przeładowanie 3'),
       ('Prochowa', ',Pistolet*', '8 ZK', '0', 'Rzadka', '20', '+8', 'Pistolet, Przeładowanie 1'),
       ('Łuki', '(2R) Łuk elfi', '10 ZK', '2', 'Egzotyczna', '150', '+BS+4', 'Przebijający, Precyzyjny'),
       ('Łuki', '(2R) Łuk długi', '5 ZK', '3', 'Ograniczona', '100', '+BS+4', 'Przebijający'),
       ('Łuki', '(2R) Łuk', '4 ZK', '2', 'Powszechna', '50', '+BS+3', NULL),
       ('Łuki', '(2R) Krótki łuk', '3 ZK', '1', 'Powszechna', '20', '+BS+2', NULL),
       ('Kusze', 'Kusza pistoletowa', '6 ZK', '0', 'Ograniczona', '10', '+7', 'Pistolet'),
       ('Kusze', '(2R) Ciężka kusza', '7 ZK', '3', 'Rzadka', '100', '+9', 'Przebijająca, Przeładowanie 2'),
       ('Kusze', '(2R) Kusza', '5 ZK', '2', 'Powszechna', '60', '+9', 'Przeładowanie 1'),
       ('Eksperymentalna', '(2R) Rusznica samopowtarzalna*', '10 ZK', '3', 'Rzadka', '30', '+9',
        'Niebezpieczny, Przeładowanie 5, Wielostrzał 4'),
       ('Eksperymentalna', 'Pistolet samopowtarzalny*', '15 ZK', '1', 'Rzadka', '10', '+8',
        'Niebezpieczny, Pistolet, Przeładowanie 4, Wielostrzał 4'),
       ('Oplątująca', 'Arkan', '6 s', '0', 'Powszechna', 'BSx2', NULL, 'Unieruchamiający'),
       ('Oplątująca', 'Bicz', '5 s', '0', 'Powszechna', '6', '+BS+2', 'Unieruchamiający'),
       ('Materiały wybuchowe', 'Bomba', '3 ZK', '0', 'Rzadka', 'BS', '+12', 'Druzgocząca, Niebezpieczna, Odłamkowa 5'),
       ('Materiały wybuchowe', 'Ładunek zapalający', '1 ZK', '0', 'Ograniczona', 'BS', 'Specjalny***',
        'Niebezpieczny, Odłamkowy 4'),
       ('Proce', 'Proca', '1 s', '0', 'Powszechna', '60', '+6', NULL),
       ('Proce', '(2R) Proca drzewcowa', '4 s', '2', 'Ograniczona', '100', '+7', NULL),
       ('Miotana', 'Bolas', '10 s', '0', 'Rzadka', 'BSx3', '+BS', 'Unieruchamiające'),
       ('Miotana', 'Strzałka', '2 s', '0', 'Ograniczona', 'BSx2', '+BS+1', 'Nadziewająca'),
       ('Miotana', 'Oszczep', '10 s 6 p', '1', 'Ograniczona', 'BSx3', '+BS+3', 'Nadziewający'),
       ('Miotana', 'Kamień', 'darmo', '0', 'Powszechna', 'BSx3', '+BS+0', NULL),
       ('Miotana', 'Topór do rzucania', '1 ZK', '1', 'Powszechna', 'BSx2', '+BS+3', 'Rąbiący'),
       ('Miotana', 'Nóż do rzucania', '18 s', '0', 'Powszechna', 'BSx2', '+BS+2', NULL);
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_AMMO
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    TYPE         VARCHAR(50) NOT NULL,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    AVAILABILITY VARCHAR(25) NOT NULL,
    LENGTH       VARCHAR(25) NOT NULL,
    DAMAGE       VARCHAR(10),
    TRAITS       VARCHAR(100)
);

INSERT INTO INVENTORY_AMMO (TYPE, NAME, COST, AVAILABILITY, LENGTH, DAMAGE, TRAITS)
VALUES ('Prochowa i eksperymentalna', 'Śrut i proch (12)', '3 s 3 p', 'Powszechna', 'jak broń', NULL, 'Odłamkowy +1'),
       ('Prochowa i eksperymentalna', 'Pocisk i proch (12)', '3 s 3 p', 'Powszechna', 'jak broń', '+1',
        'Nadziewający, Przekłuwający'),
       ('Prochowa i eksperymentalna', 'Improwizowany śrut i proch (1)', '3 p', 'Powszechna', 'Połowa zasięgu broni',
        NULL, NULL),
       ('Łuki', 'Strzała (12)', '5 s', 'Powszechna', 'jak broń', NULL, 'Nadziewająca'),
       ('Łuki', 'Strzała elfia (1)', '6 s', 'Egzotyczna', '+50', '+1', 'Celna, Nadziewająca, Przekłuwająca'),
       ('Kusze', 'Bełt (12)', '5 s', 'Powszechna', 'jak broń', NULL, 'Nadziewająca'),
       ('Proce', 'Pocisk ołowiany (12)', '4 p', 'Powszechna', '-10', '+1', 'Ogłuszający'),
       ('Proce', 'Pocisk kamienny (12)', '2 p', 'Powszechna', 'jak broń', NULL, 'Ogłuszający');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_ARMOR
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    TYPE         VARCHAR(25) NOT NULL,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL,
    PENALTY      VARCHAR(25),
    LOCALIZATION VARCHAR(25) NOT NULL,
    DAMAGE       INT,
    TRAITS       VARCHAR(50)
);

INSERT INTO INVENTORY_ARMOR (TYPE, NAME, COST, WEIGHT, AVAILABILITY, PENALTY, LOCALIZATION, DAMAGE, TRAITS)
VALUES ('Miękka skóra', 'Skórzana kurta', '12 s', '1', 'Powszechna', NULL, 'ramiona, korpus', 1, NULL),
       ('Miękka skóra', 'Skórzany kaftan', '10 s', '1', 'Powszechna', NULL, 'korpus', 1, NULL),
       ('Miękka skóra', 'Skórzane nogawice', '14 s', '1', 'Powszechna', NULL, 'nogi', 1, NULL),
       ('Miękka skóra', 'Skórzany hełm', '8 s', '0', 'Powszechna', NULL, 'głowa', '1', 'Częściowy'),
       ('Skóra hartowana', 'Kolet', '18 s', '2', 'Ograniczona', NULL, 'korpus', 2, 'Wrażliwe punkty'),
       ('Kolczugi', 'Nogawice kolcze', '2 ZK', '3', 'Ograniczona', NULL, 'nogi', 2, 'Giętkie'),
       ('Kolczugi', 'Kolczuga', '3 ZK', '3', 'Powszechna', NULL, 'ramiona, korpus', 2, 'Giętka'),
       ('Kolczugi', 'Czepiec kolczy', '1 ZK', '2', 'Ograniczona', '-10 do Percepcji', 'głowa', 2, 'Częściowy, Giętki'),
       ('Kolczugi', 'Kaftan kolczy', '2 ZK', '2', 'Ograniczona', NULL, 'korpus', 2, 'Giętki'),
       ('Płytowe', 'Napierśnik', '10 ZK', '3', 'Ograniczona', NULL, 'korpus', 2, 'Nieprzebijalny, Wrażliwe punkty'),
       ('Płytowe', 'Hełm otwarty', '2 ZK', '1', 'Powszechna', '-10 do Percepcji', 'głowa', 2, 'Częściowy'),
       ('Płytowe', 'Naramienniki', '8 ZK', '3', 'Rzadka', NULL, 'ramiona', 2, 'Nieprzebijalne, Wrażliwe punkty'),
       ('Płytowe', 'Nagolenniki płytowe', '10 ZK', '3', 'Rzadka', '-10 do Skradania', 'nogi', 2,
        'Nieprzebijalne, Wrażliwe punkty'),
       ('Płytowe', 'Hełm', '3 ZK', '2', 'Rzadka', '-20 do Percepcji', 'głowa', 2, 'Nieprzebijalny, Wrażliwe punkty');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_CONTAINERS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    CONTAINS     INT         NOT NULL,
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_CONTAINERS (NAME, COST, WEIGHT, CONTAINS, AVAILABILITY)
VALUES ('Beczka', '8 s', '6', 12, 'Powszechna'),
       ('Beczułka', '3 s', '2', 4, 'Powszechna'),
       ('Bukłak', '1 s 8 p', '1', 1, 'Powszechna'),
       ('Butelka', '5 s', '0', 0, 'Powszechna'),
       ('Duży worek', '1 s 6 p', '3', 6, 'Powszechna'),
       ('Dzban', '3 s 2 p', '1', 1, 'Powszechna'),
       ('Kufel cynowy', '4 s', '0', 0, 'Powszechna'),
       ('Plecak', '4 s 10 p', '2', 4, 'Powszechna'),
       ('Sakiewka', '4 p', '0', 1, 'Powszechna'),
       ('Juki', '18 s', '4', 8, 'Powszechna'),
       ('Torba na ramię', '1 s', '1', 2, 'Powszechna'),
       ('Tuba na zwoje', '16 s', '0', 0, 'Ograniczona'),
       ('Worek', '1 s', '2', 4, 'Powszechna');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_CLOTHING
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_CLOTHING (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Amulet', '2 p', '0', 'Powszechna'),
       ('Berło', '8 ZK', '1', 'Rzadka'),
       ('Biżuteria', 'Różna', '0', 'Powszechna'),
       ('Buty', '5 s', '0', 'Powszechna'),
       ('Kapelusz', '4 s', '0', 'Powszechna'),
       ('Kaptur lub maska', '5 s', '0', 'Powszechna'),
       ('Kostium', '1 ZK', '1', 'Ograniczona'),
       ('Laska', '3 ZK', '1', 'Powszechna'),
       ('Mundur', '1 ZK 2 s', '1', 'Ograniczona'),
       ('Opończa', '18 s', '1', 'Powszechna'),
       ('Perfumy', '10 s', '0', 'Powszechna'),
       ('Płaszcz', '10 s', '1', 'Powszechna'),
       ('Puder do twarzy', '10 s', '0', 'Powszechna'),
       ('Rękawiczki', '4 s', '0', 'Powszechna'),
       ('Strój dworski', '12 ZK', '1', 'Ograniczona'),
       ('Sygnet', '5 ZK', '0', 'Rzadka'),
       ('Symbol religijny', '6 s 8 p', '0', 'Powszechna'),
       ('Szata', '2 ZK', '1', 'Powszechna'),
       ('Tatuaż', '4+ s', '0', 'Ograniczona'),
       ('Ubranie', '6 s', '1', 'Powszechna'),
       ('Wysokie buty', '5 s', '1', 'Powszechna'),
       ('Zapinki (6)', '10 s', '0', 'Ograniczona');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_DINING
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_DINING (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Beczułka piwa', '3 s', '2', 'Powszechna'),
       ('Butelka wina', '10 p', '0', 'Powszechna'),
       ('Ciepły posiłek w gospodzie', '1 s', '0', 'Powszechna'),
       ('Jedzenie na zimno na 1 dzień', '10 p', '1', 'Powszechna'),
       ('Kielich wina lub mocnego trunku', '1 p', '0', 'Powszechna'),
       ('Pół litra piwa', '3 p', '0', 'Powszechna'),
       ('Pół litra przesławnego Piwa Bugmana', '9 p', '0', 'Egzotyczna'),
       ('Pół litra mocnego trunku', '2 s', '0', 'Powszechna'),
       ('Prowiant na 1 dzień', '2 s', '0', 'Powszechna'),
       ('Prywatny pokój na 1 noc', '10 s', NULL, 'Powszechna'),
       ('Stajnia na 1 noc', '10 p', NULL, 'Powszechna'),
       ('Wspólna izba na 1 noc', '10 p', NULL, 'Powszechna');

CREATE TABLE IF NOT EXISTS INVENTORY_TOOLS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_TOOLS (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Bosak', '5 s', '1', 'Powszechna'),
       ('Dłuto', '4 s 2 p', '0', 'Powszechna'),
       ('Drąg (3 metry)', '8 s', '3', 'Powszechna'),
       ('Grabie', '4 s 6 p', '2', 'Powszechna'),
       ('Grawerowana pieczęć', '5 ZK', '0', 'Ograniczona'),
       ('Grzebień', '10 p', '0', 'Powszechna'),
       ('Gwoździe (12)', '2 p', '0', 'Powszechna'),
       ('Haczyki na ryby (12)', '1 s', '0', 'Powszechna'),
       ('Kajdany', '18 s', '0', 'Ograniczona'),
       ('Kilof', '18 s', '1', 'Ograniczona'),
       ('Klucz', '1 s', '0', 'Powszechna'),
       ('Kołek', '1 s', '0', 'Powszechna'),
       ('Kule', '3 s', '2', 'Powszechna'),
       ('Liczydło', '3 s 4 p', '0', 'Ograniczona'),
       ('Lusterko ręczne', '1 ZK 1 s 6 p', '0', 'Egzotyczna'),
       ('Łom', '2 s 6 p', '1', 'Powszechna'),
       ('Miotła', '10 p', '2', 'Powszechna'),
       ('Młotek', '3 s', '0', 'Powszechna'),
       ('Młotek sędziego', '1 ZK', '0', 'Ograniczona'),
       ('Mop', '1 s', '2', 'Powszechna'),
       ('Motyka', '4 s', '2', 'Powszechna'),
       ('Moździerz z tłuczkiem', '14 s', '0', 'Powszechna'),
       ('Narzędzie do czyszczenia uszu', '2 s', '0', 'Ograniczona'),
       ('Nóż', '8 s', '0', 'Powszechna'),
       ('Pędzel do malowania', '4 s', '0', 'Powszechna'),
       ('Piła', '6 s', '1', 'Powszechna'),
       ('Pinceta', '1 s', '0', 'Ograniczona'),
       ('Pióro do pisania', '3 s', '0', 'Powszechna'),
       ('Sidła na zwierzęta', '2 s 6 p', '1', 'Powszechna'),
       ('Sierp', '1 ZK', '1', 'Powszechna'),
       ('Soczewki DO czytania', '3 ZK', '0', 'Rzadka'),
       ('Stalowe szczypce', '16 s', '0', 'Powszechna'),
       ('Szczotka do podłogi', '1 s 6 p', '0', 'Powszechna'),
       ('Szpadel', '8 s', '2', 'Powszechna'),
       ('Teleskop', '5 ZK', '0', 'Rzadka'),
       ('Wiadro', '2 s 6 p', '1', 'Powszechna'),
       ('Wytrychy', '15 s', '0', 'Ograniczona'),
       ('Zestaw na zatrucia', '3 ZK', '0', 'Ograniczona'),
       ('Zestaw do charakteryzacji', '6 s 6 p', '0', 'Ograniczona'),
       ('Zestaw do pisania', '2 ZK', '0', 'Ograniczona');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_BOOKS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_BOOKS (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Arkusz pergaminu', '1 s', '0', 'Powszechna'),
       ('Broszura', '1 s', '0', 'Powszechna'),
       ('Dokument prawny', '3 s', '0', 'Powszechna'),
       ('Księga, aptekarstwo', '8 ZK', '1', 'Ograniczona'),
       ('Księga, inżynieria', '3 ZK', '1', 'Ograniczona'),
       ('Księga, magia', '20 ZK', '1', 'Egzotyczna'),
       ('Księga, medycyna', '15 ZK', '1', 'Rzadka'),
       ('Księga, kryptografia', '8 ZK', '1', 'Egzotyczna'),
       ('Księga, prawo', '15 ZK', '1', 'Rzadka'),
       ('Księga, religia', '1 ZK', '1', 'Powszechna'),
       ('Księga, sztuka', '5 ZK', '1', 'Ograniczona'),
       ('Licencja cechu/gildii', 'nie na sprzedaż', '0', 'niedostępna'),
       ('Mapa', '3 ZK', '0', 'Ograniczona');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_WORK
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(20),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_WORK (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Narzędzia Pracy', '3 ZK', '1', 'Rzadka'),
       ('Warsztat', '80 ZK', 'nie da się nosić', 'Egzotyczna');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_ANIMALS_CARTS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    CONTAINS     INT,
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_ANIMALS_CARTS (NAME, COST, WEIGHT, CONTAINS, AVAILABILITY)
VALUES ('Barka rzeczna', '225 ZK', NULL, 300, 'Rzadka'),
       ('Furmanka', '20 ZK', NULL, 25, 'Powszechna'),
       ('Gołąb pocztowy', '3 s', '1', 0, 'Ograniczona'),
       ('Koń pociągowy', '4 ZK', NULL, 20, 'Powszechna'),
       ('Koń wierzchowy', '15 ZK', NULL, 16, 'Powszechna'),
       ('Łódka dłubanka', '2 ZK', '6', 10, 'Ograniczona'),
       ('Kucyk', '10 ZK', NULL, 14, 'Powszechna'),
       ('Kurczak', '5 p', '1', 0, 'Powszechna'),
       ('Lekki koń bojowy', '70 ZK', NULL, 18, 'Powszechna'),
       ('Łódź wiosłowa', '6 ZK', NULL, 60, 'Ograniczona'),
       ('Małpa', '10 ZK', '2', 1, 'Rzadka'),
       ('Muł', '5 ZK', NULL, 14, 'Powszechna'),
       ('Obroża i smycz dla psa', '1 s 7 p', '0', NULL, 'Powszechna'),
       ('Pies myśliwski', '2 ZK', NULL, 0, 'Rzadka'),
       ('Powóz', '150 ZK', NULL, 80, 'Rzadka'),
       ('Robaki (6)', '1 p', '0', NULL, 'Powszechna'),
       ('Rumak', '230 ZK', NULL, 20, 'Ograniczona'),
       ('Uprząż z siodłem', '6 ZK', '4', NULL, 'Powszechna'),
       ('Wóz', '75 ZK', NULL, 30, 'Powszechna');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_POISONS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_POISONS (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Czarny lotos', '20 ZK', '0', 'Egzotyczna'),
       ('Dziwnokorzeń', '4 s', '0', 'Rzadka'),
       ('Grzybki Szalonego Kapelusznika', '5 ZK', '0', 'Egzotyczna'),
       ('Korzeń mandragory', '1 ZK', '0', 'Rzadka'),
       ('Księżycowy kwiat', '5 ZK', '0', 'Ograniczona'),
       ('Pluja', '1 ZK 5 s', '0', 'Rzadka'),
       ('Rozkosz Ranalda', '18 s', '0', 'Ograniczona'),
       ('Sercobój', '40 ZK', '0', 'Egzotyczna');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_POTIONS
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_POTIONS (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Eliksir żywotności', '18 s', '0', 'Ograniczona'),
       ('Fakstoryl', '15 s', '0', 'Egzotyczna'),
       ('Kataplazm leczniczy', '12 s', '0', 'Powszechna'),
       ('Mikstura lecznicza', '10 s', '0', 'Ograniczona'),
       ('Nocny cień', '3 ZK', '0', 'Rzadka'),
       ('Salwort', '12 s', '0', 'Powszechna'),
       ('Tonik na trawienie', '3 s', '0', 'Powszechna'),
       ('Ziemny korzeń', '5 ZK', '0', 'Ograniczona');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_PROSTHETSES
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_PROSTHETSES (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Cud inżynierii', '20 ZK', '1', 'Egzotyczna'),
       ('Drewniane zęby', '10 s', '0', 'Rzadka'),
       ('Hak', '3 s 4 p', '1', 'Powszechna'),
       ('Opaska na oko', '6 p', '0', 'Powszechna'),
       ('Sztuczna noga', '16 s', '2', 'Ograniczona'),
       ('Sztuczne oko', '1 ZK', '0', 'Rzadka'),
       ('Złoty nos', '18 s', '0', 'Ograniczona');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_MISC
(
    ID           INT AUTO_INCREMENT PRIMARY KEY,
    NAME         VARCHAR(50) NOT NULL,
    COST         VARCHAR(20) NOT NULL,
    WEIGHT       VARCHAR(10),
    AVAILABILITY VARCHAR(25) NOT NULL
);

INSERT INTO INVENTORY_MISC (NAME, COST, WEIGHT, AVAILABILITY)
VALUES ('Afisz', '1 s', '2', 'Powszechna'),
       ('Bandaż', '4 p', '0', 'Powszechna'),
       ('Fajka i tytoń', '3 s 4 p', '0', 'Ograniczona'),
       ('Instrument', '2 ZK', '1', 'Rzadka'),
       ('Koc', '8 p', '0', 'Powszechna'),
       ('Kociołek do gotowania', '8 s', '1', 'Powszechna'),
       ('Kości do gry', '10 p', '0', 'Powszechna'),
       ('Kotwiczka', '1 ZK 10 s', '1', 'Ograniczona'),
       ('Kreda', '10 p', '0', 'Powszechna'),
       ('Kubek', '8 p', '0', 'Powszechna'),
       ('Lampa oliwna', '2 s', '0', 'Powszechna'),
       ('Lampa sztormowa', '1 ZK', '1', 'Ograniczona'),
       ('Latarnia', '12 s', '1', 'Powszechna'),
       ('Lalka', '2 s', '0', 'Powszechna'),
       ('Lampa Davricha', '2 ZK', '1', 'Rzadka'),
       ('Lina, 10 metrów', '8 s 4 p', '1', 'Powszechna'),
       ('Miska', '1 s', '0', 'Powszechna'),
       ('Namiot', '12 s', '2', 'Ograniczona'),
       ('Pałka', '1 s', '0', 'Powszechna'),
       ('Patelnia', '7 s 6 s', '1', 'Powszechna'),
       ('Piłka', '5 p', '0', 'Powszechna'),
       ('Płócienna plandeka', '8 s', '1', 'Powszechna'),
       ('Pudełko na hubkę i krzesiwo', '4 s 2 p', '0', 'Powszechna'),
       ('Szmaty', '1 p', '0', 'Powszechna'),
       ('Sztućce', '3 s 6 p', '0', 'Powszechna'),
       ('Świece (tuzin)', '1 s', '0', 'Powszechna'),
       ('Talerz', '1 s', '0', 'Powszechna'),
       ('Talia kart', '1 s', '0', 'Powszechna'),
       ('Węgiel do rysowania', '10 p', '0', 'Powszechna'),
       ('Zapałka', '1 p', '0', 'Powszechna'),
       ('Zwijane posłanie', '6 s', '1', 'Powszechna');
COMMIT;

CREATE TABLE IF NOT EXISTS INVENTORY_HIRELINGS
(
    ID        INT AUTO_INCREMENT PRIMARY KEY,
    NAME      VARCHAR(50)  NOT NULL,
    QUICK_JOB VARCHAR(20)  NOT NULL,
    DAY_JOB   VARCHAR(10)  NOT NULL,
    WEEK_JOB  VARCHAR(25)  NOT NULL,
    ABOUT     VARCHAR(100) NOT NULL
);

INSERT INTO INVENTORY_HIRELINGS (NAME, QUICK_JOB, DAY_JOB, WEEK_JOB, ABOUT)
VALUES ('Miejscowy zwiadowca', '5 p', '15 p', '10 s', 'Pracuje niezależnie bez Testów Dowodzenia'),
       ('Doświadczony najemnik', '3 s', '9 s', '3 ZK 12 s',
        'Wymaga udziału w łupach zamiast premii za niebezpieczeństwo'),
       ('Prawnik', '3 s', '9 s', '3 ZK 12 s', 'Sporządzenie prostego dokumentu prawnego kosztuje 2–4 szylingi'),
       ('Tragarz', '1 s', '3 s', '1 ZK 4 s', 'Dźwiga 10 punktów Obciążenia'),
       ('Skryba', '2 s', '6 s', '2 ZK 8 s', 'Dodatkowo tłumaczy z 1–2 innych języków powszechnych'),
       ('Doktor', '5 s', '15 s', '5 ZK', 'Jedna wizyta lekarska kosztuje 4–6 szylingów');
COMMIT;