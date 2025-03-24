package com.github.vittoriaalata.callidattilografia.Calli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import static com.github.vittoriaalata.callidattilografia.Calli.Dizionari.GiunzioneLettereCarrelloFinale;
import static com.github.vittoriaalata.callidattilografia.Calli.Dizionari.GiunzioneLettereRulloFinale;
import static com.github.vittoriaalata.callidattilografia.Calli.GP.drawLine;


public class Manuale {

    private BufferedReader reader;

    public Manuale() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws InterruptedException, IOException {

        char[][] piano = new char[40][40];
        for (int i = 0; i < piano.length; i++) {
            for (int j = 0; j < piano[i].length; j++) {
                piano[i][j] = '░';
            }
        }

        String[][] piano3D = new String[40][40];
        for (int i = 0; i < piano3D.length; i++) {
            for (int j = 0; j < piano3D[i].length; j++) {
                piano3D[i][j] = "▒";
            }
        }

        String LetteraDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        /*
        Metodo misto di scrittura parole e lettere iterazione array di caratteri e switch
        delle funzioni invocative agli array delle lettere con valori
        del carrello e rullo iterati con assegnazione a valori finali lettere tramite dizionari.
        Ideato il 18/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */
        String let;
        int ci = 0, ri = 26, cfl, rfl;
            char c[] = LetteraDesiderata.toCharArray();
            for (char l : c) {
                let = String.valueOf(l);
                switch (let) {
                    case "a": Lettera.a(piano, ci, ri); break;
                    case "b": Lettera.b(piano, ci, ri); break;
                    case "c": Lettera.c(piano, ci, ri); break;
                    case "d": Lettera.d(piano, ci, ri); break;
                    case "e": Lettera.e(piano, ci, ri); break;
                    case "f": Lettera.f(piano, ci, ri); break;
                    case "g": Lettera.g(piano, ci, ri); break;
                    case "h": Lettera.h(piano, ci, ri); break;
                    case "i": Lettera.i(piano, ci, ri); break;
                    case "l": Lettera.l(piano, ci, ri); break;
                    case "m": Lettera.m(piano, ci, ri); break;
                    case "n": Lettera.n(piano, ci, ri); break;
                    case "o": Lettera.o(piano, ci, ri); break;
                    case "p": Lettera.p(piano, ci, ri); break;
                    case "q": Lettera.q(piano, ci, ri); break;
                    case "r": Lettera.r(piano, ci, ri); break;
                    case "s": Lettera.s(piano, ci, ri); break;
                    case "t": Lettera.t(piano, ci, ri); break;
                    case "u": Lettera.u(piano, ci, ri); break;
                    case "v": Lettera.v(piano, ci, ri); break;
                    case "w": Lettera.w(piano, ci, ri); break;
                    case "x": Lettera.x(piano, ci, ri); break;
                    case "y": Lettera.y(piano, ci, ri); break;
                    case "z": Lettera.z(piano, ci, ri); break;
                    case "@": Lettera.a3D(piano3D, ci, ri); break;
                    case "_": break;
                    case "*":int x0 = igetInput("x0: "); int y0 = igetInput("y0: "); int x1 = igetInput("x1: "); int y1 = igetInput("y1: "); BresenhamLine(piano, x0, y0, x1, y1);	System.out.println(x0 + y0 + x1 + y1); break;
                    default:
                        System.out.println("Il carattere: \"" + LetteraDesiderata + "\" non è registrato nel programma per l'insegnamento visivo della scrittura");
                        break;
                }
                cfl = GiunzioneLettereCarrelloFinale.get(let);
                ci = ci + cfl + 1;
                rfl = GiunzioneLettereRulloFinale.get(let);
                ri = ri + rfl;
            //TODO o non funziona
            System.out.println(c);
        }
        /*
        ***************************************************************
        ***************************************************************
        */
    }
    private String getInput(String prompt) throws IOException {
        System.out.print(prompt);
        return reader.readLine().trim();
    }
    private Integer igetInput(String prompt) throws IOException {
        System.out.print(prompt);
        return Integer.valueOf(reader.readLine());
    }

    public static void BresenhamLine(char[][] piano, int x0, int y0, int x1, int y1) throws InterruptedException {
        /*
        Inversione del piano cartesiano con le coordinate dei punti;
        dimostrato matematicamente e
        ideato il 18/03/2025 su documenti della Callidattilografia in formato cartaceo.
         */
        if (y0 != x0){
            y0 = y0 + x0;
            x0 = y0 - x0;
            y0 = y0 - x0;
            y1 = y1 + x1;
            x1 = y1 - x1;
            y1 = y1 - x1;
        } else {
            y0 -= piano.length-1;
            y0 = Math.abs(y0);
            y1 -= piano.length-1;
            y1 = Math.abs(y1);
        }
        /*
        ***************************************************************
        ***************************************************************
        */
        drawLine(x0, y0, x1, y1, piano);
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Manuale Dattilo = new Manuale();
        Dattilo.start();
    }
}
