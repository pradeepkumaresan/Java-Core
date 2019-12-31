package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Persons;

import java.util.Map;

import static com.pradeep.java8.collections.map.MapUtils.getMap;
import static com.pradeep.java8.collections.map.MapUtils.printMap;

public class Replace {
    public static void main(String[] args) {
        Map<String, Persons> map = getMap();

        Persons natasha = new Persons("Natasha", "Romanoff", 30);

        map.put("blackWidow", natasha);

        System.out.println("added Natasha");
        printMap(map);

        Persons natashaNew = new Persons("Natasha", "Romanoff", 35);

        System.out.println("false: " + map.replace("blackWidow", natashaNew, natasha));
        System.out.println("true as existing value matches the passed object: " +
                map.replace("blackWidow", natasha, natashaNew));

        System.out.println();
        printMap(map);
    }
}
