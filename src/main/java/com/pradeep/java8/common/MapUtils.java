package com.pradeep.java8.common;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static Map<String, Person> getMap() {
        Map<String, Person> map = new HashMap<>();
        map.put("captainAmerica", new Person("Steve", "Rogers", 95));
        map.put("ironMan", new Person("Tony", "Stark", 40));
        map.put("hulk", new Person("Steve", "Banner", 35));
        map.put("antMan", new Person("Scott", "Lang", 37));
        map.put("spiderman", new Person("Peter", "Parker", 17));
        map.put("thanos", new Person("Josh", "Brolin", 50));

        return map;
    }

    public static void printMap(Map<String, Person> map) {
        map.forEach(
                (key, value) ->
                        System.out.println(key + " " + value.getFirstName() + " " + value.getAge()));
        System.out.println();
    }

}
