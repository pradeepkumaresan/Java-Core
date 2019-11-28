package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Person;

import java.util.Map;

import static com.pradeep.java8.collections.map.MapUtils.getMap;
import static com.pradeep.java8.collections.map.MapUtils.printMap;

public class Remove {
    public static void main(String[] args) {
        Map<String, Person> map = getMap();

        Person natasha = new Person("Natasha", "Romanoff", 30);
        map.put("blackWidow", natasha);

        printMap(map);

        Person natashaNew = new Person("Natasha", "Romanoff", 35);
        System.out.println("key value pair not matching: " +
                map.remove("blackWidow", natashaNew));

        System.out.println("key value pair matching. \nremoved Natasha: " +
                map.remove("blackWidow", natasha));

        System.out.println();
        printMap(map);
    }
}
