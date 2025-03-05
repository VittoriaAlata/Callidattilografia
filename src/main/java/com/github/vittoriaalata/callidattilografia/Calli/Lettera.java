package com.github.vittoriaalata.callidattilografia.Calli;

import static com.github.vittoriaalata.callidattilografia.Calli.Manuale.STAMPpixel;

public class Lettera {

    public static int[][] a(char[][] screen, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                //CERCHIO
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo+5}, {carrello+3, rullo+5},
                {carrello+4, rullo+5}, {carrello+5 , rullo+5},
                {carrello+6, rullo+4}, {carrello+6, rullo+3}, {carrello+6, rullo+2}, {carrello+6, rullo+1},
                {carrello+5, rullo}, {carrello+4, rullo},
                //CODINA
                {carrello+7, rullo+5}, {carrello+8, rullo+5}, {carrello+9, rullo+5}, {carrello+10, rullo+4},
                //PUNTO DI GUINTURA
                {carrello, rullo+5}
        };

        for (int[] punto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, punto[0], punto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] b(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] c(char[][] screen, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+5, rullo-6},
                {carrello+4, rullo-7}, {carrello+3, rullo-7}, {carrello+2, rullo-7},
                {carrello+1, rullo-6}, {carrello+1, rullo-5}, {carrello+1, rullo-4}, {carrello+1, rullo-3}, {carrello+1, rullo-2}, {carrello+1, rullo-1},
                {carrello+2, rullo}, {carrello+3, rullo},
                {carrello+4, rullo}, {carrello+5 , rullo},
                {carrello, rullo}
        };

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] d(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] e(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] f(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] h(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] l(char[][] screen, int carrello, int rullo) throws InterruptedException {
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

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }

    public static int[][] o(char[][] screen, int carrello, int rullo) throws InterruptedException {
        int[][] lettera = {
                {carrello+3, rullo}, {carrello+2, rullo},
                {carrello+1, rullo+1}, {carrello+1, rullo+2}, {carrello+1, rullo+3}, {carrello+1, rullo+4},
                {carrello+2, rullo-5}, {carrello+3, rullo-5}, {carrello+4, rullo-5}, {carrello+5 , rullo+5},
                {carrello+6, rullo-1}, {carrello+6, rullo-2}, {carrello+6, rullo-3}, {carrello+6, rullo-4}, {carrello+6, rullo-5}, {carrello+6, rullo-6},
                {carrello+5, rullo-7}, {carrello+4, rullo-7},
                {carrello+7, rullo-6}, {carrello+8, rullo-7},
                {carrello, rullo}
        };

        for (int[] COORDpunto : lettera) { //Per ogni coordinata nell' array di interi di coordinate
            STAMPpixel(screen, COORDpunto[0], COORDpunto[1]); //Stampa il pixel nello schermo a quella coordinata
        }
        return lettera;
    }
}
