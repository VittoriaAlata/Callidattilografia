package com.github.vittoriaalata.callidattilografia.Calli.LP;

import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.StampaCarattere;
import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.StampaCarattere3D;

public record Lettera() {

    private static void IterLettera2D(int[][] lettera, char[][] piano) throws InterruptedException {
        for (int[] punto : lettera) { //Per ogni array di coordinate nell' array della lettera
            StampaCarattere(piano, punto[0], punto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
    }

    private static void IterLettera3D(int[][][] lettera, String[][] piano3D) throws InterruptedException {
        for (int[][] sezione: lettera) {
            for (int[] punto : sezione) {
                StampaCarattere3D(piano3D, punto[0], punto[1], punto[2]); //Stampa il pixel nello schermo a quella coordinata}
            }
        }
    }

    public static int[][] a(char[][] piano, int carrello, int rullo) throws InterruptedException {
        /*
                Applicazione della modifica #0 & #1
        Ridisegno della lettera 'a', eliminate 2 righe per avere la lettera più simmetrica
        considerando l'unità di misura: il carattere [] rettangolare.
        Ideato il 23/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */

        /*
                Applicazione della modifica #2
        Ridisegno della lettera 'a', eliminata 1 colonna per seguire condizioni
        per la rappresentazione calligrafica dei caratteri.
        Ideato il 24/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */
        int[][] a = {
                //CERCHIO
                {carrello + 4, rullo - 3, 2}, {carrello + 3, rullo - 3, 2}, {carrello + 2, rullo - 3, 2}, {carrello + 1, rullo - 3, 2},
                {carrello, rullo - 2, 2}, {carrello, rullo - 1, 2},
                {carrello + 1, rullo, 2}, {carrello + 2, rullo, 2}, {carrello + 3, rullo, 2}, {carrello + 4, rullo, 2},
                {carrello + 5, rullo - 1, 2}, {carrello + 5, rullo - 2, 2},
                //CODINA
                //Penna che scende e ricalca la code della lettera
                {carrello + 5, rullo - 2, 1}, {carrello + 5, rullo - 1, 1},
                //************************************************
                {carrello + 6, rullo, 1}, {carrello + 7, rullo, 1}, {carrello + 8, rullo, 1}, {carrello + 9, rullo - 1, 1},
//                        PUNTO DI GUINTURA
//                        eliminato nella modifica #0
//                        {carrello, rullo+5}
        };

        IterLettera2D(a, piano);
        return a;
    }

    public static int[][][] a3D(String[][] piano3D, int carrello, int rullo) throws InterruptedException {
        /*
                Applicazione della modifica #0 & #1
        Ridisegno della lettera 'a', eliminate 2 righe per avere la lettera più simmetrica
        considerando l'unità di misura: il carattere [] rettangolare.
        Ideato il 23/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */

        /*
                Applicazione della modifica #2
        Ridisegno della lettera 'a', eliminata 1 colonna per seguire condizioni
        per la rappresentazione calligrafica dei caratteri.
        Ideato il 24/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */
        int[][][] lettera = {
                {
                        //CERCHIO
                        {carrello+4, rullo-3, 2}, {carrello+3, rullo-3, 2}, {carrello+2, rullo-3, 2}, {carrello+1, rullo-3, 2},
                        {carrello, rullo-2, 2}, {carrello, rullo-1, 2},
                        {carrello+1, rullo, 2}, {carrello+2, rullo, 2}, {carrello+3, rullo, 2}, {carrello+4, rullo, 2},
                        {carrello+5, rullo-1, 2}, {carrello+5, rullo-2, 2},
                },
                {
                        //CODINA
                        //Penna che scende e ricalca la code della lettera
                        {carrello+5, rullo-2, 1}, {carrello+5, rullo-1, 1},
                        //************************************************
                        {carrello+6, rullo, 1}, {carrello+7, rullo, 1}, {carrello+8, rullo, 1}, {carrello+9, rullo-1, 1},
                },
                {
//                        PUNTO DI GUINTURA
//                        eliminato nella modifica #0
//                        {carrello, rullo+5}
                }
        };

        IterLettera3D(lettera, piano3D);
        return lettera;
    }

    public static int[][] b(char[][] piano, int carrello, int rullo) throws InterruptedException {
        // Simula la scrittura della lettera "b" a bassa risoluzione
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, //linea dritta
                {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea obliqua
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6},
                {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo},//punti utili alla giuntura
                {carrello+16, rullo-1}, {carrello+17, rullo-2}, {carrello+18, rullo-3}, {carrello+19, rullo-4}, //Linea obliqua
                {carrello+20, rullo-4}, {carrello+21, rullo-4}, {carrello+22, rullo-4}, {carrello+23, rullo-4} //linea retta
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] c(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+5, rullo-6},
                {carrello+4, rullo-7}, {carrello+3, rullo-7}, {carrello+2, rullo-7},
                {carrello+1, rullo-6}, {carrello+1, rullo-5}, {carrello+1, rullo-4}, {carrello+1, rullo-3}, {carrello+1, rullo-2}, {carrello+1, rullo-1},
                {carrello+2, rullo}, {carrello+3, rullo},
                {carrello+4, rullo}, {carrello+5 , rullo},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] d(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo-7}, {carrello+2, rullo-7},
                {carrello+1, rullo-6}, {carrello+1, rullo-5}, {carrello+1, rullo-4}, {carrello+1, rullo-3}, {carrello+1, rullo-2}, {carrello+1, rullo-1},
                {carrello+2, rullo}, {carrello+3, rullo},
                {carrello+4, rullo}, {carrello+5 , rullo},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},

                {carrello, rullo}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6},
                {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo} //punti utili alla giuntura
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] e(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo}, {carrello+4, rullo}, {carrello+5, rullo}, //Linea
                {carrello+6, rullo-1}, {carrello+7, rullo-1}, {carrello+8, rullo-1}, //Linea
                {carrello+9, rullo-2}, {carrello+10, rullo-2}, //Linea
                {carrello+11, rullo-3}, //Punto
                {carrello+12, rullo-4}, {carrello+13, rullo-4}, //Linea
                {carrello+14, rullo-5}, //Punto
                {carrello+15, rullo-6}, //Punto
                {carrello+16, rullo-7}, //Punto
                {carrello+16, rullo-8}, //Punto
                {carrello+16, rullo-9}, //Punto
                {carrello+16, rullo-10}, //Punto
                {carrello+16, rullo-11}, {carrello+15, rullo-11}, //Linea
                {carrello+14, rullo-10}, //Punto
                {carrello+13, rullo-9}, //Punto
                {carrello+12, rullo-8}, //Punto
                {carrello+11, rullo-7}, //Punto
                {carrello+11, rullo-6}, //Punto
                {carrello+11, rullo-5}, //Punto
                {carrello+11, rullo-4}, //Punto
                {carrello+12, rullo-2}, //Punto
                {carrello+13, rullo-1}, //Punto
                {carrello+14, rullo}, {carrello+15, rullo}, {carrello+16, rullo}, {carrello+17, rullo}, {carrello+18, rullo} //Linea
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] f(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6}, {carrello+6, rullo-5}, {carrello+6, rullo-4}, {carrello+6, rullo-3}, {carrello+6, rullo-2}, {carrello+6, rullo-1}, {carrello+6, rullo}, {carrello+6, rullo+1}, {carrello+6, rullo+2}, {carrello+6, rullo+3},
                {carrello+3, rullo-7}, {carrello+4, rullo-6}, {carrello+5, rullo-5}, {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] g(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6}, {carrello+6, rullo-5}, {carrello+6, rullo-4}, {carrello+6, rullo-3}, {carrello+6, rullo-2}, {carrello+6, rullo-1}, {carrello+6, rullo}, {carrello+6, rullo+1}, {carrello+6, rullo+2}, {carrello+6, rullo+3},
                {carrello+3, rullo-7}, {carrello+4, rullo-6}, {carrello+5, rullo-5}, {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] h(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6}, {carrello+6, rullo-5}, {carrello+6, rullo-4}, {carrello+6, rullo-3}, {carrello+6, rullo-2}, {carrello+6, rullo-1}, {carrello+6, rullo},
                {carrello+7, rullo-4}, {carrello+8, rullo-5}, {carrello+9, rullo-5}, {carrello+10, rullo-5},
                {carrello+11, rullo-4}, {carrello+11, rullo-3}, {carrello+11, rullo-2}, {carrello+11, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo} //punti utili alla giuntura
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] i(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo}, {carrello+4, rullo}, {carrello+5, rullo}, //Linea
                {carrello+6, rullo-1}, {carrello+7, rullo-1}, {carrello+8, rullo-1}, //Linea
                {carrello+9, rullo-2}, {carrello+10, rullo-2}, //Linea
                {carrello+11, rullo-3}, //Punto
                {carrello+12, rullo-4}, {carrello+13, rullo-4}, //Linea
                {carrello+14, rullo-5}, //Punto
                {carrello+15, rullo-6}, //Punto
                {carrello+16, rullo-7}, //Punto
                {carrello+16, rullo-8}, //Punto
                {carrello+16, rullo-9}, //Punto
                {carrello+16, rullo-10}, //Punto
                {carrello+16, rullo-11}, {carrello+15, rullo-11}, //Linea
                {carrello+14, rullo-10}, //Punto
                {carrello+13, rullo-9}, //Punto
                {carrello+12, rullo-8}, //Punto
                {carrello+11, rullo-7}, //Punto
                {carrello+11, rullo-6}, //Punto
                {carrello+11, rullo-5}, //Punto
                {carrello+11, rullo-4}, //Punto
                {carrello+12, rullo-2}, //Punto
                {carrello+13, rullo-1}, //Punto
                {carrello+14, rullo}, {carrello+15, rullo}, {carrello+16, rullo}, {carrello+17, rullo}, {carrello+18, rullo} //Linea
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] l(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6},
                {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo} //punti utili alla giuntura
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] m(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6},
                {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo} //punti utili alla giuntura
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] n(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello, rullo}, {carrello+1, rullo}, {carrello+2, rullo}, {carrello+3, rullo-1}, {carrello+4, rullo-2}, {carrello+5, rullo-3}, {carrello+6, rullo-4}, //Linea
                {carrello+7, rullo-5}, {carrello+7, rullo-6}, {carrello+8, rullo-7}, {carrello+8, rullo-8}, {carrello+9, rullo-9}, {carrello+9, rullo-10}, //Linea //Curva
                {carrello+10, rullo-11}, {carrello+10, rullo-12}, {carrello+10, rullo-13}, {carrello+10, rullo-14}, {carrello+10, rullo-15}, {carrello+10, rullo-16}, {carrello+10, rullo-17}, {carrello+10, rullo-18}, {carrello+10, rullo-19},
                {carrello+9, rullo-20},
                {carrello+8, rullo-20},
                {carrello+7, rullo-20},
                {carrello+6, rullo-19}, {carrello+6,  rullo-18}, {carrello+6, rullo-17}, {carrello+6, rullo-16}, {carrello+6, rullo-15}, {carrello+6, rullo-14}, {carrello+6, rullo-13}, {carrello+6, rullo-12}, {carrello+6, rullo-11}, {carrello+6, rullo-10}, {carrello+6, rullo-9}, {carrello+6, rullo-8}, {carrello+6, rullo-7}, {carrello+6, rullo-6},
                {carrello+7, rullo-4}, {carrello+8, rullo-3}, {carrello+9, rullo-2}, {carrello+10, rullo-1},
                {carrello+11, rullo}, {carrello+12, rullo}, {carrello+13, rullo}, {carrello+14, rullo}, {carrello+15, rullo} //punti utili alla giuntura
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] o(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] p(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] q(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] r(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] s(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] t(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] u(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] v(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] w(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] x(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] y(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }

    public static int[][] z(char[][] piano, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        IterLettera2D(lettera, piano);
        return lettera;
    }
}
