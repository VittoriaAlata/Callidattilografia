package com.github.vittoriaalata.callidattilografia.Calli;

import jdk.jfr.Name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GP {

    public static boolean DevMode = true;
    private BufferedReader reader;

    public GP() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws InterruptedException, IOException {

        if (!DevMode) {
            stellenelcielo();
            System.out.println(
                    "\n\n" +
                            "Callidattilografia [Versione 0.1.0-alpha]\n" +
                            "\n" +
                            "\n" +
                            "                                                                                                    \n" +
                            "      * ***            ***   ***               **                                  ***              \n" +
                            "    *  ****  *          ***   ***    *          **             *        *      *    ***             \n" +
                            "   *  *  ****            **    **   ***         **            **       **     ***    **             \n" +
                            "  *  **   **             **    **    *          **            **       **      *     **             \n" +
                            " *  ***                  **    **               **          ******** ********        **     ****    \n" +
                            "**   **          ****    **    **  ***      *** **    **** ******** ******** ***     **    * ***  * \n" +
                            "**   **         * ***  * **    **   ***    ********* * ***  * **       **     ***    **   *   ****  \n" +
                            "**   **        *   ****  **    **    **   **   **** *   ****  **       **      **    **  **    **   \n" +
                            "**   **       **    **   **    **    **   **    ** **    **   **       **      **    **  **    **   \n" +
                            "**   **       **    **   **    **    **   **    ** **    **   **       **      **    **  **    **   \n" +
                            " **  **       **    **   **    **    **   **    ** **    **   **       **      **    **  **    **   \n" +
                            "  ** *      * **    **   **    **    **   **    ** **    **   **       **      **    **  **    **   \n" +
                            "   ***     *  **    **   **    **    **   **    ** **    **   **       **      **    **   ******    \n" +
                            "    *******    ***** **  *** * *** * *** * *****    ***** **   **       **     *** * *** * ****     \n" +
                            "      ***       ***   **  ***   *********   ***      ***   **                   ***   ***           \n" +
                            "                                 ** ***   *                                                         \n" +
                            "                                **   *** ***                                                        \n" +
                            "                                **        *                                                         \n" +
                            "           ***  ****            **                                                                  \n" +
                            "    ****    **** **** * ****    ******  ***       ****                                              \n" +
                            "   *  ***  * **   **** * ***  * *****    ***     * ***  *                                           \n" +
                            "  *    ****  **       *   ****  **        **    *   ****                                            \n" +
                            " **     **   **      **    **   **        **   **    **                                             \n" +
                            " **     **   **      **    **   **        **   **    **                                             \n" +
                            " **     **   **      **    **   **        **   **    **                                             \n" +
                            " **     **   **      **    **   **        **   **    **                                             \n" +
                            " **     **   ***     **    **   **        **   **    **                                             \n" +
                            "  ********    ***     ***** **  **        *** * ***** **                                            \n" +
                            "    *** ***            ***   **  **        ***   ***   **                                           \n" +
                            "         ***                                                                                        \n" +
                            "   ****   ***                                                                                       \n" +
                            " *******  **                                                                                        \n" +
                            "(c) 2024 MIT LICENSE Vittoria Italia Azzurra Nicole\n");
        } else {
            Thread.sleep(0);
        }
        String Modalita = getInput("\nInserisci la modalità di insegnamento? Insegnamento Manuale [M] / Insegnamento Guidato [G]:");
        if (Modalita.equals("M")) Manuale.main(null);
        if (Modalita.equals("G")) Guidato.main(null);
    }

    public static void STAMPpixel(char[][] piano, int x, int y) throws InterruptedException {
        piano[y][x] = '█'; //carattere che funge da pixel
        if (!DevMode) {
            Thread.sleep(200);
        } else {
            Thread.sleep(0);
        }
        STAMPpiano(piano);
    }

    public static void STAMPpixel3D(String[][] piano3D, int x, int y, int c) throws InterruptedException {
        switch (c) {
            case 0: piano3D[y][x] = "\u001b[38;2;255;255;255m█\u001b[0m"; break;
            case 1: piano3D[y][x] = "\u001b[38;2;0;0;255m█\u001b[0m"; break;
            case 2: piano3D[y][x] = "\u001b[38;2;255;0;0m█\u001b[0m"; break;
            case 3: piano3D[y][x] = "\u001b[38;2;0;255;0m█\u001b[0m"; break;

            default: break;
        }
//        piano3D[y][x] = "█"; //carattere che funge da pixel
        if (!DevMode) {
            Thread.sleep(200);
        } else {
            Thread.sleep(0);
        }
        STAMPpiano3D(piano3D);
    }
    static void STAMPpiano3D(String[][] piano3D) {
        System.out.print("\033[H\033[2J"); //pulizia con escape code
        System.out.flush();
        for (String[] row : piano3D) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void STAMPpiano(char[][] piano) {
        System.out.print("\033[H\033[2J"); //pulizia con escape code
        System.out.flush();
        for (char[] row : piano) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void drawLine(int x0, int y0, int x1, int y1, char[][] piano) throws InterruptedException {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;
        while (true) {
            STAMPpixel(piano, x0, y0);
            if (x0 == x1 && y0 == y1) break;
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x0 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y0 += sy;
            }
        }
    }
    public static void stellenelcielo() { //Stelle nel cielo
        int r = 1, xc = 5, yc = 5;
        for (int i = 0; i <= 180; i++) {
            double angle = Math.toRadians(i); int x = (int) (r * Math.cos(angle)) + xc; int y = (int) (r * Math.sin(angle)) + yc;
            System.out.flush();
            char[][] piano = new char[20][20];
            for (int m = 0; m < piano.length; m++) for (int n = 4; n < piano[m].length; n++) piano[m][n] = ' ';
            //Controllo per evitare indici fuori limite
            if (x >= 0 && x < 30 && y >= 0 && y < 30) piano[y][x] = '*';
            for (char[] row : piano) for (char c : row) System.out.print(c);
        }
    }

    private String getInput(String prompt) throws IOException {
        System.out.print(prompt);
        String input = reader.readLine().trim();
        return input;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        GP Dattilo = new GP();
        Dattilo.start();
    }
}


