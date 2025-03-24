package com.github.vittoriaalata.callidattilografia.Calli;

import java.util.HashMap;

public class Dizionari {

    static HashMap<String, Integer> GiunzioneLettereCarrelloFinale = new HashMap<>();
    static HashMap<String, Integer> GiunzioneLettereRulloFinale = new HashMap<>();
    static {
        GiunzioneLettereCarrelloFinale.put("a",10);
        GiunzioneLettereCarrelloFinale.put("f",10);
        GiunzioneLettereCarrelloFinale.put("@",10);
        GiunzioneLettereCarrelloFinale.put("_",10);
        GiunzioneLettereRulloFinale.put("a",5);
        GiunzioneLettereRulloFinale.put("f",-5);
        GiunzioneLettereRulloFinale.put("@",5);
        GiunzioneLettereRulloFinale.put("_",5);
    }


}
