CREATE TABLE IF NOT EXISTS RACES
(
    ID         BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME       VARCHAR(255) NOT NULL,
    CHANCE_MIN INT          NOT NULL,
    CHANCE_MAX INT          NOT NULL
);

INSERT INTO RACES (NAME, CHANCE_MIN, CHANCE_MAX)
VALUES ('Człowiek', 1, 90),
       ('Niziołek', 91, 94),
       ('Krasnolud', 95, 98),
       ('Wysoki elf', 99, 99),
       ('Leśny elf', 100, 100);
COMMIT;

CREATE TABLE IF NOT EXISTS PROFESSIONS
(
    ID          BIGINT AUTO_INCREMENT PRIMARY KEY,
    CLASS       VARCHAR(255) NOT NULL,
    NAME        VARCHAR(255) NOT NULL,
    DESCRIPTION VARCHAR(255),
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

INSERT INTO PROFESSIONS (CLASS, NAME, DESCRIPTION, HU_MIN, HU_MAX, DW_MIN, DW_MAX, HAL_MIN, HAL_MAX, H_ELF_MIN,
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

CREATE TABLE IF NOT EXISTS SKILLS
(
    ID          BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME        VARCHAR(255) NOT NULL,
    ATTRIBUTE   VARCHAR(3)   NOT NULL,
    IS_ADVANCED BOOLEAN      NOT NULL,
    IS_GROUP    BOOLEAN      NOT NULL,
    DESCRIPTION VARCHAR(255)
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
    ID          BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME        VARCHAR(255) NOT NULL,
    MAX_VALUE   INT,
    MAX_BONUS   VARCHAR(3),
    TESTED      VARCHAR(255),
    DESCRIPTION VARCHAR(255)
);

INSERT INTO TALENTS (NAME, MAX_VALUE, MAX_BONUS, TESTED, DESCRIPTION)
VALUES ('Aptekarz', 0, 'Int', 'Rzemiosło (Aptekarstwo)', ''),
       ('Arcydzieło', NULL, NULL, NULL, ''),
       ('Artylerzysta', 0, 'Zr', 'Przeładowanie (Broń Prochowa)', '');
COMMIT;