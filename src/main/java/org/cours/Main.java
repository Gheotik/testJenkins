package org.cours;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Transformer georgeTransformer = new Transformer();
        georgeTransformer.AddToken("address","Bout du bout de le chemin");
        georgeTransformer.AddToken("nom","George");
        georgeTransformer.AddToken("company","none");

        //georgeTransformer.RemoveToken("company");

        String phrase = "bonjour, je suis {nom}, et je travail pour {company}";
        System.out.println(georgeTransformer.transformer(phrase));

    }


}