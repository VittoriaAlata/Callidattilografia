package com.github.vittoriaalata.callidattilografia.Calli;

import com.github.vittoriaalata.effettiterminale.Animazione;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.github.vittoriaalata.effettiterminale.Animazione;
import static com.github.vittoriaalata.effettiterminale.Rullo.*;
import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.getInput;
import static com.github.vittoriaalata.effettiterminale.Rullo.AnimazionePuntini;
import static com.github.vittoriaalata.effettiterminale.Rullo.CaricamentoPuntini;

public enum TUI {

    Calli;

    public static void Versione(){
        String VersioneLocale = "0.1.0-beta";
        System.out.println("\n\tCallidattilografia [Versione " + VersioneLocale +"]");
    }

    public static void Copyright(){
        System.out.println("\t(c) 2024 MIT LICENSE Vittoria Italia Azzurra Nicole");
    }

    public static void CalliASCIIart(){
        System.out.println(
"\t   __       _  _                     _                         \n"+
"\t  /  )     // //     /     _/__/_   //                 /)      \n"+
"\t /   __.  // // o __/ __.  /  /  o // __ _,  __  __.  // o __. \n"+
"\t(__/(_/|_</_</_<_(_/_(_/|_<__<__<_</_(_)(_)_/ (_(_/|_//_<_(_/|_\n"+
"\t                                         /|         />         \n"+
"\t                                        |/         </          \n"
        );
    }

    public static void aspettaFalsaDecisione() throws InterruptedException {
        Animazione.ReAnimazione(CaricamentoPuntini,AnimazionePuntini,1000,2);
        System.out.print("\tPremi RETURN per continuare");
        String fakeInput = getInput(" ");

    }
    
    public static void Intestazione() {
        // Intestazione
        System.out.println("\n\t╔════════════════════════════════════════════════╗");
        System.out.println("\t║        PROGETTO INSEGNAMENTO CORSIVO           ║");
        System.out.println("\t║                                                ║");
        System.out.println("\t╚════════════════════════════════════════════════╝\n");
    }

    public static void Fine() {
        // Fine
        System.out.println("\t✔ Fine del corso base di scrittura corsiva.");
    }

    public static void Consigliati() {
        // Esercizi finali
        System.out.println("\t╔════ Esercizi Consigliati ════╗");
        System.out.println("\t• Scrivere le sillabe con ogni nuova lettera appresa.");
        System.out.println("\t• Scrivere parole come: ceci, dado, gatto, ok, sorso, attaccapanni.\n");
    }

    public static void Doppie() {
        // Doppie
        System.out.println("\t╔════ Lezione sulle Doppie ════╗");
        System.out.println("\tEsempi: tt, ll, ss, zz");
        System.out.println("\t• Le doppie si scrivono in un unico tratto quando possibile.\n");
    }

    public static void z() {
        System.out.println("\tLettera 'z':");
        System.out.println("\t• Movimento angolato e ondulato, termina con ricciolo.\n");
    }

    public static void s() {
        System.out.println("\tLettera 's':");
        System.out.println("\t• Linea curva che si chiude con una forma a naso.\n");
    }

    public static void r() {
        System.out.println("\tLettera 'r':");
        System.out.println("\t• Inizia con una curva e un piccolo ricciolo.\n");
    }

    public static void Corte() {
        // Lettere corte: r, s, z
        System.out.println("\t╔════ Gruppo 8: Corte e Complesse (r, s, z) ════╗");
    }

    public static void p() {
        System.out.println("\tLettera 'p':");
        System.out.println("\t• Come 'b', ma con pancia sotto la riga di base.\n");
    }

    public static void k() {
        System.out.println("\tLettera 'k':");
        System.out.println("\t• Linea verticale, cappio e gamba in fuori.\n");
    }

    public static void Speciali() {
        // Lettere speciali: k, p
        System.out.println("\t╔════ Gruppo 7: Speciali (k, p) ════╗");
    }

    public static void h() {
        System.out.println("\tLettera 'h':");
        System.out.println("\t• Discesa verticale, poi arco (ponte) verso destra.\n");
    }

    public static void f() {
        System.out.println("\tLettera 'f':");
        System.out.println("\t• Movimento verso l’alto, discesa, occhiello sotto la base.\n");
    }

    public static void Arco() {
        // Lettere con arco: f, h
        System.out.println("\t╔════ Gruppo 6: Arco e Occhiello (f, h) ════╗");
    }

    public static void b() {
        System.out.println("\tLettera 'b':");
        System.out.println("\t• Parte come 'l', aggiunge pancia e orecchietta.\n");
    }

    public static void l() {
        System.out.println("\tLettera 'l':");
        System.out.println("\t• Movimento lungo verso l’alto, poi discesa verticale.\n");
    }

    public static void Lunghe() {
        // Lettere lunghe: l, b
        System.out.println("\t╔════ Gruppo 5: Lettere Lunghe (l, b) ════╗");
    }

    public static void y() {
        System.out.println("\tLettera 'y':");
        System.out.println("\t• Simile a 'u', ma con occhiello discendente.\n");
    }

    public static void j() {
        System.out.println("\tLettera 'j':");
        System.out.println("\t• Come 'i' ma con discesa sotto la linea di base.\n");
    }

    public static void t() {
        System.out.println("\tLettera 't':");
        System.out.println("\t• Simile alla 'i' ma più alta, con trattino orizzontale.\n");
    }

    public static void Alte() {
        // Lettere alte: t, j, y
        System.out.println("\t╔════ Gruppo 4: Lettere Alte (t, j, y) ════╗");
    }

    public static void CombinazioniC() {
        // Combinazioni di lettere
        System.out.println("\t╔════ Combinazioni con 'c' e vocali ════╗");
        System.out.println("\tSillabe: ca, co, cu, ci, ce");
        System.out.println("\t• Fermarsi tra lettere tonde (a, o), collegare direttamente con le altre.\n");
    }

    public static void e() {
        System.out.println("\tLettera 'e':");
        System.out.println("\t• Movimento iniziale deciso, poi curvatura come un piccolo fiocco.\n");
    }

    public static void u() {
        System.out.println("\tLettera 'u':");
        System.out.println("\t• Movimento simile a una doppia curva, con amo finale.\n");
    }

    public static void i() {
        System.out.println("\tLettera 'i':");
        System.out.println("\t• Parte dalla riga dell’erba, salita e discesa, poi puntino.\n");
    }

    public static void Ascendenti() {
        // Lettere ascendenti: i, u, e
        System.out.println("\t╔════ Gruppo 3: Ascendenti (i, u, e) ════╗");
    }

    public static void q() {
        System.out.println("\tLettera 'q':");
        System.out.println("\t• Uguale allo stampato, con aggiunta del tratto discendente.\n");
    }

    public static void g() {
        System.out.println("\tLettera 'g':");
        System.out.println("\t• Parte da 'a', aggiunge occhiello inferiore (sotto la riga di base).\n");
    }

    public static void d() {
        System.out.println("\tLettera 'd':");
        System.out.println("\t• Parte da un cerchio (come 'a'), poi si aggiunge un’asta verso l’alto.\n");
    }

    public static void Asta() {
        // Lettere tonde con asta: d, g, q
        System.out.println("\t╔════ Gruppo 2: Lettere con Asta (d, g, q) ════╗");
    }

    public static void a() {
        System.out.println("\tLettera 'a':");
        System.out.println("\t• Inizio alle ore 2, movimento circolare antiorario.");
        System.out.println("\t• Aggiunta del gancio (amo) per proseguire con altre lettere.\n");
    }

    public static void o() {
        System.out.println("\tLettera 'o':");
        System.out.println("\t• Cerchio chiuso in senso antiorario.");
        System.out.println("\t• Deve essere proporzionata, orecchietta finale.\n");
    }

    public static void c() {
        System.out.println("\tLettera 'c':");
        System.out.println("\t• Inizia nell'erba, curva antioraria.");
        System.out.println("\t• Gancio finale per collegare la lettera successiva.\n");
    }

    public static void Tonde() {
        // Lettere tonde: c, o, a
        System.out.println("\t╔═════ Unità 1: Lettere Tonde (c, o, a) ══════════════╗");
        System.out.println("\t Lettere introdotte: c, o, a");
        System.out.println("\t Caratteristica comune: movimento in senso antiorario.\n");
    }

    public static void Rigatura(){
        //Rigatura quaderi 3a elementare
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        String CYAN = "\u001B[36m";
        String BROWN = "\u001B[38;2;150;75;0m"; // Marrone RGB (custom ANSI)
        String linea = "\t████████████████████████████████████████████████";
        System.out.println(CYAN + linea + RESET);   // Riga inferiore cielo (celeste)
        System.out.println(GREEN + linea + RESET);  // Riga superiore prato (verde)
        System.out.println(BROWN + linea + RESET);  // Riga centrale terra (marrone)
    }
}
