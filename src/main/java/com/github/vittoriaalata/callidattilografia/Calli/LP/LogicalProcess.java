package com.github.vittoriaalata.callidattilografia.Calli.LP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.github.vittoriaalata.callidattilografia.Calli.LP.Dizionari.GiunzioneLettereCarrelloFinale;
import static com.github.vittoriaalata.callidattilografia.Calli.LP.Dizionari.GiunzioneLettereRulloFinale;
import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.DisegnaLinea;


public class LogicalProcess {

    private BufferedReader reader;

    public LogicalProcess() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static String ParolaDesiderata;
    public static int LunghezzaPiano = 40;

    public static char[][] piano = new char[LunghezzaPiano][LunghezzaPiano];

    public static String[][] piano3D = new String[LunghezzaPiano][LunghezzaPiano];

    public void start(String input) throws InterruptedException, IOException {
        ParolaDesiderata = input;
        


        /*
        Metodo misto di scrittura parole e lettere iterazione array di caratteri e switch
        delle funzioni invocative agli array delle lettere con valori
        del carrello e rullo iterati con assegnazione a valori finali lettere tramite dizionari.
        Ideato il 18/03/2025 su documenti della Callidattilografia in formato cartaceo.
        */
        String CarattereRichiesto;
        int CarrelloIniziale = 0, RulloIniziale = LunghezzaPiano-14, CarrelloFinale, RulloFinale;
            char Parola[] = ParolaDesiderata.toCharArray();
            for (char Carattere : Parola) {
                CarattereRichiesto = String.valueOf(Carattere);
                switch (CarattereRichiesto) {
                    case "a": Lettera.a(piano, CarrelloIniziale, RulloIniziale); break;
                    case "b": Lettera.b(piano, CarrelloIniziale, RulloIniziale); break;
                    case "c": Lettera.c(piano, CarrelloIniziale, RulloIniziale); break;
                    case "d": Lettera.d(piano, CarrelloIniziale, RulloIniziale); break;
                    case "e": Lettera.e(piano, CarrelloIniziale, RulloIniziale); break;
                    case "f": Lettera.f(piano, CarrelloIniziale, RulloIniziale); break;
                    case "g": Lettera.g(piano, CarrelloIniziale, RulloIniziale); break;
                    case "h": Lettera.h(piano, CarrelloIniziale, RulloIniziale); break;
                    case "i": Lettera.i(piano, CarrelloIniziale, RulloIniziale); break;
                    case "l": Lettera.l(piano, CarrelloIniziale, RulloIniziale); break;
                    case "m": Lettera.m(piano, CarrelloIniziale, RulloIniziale); break;
                    case "n": Lettera.n(piano, CarrelloIniziale, RulloIniziale); break;
                    case "o": Lettera.o(piano, CarrelloIniziale, RulloIniziale); break;
                    case "p": Lettera.p(piano, CarrelloIniziale, RulloIniziale); break;
                    case "q": Lettera.q(piano, CarrelloIniziale, RulloIniziale); break;
                    case "r": Lettera.r(piano, CarrelloIniziale, RulloIniziale); break;
                    case "s": Lettera.s(piano, CarrelloIniziale, RulloIniziale); break;
                    case "t": Lettera.t(piano, CarrelloIniziale, RulloIniziale); break;
                    case "u": Lettera.u(piano, CarrelloIniziale, RulloIniziale); break;
                    case "v": Lettera.v(piano, CarrelloIniziale, RulloIniziale); break;
                    case "w": Lettera.w(piano, CarrelloIniziale, RulloIniziale); break;
                    case "x": Lettera.x(piano, CarrelloIniziale, RulloIniziale); break;
                    case "y": Lettera.y(piano, CarrelloIniziale, RulloIniziale); break;
                    case "z": Lettera.z(piano, CarrelloIniziale, RulloIniziale); break;
                    case "@": Lettera.a3D(piano3D, CarrelloIniziale, RulloIniziale); break;
                    case "_": break;
                    case "-": break;
                    case "*": int x0 = igetInput("x0: "); int y0 = igetInput("y0: "); int x1 = igetInput("x1: "); int y1 = igetInput("y1: "); BresenhamLine(piano, x0, y0, x1, y1);	System.out.println(x0 + y0 + x1 + y1); break;
                    default:
                        System.out.println("Il carattere: \"" + ParolaDesiderata + "\" non è registrato nel programma per l'insegnamento visivo della scrittura");
                        return;
                }
                CarrelloFinale = GiunzioneLettereCarrelloFinale.get(CarattereRichiesto);
                CarrelloIniziale = CarrelloIniziale + CarrelloFinale + 1;
                RulloFinale = GiunzioneLettereRulloFinale.get(CarattereRichiesto);
                RulloIniziale = RulloIniziale + RulloFinale;
            //TODO o non funziona
            System.out.println(Parola);
        }
        /*
        ***************************************************************
        ***************************************************************
        */
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
        DisegnaLinea(x0, y0, x1, y1, piano);
    }

    public static void main(String iLettera) throws IOException, InterruptedException {
        LogicalProcess Calli = new LogicalProcess();
        Calli.start(iLettera);
    }
}
