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
        char[][] screen = new char[30][30]; //Dimensioni del frame della lettera
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = '░';
            }
        }
        String LetteraDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        switch (LetteraDesiderata) {
            case "a": Lettera.a(screen, 0, 26); break;
            case "b": Lettera.b(screen, 0, 26); break;
            case "c": Lettera.c(screen, 0, 26); break;
            case "d": Lettera.d(screen, 0, 26); break;
            case "e": Lettera.e(screen, 0, 26); break;
            case "f": Lettera.f(screen, 0, 26); break;
			case "g": Lettera.g(screen, 0, 26); break;
            case "h": Lettera.h(screen, 0, 26); break;
			case "i": Lettera.i(screen, 0, 26); break;
            case "l": Lettera.l(screen, 0, 26); break;
			case "m": Lettera.m(screen, 0, 26); break;
			case "n": Lettera.n(screen, 0, 26); break;
            case "o": Lettera.o(screen, 0, 26); break;
            case "p": Lettera.p(screen, 0, 26); break;
            case "q": Lettera.q(screen, 0, 26); break;
            case "r": Lettera.r(screen, 0, 26); break;
            case "s": Lettera.s(screen, 0, 26); break;
            case "t": Lettera.t(screen, 0, 26); break;
            case "u": Lettera.u(screen, 0, 26); break;
            case "v": Lettera.v(screen, 0, 26); break;
            case "w": Lettera.w(screen, 0, 26); break;
            case "x": Lettera.x(screen, 0, 26); break;
            case "y": Lettera.y(screen, 0, 26); break;
            case "z": Lettera.z(screen, 0, 26); break;
            case "BL":BresenhamLine(screen);	break;
            default:
                System.out.println("Il carattere: \"" + LetteraDesiderata + "\" non è registrato nel programma per l'insegnamento visivo della scrittura");
                break;
        }
    }
    private String getInput(String prompt) throws IOException {
        System.out.print(prompt);
        return reader.readLine().trim();
    }
    public static void STAMPpixel(char[][] screen, int x, int y) throws InterruptedException {
        screen[y][x] = '█'; //Inserisci nello schermo a quella coordinata un carattere che funge da pixel
        Thread.sleep(200); //Aspetta 200 Millisecondi per vedere l' animazione
        STAMPschermo(screen); //Stampa a schermo lo schermo

    }
    static void STAMPschermo(char[][] screen) {
        System.out.print("\033[H\033[2J"); // Pulisce lo schermo con escape code
        System.out.flush();// Pulisce lo schermo
        for (char[] row : screen) { //Per ogni riga di caratteri dello schermo
            for (char c : row) { //Per ogni carattere della riga
                System.out.print(c); //Scrivi il carattere
            }
            System.out.println(); //Line New
        }
    }
    public static void BresenhamLine(char[][] screen) throws InterruptedException {
        int x0 = 0, y0 = 0, x1 = 20, y1 = 9; // Coordinate iniziali e finali
        drawLine(x0, y0, x1, y1, screen);
    }
    static void drawLine(int x0, int y0, int x1, int y1, char[][] screen) throws InterruptedException {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;
        while (true) {
            STAMPpixel(screen, x0, y0);
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
            System.out.flush(); //Pulisci lo schermo
            char[][] screen = new char[40][40]; //Dimensione
            for (int m = 0; m < screen.length; m++) {for (int n = 0; n < screen[m].length; n++) { screen[m][n] = ' ';}}
            //Controllo per evitare indici fuori limite
            if (x >= 0 && x < 40 && y >= 0 && y < 40) {screen[y][x] = '*';}
            for (char[] row : screen) {for (char c : row) {System.out.print(c);}}
            Thread.sleep(3); //n millisecondi per vedere l'animazione
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Manuale Dattilo = new Manuale();
        Dattilo.start();
    }
}
