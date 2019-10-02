package com.pradeep.java8.collections.map;

import java.util.HashMap;
        import java.util.Map;

public class ReplaceAll {

    public static void main(String[] args) {
        Map<String, Boolean> booleanMap = new HashMap<String, Boolean>(2);
        booleanMap.put("A", Boolean.TRUE);
        booleanMap.put("B", Boolean.FALSE);
        booleanMap.put("C", Boolean.TRUE);

        System.out.println("Hashmap created, here are the values");

        // Print out the map
        booleanMap.forEach((k, v) -> System.out.println(k + " " + v));

        // Replaces each entry's value with the result of invoking the given function.
        booleanMap.replaceAll((k, v) -> Boolean.FALSE);

        System.out.println("Hashmap replaceAll, here are the values");

        // Print out the modified values
        booleanMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
