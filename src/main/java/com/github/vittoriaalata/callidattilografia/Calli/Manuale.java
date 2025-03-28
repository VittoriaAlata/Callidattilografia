package com.github.vittoriaalata.callidattilografia.Calli;

import com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess;

import java.io.IOException;

import static com.github.vittoriaalata.callidattilografia.Calli.LP.LogicalProcess.ParolaDesiderata;
import static com.github.vittoriaalata.callidattilografia.Calli.GraphicalProcess.getInput;

public class Manuale {

    public void start() throws IOException, InterruptedException {
        ParolaDesiderata = getInput("\nDi quale carattere vuoi visualizzare la sua realizzazione calligrafica?: ");
        LogicalProcess.main(ParolaDesiderata);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Manuale Calli = new Manuale();
        Calli.start();
    }
}
