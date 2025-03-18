package com.github.vittoriaalata.callidattilografia;

import com.github.vittoriaalata.callidattilografia.Calli.Guidato;
import com.github.vittoriaalata.callidattilografia.Calli.Manuale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.github.vittoriaalata.callidattilografia.Calli.Manuale.stellenelcielo;

public class GP {

    private BufferedReader reader;

    public GP() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws InterruptedException, IOException {
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
        String Modalita = getInput("\nInserisci la modalità di insegnamento? Insegnamento Manuale [M] / Insegnamento Guidato [G]:");
        if (Modalita.equals("M")) Manuale.main(null);
        if (Modalita.equals("G")) Guidato.main(null);
    }
    public String getInput(String prompt) throws IOException {
        System.out.print(prompt);
        return reader.readLine().trim();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        GP Dattilo = new GP();
        Dattilo.start();
    }
}


