package com.github.vittoriaalata.callidattilografia.Calli.LP;

import java.util.HashMap;

public class Dizionari {
    static HashMap<String, Integer> GiunzioneLettereCarrelloFinale = new HashMap<>();
    static HashMap<String, Integer> GiunzioneLettereRulloFinale = new HashMap<>();
    static {
        GiunzioneLettereCarrelloFinale.put("a",9);
        GiunzioneLettereCarrelloFinale.put("b",23);
        GiunzioneLettereCarrelloFinale.put("f",10);
        GiunzioneLettereCarrelloFinale.put("@",9);
        GiunzioneLettereCarrelloFinale.put("_",5); //Segnaposto orizzontale _ con offset orizzontale Carrello (x)
        GiunzioneLettereCarrelloFinale.put("-",0); //Segnaposto verticale - azzerato sull'asse x
        GiunzioneLettereCarrelloFinale.put("*",0); //Bresenham Line
        GiunzioneLettereRulloFinale.put("a",0);
        GiunzioneLettereRulloFinale.put("b",0);
        GiunzioneLettereRulloFinale.put("f",-5);
        GiunzioneLettereRulloFinale.put("@",0);
        GiunzioneLettereRulloFinale.put("_",0); //Segnaposto orizzontale _ azzerato sull'asse y
        GiunzioneLettereRulloFinale.put("-",5); //Segnaposto verticale - con offset verticale Rullo (y)
        GiunzioneLettereRulloFinale.put("*",0); //Bresenham Line
    }


}
