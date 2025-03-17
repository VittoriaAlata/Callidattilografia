package com.github.vittoriaalata.callidattilografia.Calli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manuale {

    private BufferedReader reader;

    public Manuale() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws InterruptedException, IOException {
        char[][] piano = new char[30][30];
        for (int i = 0; i < piano.length; i++) {
            for (int j = 0; j < piano[i].length; j++) {
                piano[i][j] = '░';
            }
        }
        String LetteraDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        switch (LetteraDesiderata) {
            case "a": Lettera.a(piano, 0, 26); break;
            case "b": Lettera.b(piano, 0, 26); break;
            case "c": Lettera.c(piano, 0, 26); break;
            case "d": Lettera.d(piano, 0, 26); break;
            case "e": Lettera.e(piano, 0, 26); break;
            case "f": Lettera.f(piano, 0, 26); break;
			case "g": Lettera.g(piano, 0, 26); break;
            case "h": Lettera.h(piano, 0, 26); break;
			case "i": Lettera.i(piano, 0, 26); break;
            case "l": Lettera.l(piano, 0, 26); break;
			case "m": Lettera.m(piano, 0, 26); break;
			case "n": Lettera.n(piano, 0, 26); break;
            case "o": Lettera.o(piano, 0, 26); break;
            case "p": Lettera.p(piano, 0, 26); break;
            case "q": Lettera.q(piano, 0, 26); break;
            case "r": Lettera.r(piano, 0, 26); break;
            case "s": Lettera.s(piano, 0, 26); break;
            case "t": Lettera.t(piano, 0, 26); break;
            case "u": Lettera.u(piano, 0, 26); break;
            case "v": Lettera.v(piano, 0, 26); break;
            case "w": Lettera.w(piano, 0, 26); break;
            case "x": Lettera.x(piano, 0, 26); break;
            case "y": Lettera.y(piano, 0, 26); break;
            case "z": Lettera.z(piano, 0, 26); break;
            case "BL":BresenhamLine(piano);	break;
            default:
                System.out.println("Il carattere: \"" + LetteraDesiderata + "\" non è registrato nel programma per l'insegnamento visivo della scrittura");
                break;
        }
    }
    private String getInput(String prompt) throws IOException {
        System.out.print(prompt);
        return reader.readLine().trim();
    }
    public static void STAMPpixel(char[][] piano, int x, int y) throws InterruptedException {
        piano[y][x] = '█'; //carattere che funge da pixel
        Thread.sleep(200);
        STAMPpiano(piano);

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
    public static void BresenhamLine(char[][] piano) throws InterruptedException {
        int x0 = 0, y0 = 0, x1 = 20, y1 = 9;
        drawLine(x0, y0, x1, y1, piano);
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
    public static void stellenelcielo() throws InterruptedException { //Stelle nel cielo
        int r = 2, xc = 30, yc = 30;
        for (int i = 0; i <= 360; i++) {
            double angle = Math.toRadians(i); int x = (int) (r * Math.cos(angle)) + xc; int y = (int) (r * Math.sin(angle)) + yc;
            System.out.flush();
            char[][] piano = new char[40][40];
            for (int m = 0; m < piano.length; m++) for (int n = 0; n < piano[m].length; n++) piano[m][n] = ' ';
            //Controllo per evitare indici fuori limite
            if (x >= 0 && x < 40 && y >= 0 && y < 40) piano[y][x] = '*';
            for (char[] row : piano) for (char c : row) System.out.print(c);
            Thread.sleep(3);
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Manuale Dattilo = new Manuale();
        Dattilo.start();
    }
}
