package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Persons;

import java.util.*;

public class MapUtils {
    public static Map<String, Persons> getMap() {
        Map<String, Persons> map = new HashMap<>();
        map.put("captainAmerica", new Persons("Steve", "Rogers", 95));
        map.put("ironMan", new Persons("Tony", "Stark", 40));
        map.put("hulk", new Persons("Steve", "Banner", 35));
        map.put("antMan", new Persons("Scott", "Lang", 37));
        map.put("spiderman", new Persons("Peter", "Parker", 17));
        map.put("thanos", new Persons("Josh", "Brolin", 50));

        return map;
    }

    public static List<Persons> getListOfPersons(){
        return new ArrayList<>(getMap().values());
    }

    public static Map<String, List<Persons>> getMapOfListOfPersons() {
        Map<String, List<Persons>> map = new HashMap<>();
        List<Persons> list = new ArrayList<>();

        list.add(new Persons("Steve", "Rogers", 95));
        map.put("Queens", list);

        /*list = new ArrayList<>();
        list.add(new Persons("Tony", "Stark", 40));
        map.put("San Francisco", list);

        list = new ArrayList<>();
        list.add(new Persons("Steve", "Banner", 35));
        map.put("Mid West", list);

        list = new ArrayList<>();
        list.add(new Persons("Scott", "Lang", 37));
        map.put("New York", list);*/

        list = new ArrayList<>();
        list.add(new Persons("Peter", "Parker", 17));
        map.put("Brooklyn", list);

        /*list = new ArrayList<>();
        list.add(new Persons("Josh", "Brolin", 50));
        map.put("Titan", list);*/

        return map;
    }

    /*public static Map<String, List<Persons>> getMapOfListOfPersons1() {
        Map<String, List<Persons>> map = new HashMap<>();
        List<Persons> list = new ArrayList<>();

        list.add(new Persons("Steve", "Rogers", 95));
        map.put("Queens1", list);

        *//*list = new ArrayList<>();
        list.add(new Persons("Tony", "Stark", 40));
        map.put("San Francisco1", list);

        list = new ArrayList<>();
        list.add(new Persons("Steve", "Banner", 35));
        map.put("Mid West1", list);

        list = new ArrayList<>();
        list.add(new Persons("Scott", "Lang", 37));
        map.put("New York1", list);*//*

        list = new ArrayList<>();
        list.add(new Persons("Peter", "Parker", 17));
        map.put("Brooklyn1", list);

        *//*list = new ArrayList<>();
        list.add(new Persons("Josh", "Brolin", 50));
        map.put("Titan1", list);*//*

        return map;
    }*/

    public static void printMap(Map<String, Persons> map) {
        map.forEach(
                (key, value) ->
                        System.out.println(key + " " + value.getFirstName() + " " + value.getAge()));
        System.out.println();
    }
}
