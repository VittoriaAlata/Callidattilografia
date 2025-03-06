# Callidattilografia

Callidattilografia è un Programma per l'insegnamento elettronico della Calligrafia e della Dattilografia.

È diviso nella parte Calli per la calligrafia ortografica e nella nella parte Dattilo per la dattilografia
## Prerequisiti

- Java Development Kit (JDK) installato (versione 21 o successiva)
- IntelliJ IDEA (opzionale, ma consigliato per lo sviluppo)

## Struttura del Progetto
La struttura del progetto dovrebbe essere la seguente:
```sh
Callidattilografia:.
│   .gitignore
│   LICENSE
│   pom.xml
│   README.md
│
│
├───out
│                                     
├───src
    ├───main
        ├───java
        │   └───com
        │       └───github
        │           └───vittoriaalata
        │               └───callidattilografia
        │                   │   GP.java
        │                   │
        │                   └───Calli
        │                           Guidato.class
        │                           Guidato.java
        │                           Lettera.class
        │                           Lettera.java
        │                           Manuale.class
        │                           Manuale.java
        │
        └───resources
            └───META-INF
                    MANIFEST.MF
```
## Compilazione & Esecuzione

Per compilare il progetto da riga di comando, segui questi passaggi:

1. Apri un terminale nella directory principale del progetto e crea la cartella out.
   ```sh
   mkdir out
   
2. Compila i file Java:
   ```sh
   javac -d out -sourcepath src\main\java src\main\java\com\github\vittoriaalata\callidattilografia\Calli\*.java       src\main\java\com\github\vittoriaalata\callidattilografia\GP.java

3. Esecuzione
   ```sh
   java -cp out com.github.vittoriaalata.callidattilografia.GP
