package com.learnprogramming;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();

        if (language.containsKey("java")) {
            System.out.println("java is in the map already");
        } else {
            System.out.println("Adding java");
            language.put("java", "a java language");
        }


        language.put("Python", "a python language");


        if (language.containsKey("java")) {
            System.out.println("java is in the map already");
        } else {
            language.put("java", "a java language");

        }

//        System.out.println(language.remove("Python"));

        System.out.println("===============================================");
        for (String key: language.keySet()) {
            System.out.println(key + " : " + language.get(key));
        }

        System.out.println(language.replace("java", "a java language after replacement"));

        System.out.println("===============================================");
        for (String key: language.keySet()) {
            System.out.println(key + " : " + language.get(key));
        }
    }
}
