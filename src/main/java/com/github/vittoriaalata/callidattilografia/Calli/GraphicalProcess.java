package com.github.vittoriaalata.callidattilografia.Calli;

import com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess;

import java.io.IOException;
import java.util.Scanner;

import static com.github.vittoriaalata.callidattilografia.Calli.Costanti.*;
import static com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess.piano;
import static com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess.piano3D;

public class GraphicalProcess {

    public static void  ScritturaSfondoPiano(char[][] piano) {
        for (int i = 0; i < piano.length; i++) {
            for (int j = 0; j < piano[i].length; j++) {
                piano[i][j] = UnitaSfondo;
            }
        }
    }


    public static void  ScritturaSfondoPiano3D(String[][] piano3D) {
        for (int i = 0; i < piano3D.length; i++) {
            for (int j = 0; j < piano3D[i].length; j++) {
                piano3D[i][j] = UnitaSfondo3D;
            }
        }
    }

    public void start() throws InterruptedException, IOException {
        if (!DevMode) {
            StelleNelCielo();
            TUI.Versione();
            TUI.CalliASCIIart();
            TUI.Copyright();
        }
        String Modalita = getInput("\nInserisci la modalità di insegnamento? Insegnamento Manuale [M] / Insegnamento Guidato [G]:");
        switch (Modalita){
            case "M": ScritturaSfondoPiano(piano); ScritturaSfondoPiano3D(piano3D); Manuale.main(null); break;
            case "G": ScritturaSfondoPiano3D(piano3D); Guidato.main(null); break;
            case "DM": DevMode = true; LogicalProcess.main(null); break;
            default:
                System.out.println("La modalità: \"" + Modalita + "\" non è presente nel programma per l'insegnamento visivo della scrittura");
                return;
        }
    }

    public static void StampaCarattere3D(String[][] Piano3D, int x, int y, int c) throws InterruptedException {
        switch (c) {
            case 0: Piano3D[y][x] = "\u001b[38;2;255;255;255m" + UnitaScrittura3D + "\u001b[0m"; break;
            case 1: Piano3D[y][x] = "\u001b[38;2;0;0;255m" + UnitaScrittura3D + "\u001b[0m"; break;
            case 2: Piano3D[y][x] = "\u001b[38;2;255;0;0m" + UnitaScrittura3D + "\u001b[0m"; break;
            case 3: Piano3D[y][x] = "\u001b[38;2;0;255;0m" + UnitaScrittura3D + "\u001b[0m"; break;
            default: break;
        }
        if (!DevMode) {
            Thread.sleep(DelayMillisPunto);
        }
        Lava();
        StampaPiano3D(Piano3D);
    }
    static void StampaPiano3D(String[][] piano3D) throws InterruptedException {
        for (String[] row : piano3D) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void Lava() {
        System.out.flush();
    }

    public static void StampaCarattere(char[][] piano, int x, int y) throws InterruptedException {
        piano[y][x] = UnitaScrittura; 
        if (!DevMode) {
            Thread.sleep(DelayMillisPunto);
        }
        StampaPiano(piano);
    }

    static void StampaPiano(char[][] Piano) {
        Lava();
        for (char[] row : Piano) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void DisegnaLinea(int x0, int y0, int x1, int y1, char[][] piano) throws InterruptedException {
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;
        while (true) {
            StampaCarattere(piano, x0, y0);
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
    public static void StelleNelCielo() { //Stelle nel cielo
        int r = 1, xc = 5, yc = 5;
        for (int i = 0; i <= 180; i++) {
            double angle = Math.toRadians(i); int x = (int) (r * Math.cos(angle)) + xc; int y = (int) (r * Math.sin(angle)) + yc;
            char[][] piano = new char[20][20];
            for (int m = 0; m < piano.length; m++) for (int n = 4; n < piano[m].length; n++) piano[m][n] = ' ';
            //Controllo per evitare indici fuori limite
            if (x >= 0 && x < 30 && y >= 0 && y < 30) piano[y][x] = '*';
            for (char[] row : piano) for (char c : row) System.out.print(c);
        }
    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner input = new Scanner(System.in);
        String I = input.nextLine().trim();
        return I;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GraphicalProcess Calli = new GraphicalProcess();
        Calli.start();
    }
}


