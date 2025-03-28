package com.github.vittoriaalata.callidattilografia.Calli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public enum TUI {

    Calli;

    public static void Versione(){
        String VersioneLocale = "0.1.0-beta";
        System.out.println("\n                                Callidattilografia [Versione " + VersioneLocale +"]");
    }

    public static void Copyright(){
        System.out.println("(c) 2024 MIT LICENSE Vittoria Italia Azzurra Nicole");
    }

    public static void CalliASCIIart(){
        System.out.println(
                "       _..._                                                                                 .-'''-.     \n" +
                "    .-'_..._''.           .---..---.    _______                                     .---.   '   _    \\   \n" +
                "  .' .'      '.\\          |   ||   |.--.\\  ___ `'.                              .--.|   | /   /` '.   \\  \n" +
                " / .'                     |   ||   ||__| ' |--.\\  \\                             |__||   |.   |     \\  '  \n" +
                ". '                       |   ||   |.--. | |    \\  '               .|       .|  .--.|   ||   '      |  ' \n" +
                "| |                 __    |   ||   ||  | | |     |  '    __      .' |_    .' |_ |  ||   |\\    \\     / /  \n" +
                "| |              .:--.'.  |   ||   ||  | | |     |  | .:--.'.  .'     | .'     ||  ||   | `.   ` ..' /   \n" +
                ". '             / |   \\ | |   ||   ||  | | |     ' .'/ |   \\ |'--.  .-''--.  .-'|  ||   |    '-...-'`    \n" +
                " \\ '.          .`\" __ | | |   ||   ||  | | |___.' /' `\" __ | |   |  |     |  |  |  ||   |                \n" +
                "  '. `._____.-'/ .'.''| | |   ||   ||__|/_______.'/   .'.''| |   |  |     |  |  |__||   |                \n" +
                "    `-.______ / / /   | |_'---''---'    \\_______|/   / /   | |_  |  '.'   |  '.'    '---'                \n" +
                "             `  \\ \\._,\\ '/           .--.            \\ \\._,\\ '/  |   /    |   /                          \n" +
                "  .--./)         `--'  `\"       _.._ |__|             `--'  `\"   `'-'     `'-'                           \n" +
                " /.''\\\\   .-,.--.             .' .._|.--.                                                                \n" +
                "| |  | |  |  .-. |    __      | '    |  |    __                                                          \n" +
                " \\`-' /   | |  | | .:--.'.  __| |__  |  | .:--.'.                                                        \n" +
                " /(\"'`    | |  | |/ |   \\ ||__   __| |  |/ |   \\ |                                                       \n" +
                " \\ '---.  | |  '- `\" __ | |   | |    |  |`\" __ | |                                                       \n" +
                "  /'\"\"'.\\ | |      .'.''| |   | |    |__| .'.''| |                                                       \n" +
                " ||     ||| |     / /   | |_  | |        / /   | |_                                                      \n" +
                " \\'. __// |_|     \\ \\._,\\ '/  | |        \\ \\._,\\ '/                                                      \n" +
                "  `'---'           `--'  `\"   |_|         `--'  `\"                                                       \n"
        );
    }
    public static void Calli_Manuale_banner() {
        System.out.println("*******************************************************");
        System.out.println("*    Benvenut alla Lezione di Corsivo Guidato!   *");
        System.out.println("*******************************************************");
        System.out.println("Unità Didattica 1: Introduzione alla Calligrafia.");
        System.out.println("Unità Didattica 2: Lettere curve e il senso antiorario c, o, a.");
        System.out.println("Unità Didattica 3: Lettere tonde e utilizzo righe superiori e inferiori.");
        System.out.println("Unità Didattica 4: ...");
    }

}