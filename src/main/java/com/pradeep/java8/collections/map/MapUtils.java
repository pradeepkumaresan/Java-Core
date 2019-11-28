package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Person;

import java.util.*;

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

    public static List<Person> getListOfPersons(){
        return new ArrayList<>(getMap().values());
    }

    public static Map<String, List<Person>> getMapOfListOfPersons() {
        Map<String, List<Person>> map = new HashMap<>();
        List<Person> list = new ArrayList<>();

        list.add(new Person("Steve", "Rogers", 95));
        map.put("Queens", list);

        /*list = new ArrayList<>();
        list.add(new Person("Tony", "Stark", 40));
        map.put("San Francisco", list);

        list = new ArrayList<>();
        list.add(new Person("Steve", "Banner", 35));
        map.put("Mid West", list);

        list = new ArrayList<>();
        list.add(new Person("Scott", "Lang", 37));
        map.put("New York", list);*/

        list = new ArrayList<>();
        list.add(new Person("Peter", "Parker", 17));
        map.put("Brooklyn", list);

        /*list = new ArrayList<>();
        list.add(new Person("Josh", "Brolin", 50));
        map.put("Titan", list);*/

        return map;
    }

    /*public static Map<String, List<Person>> getMapOfListOfPersons1() {
        Map<String, List<Person>> map = new HashMap<>();
        List<Person> list = new ArrayList<>();

        list.add(new Person("Steve", "Rogers", 95));
        map.put("Queens1", list);

        *//*list = new ArrayList<>();
        list.add(new Person("Tony", "Stark", 40));
        map.put("San Francisco1", list);

        list = new ArrayList<>();
        list.add(new Person("Steve", "Banner", 35));
        map.put("Mid West1", list);

        list = new ArrayList<>();
        list.add(new Person("Scott", "Lang", 37));
        map.put("New York1", list);*//*

        list = new ArrayList<>();
        list.add(new Person("Peter", "Parker", 17));
        map.put("Brooklyn1", list);

        *//*list = new ArrayList<>();
        list.add(new Person("Josh", "Brolin", 50));
        map.put("Titan1", list);*//*

        return map;
    }*/

    public static void printMap(Map<String, Person> map) {
        map.forEach(
                (key, value) ->
                        System.out.println(key + " " + value.getFirstName() + " " + value.getAge()));
        System.out.println();
    }
}
