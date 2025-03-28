package com.github.vittoriaalata.callidattilografia.Calli;

public enum Costanti {
    Calli;

    public static boolean DevMode = false;
    static int DelayMillisPunto = DevMode ? 0 : 230;
    public static char UnitaScrittura = '█';
    public static char UnitaSfondo = '░';
    public static String UnitaScrittura3D = "█";
    public static String UnitaSfondo3D = "░";
    public static boolean RichiestaInputSezioni = true;
    public static String caricamento = "...";
    public static int DelayMillisSezioni = DevMode ? 0 : 1000;

}
