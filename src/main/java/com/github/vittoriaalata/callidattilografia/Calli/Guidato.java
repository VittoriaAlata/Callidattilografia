package com.github.vittoriaalata.callidattilografia.Calli;

import com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess;

import java.io.*;

import static com.github.vittoriaalata.callidattilografia.Calli.Costanti.RichiestaInputSezioni;
import static com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess.ParolaDesiderata;
import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.getInput;

public class Guidato {

    public void start() throws IOException, InterruptedException {
        RichiestaInputSezioni = false;
        TUI.Calli_Manuale_banner();
        ParolaDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        LogicalProcess.main(ParolaDesiderata);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Guidato Calli = new Guidato();
        Calli.start();
    }
}
