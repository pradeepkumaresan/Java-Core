package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Person;

import java.util.Map;

public class EqualityInMapAndUnderlyingDatastructures {
    public static void main(String[] args) {
        Map<String, Person> map1 = MapUtils.getMap();
        Map<String, Person> map2 = MapUtils.getMap();

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));

        map2.replaceAll((k, v) -> {
            v.setAge(100);
            return v;
        });

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));

        Person sam = new Person("Sam", "Mendes", 40);
        Person sam1 = new Person("Sam", "Mendes", 40);

        System.out.println(sam == sam1);
        System.out.println(sam.equals(sam1));
    }
}
