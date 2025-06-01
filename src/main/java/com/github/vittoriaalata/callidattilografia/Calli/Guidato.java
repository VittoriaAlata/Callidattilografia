package com.github.vittoriaalata.callidattilografia.Calli;

import java.io.*;

import static com.github.vittoriaalata.callidattilografia.Calli.Costanti.RichiestaInputSezioni;
import static com.github.vittoriaalata.effettiterminale.Rullo.*;

import com.github.vittoriaalata.callidattilografia.Calli.LP.Lettera;
import com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess;
import com.github.vittoriaalata.effettiterminale.Animazione;

public class Guidato {

    public void start() throws IOException, InterruptedException {
        RichiestaInputSezioni = false;
        TUI.Intestazione();
        TUI.Rigatura();
        TUI.aspettaFalsaDecisione();
        TUI.Tonde();
        TUI.aspettaFalsaDecisione();
        TUI.c();
        TUI.aspettaFalsaDecisione();
        LogicalProcess.main("c");
        TUI.o();
        TUI.a();
        TUI.Asta();
        TUI.d();
        TUI.g();
        TUI.q();
        TUI.Ascendenti();
        TUI.i();
        TUI.u();
        TUI.e();
        TUI.CombinazioniC();
        TUI.Alte();
        TUI.t();
        TUI.j();
        TUI.y();
        TUI.Lunghe();
        TUI.l();
        TUI.b();
        TUI.Arco();
        TUI.f();
        TUI.h();
        TUI.Speciali();
        TUI.k();
        TUI.p();
        TUI.Corte();
        TUI.r();
        TUI.s();
        TUI.z();
        TUI.Doppie();
        TUI.Consigliati();
        TUI.Fine();
        //ParolaDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        //LogicalProcess.main(ParolaDesiderata);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Guidato Calli = new Guidato();
        Calli.start();
    }
}
