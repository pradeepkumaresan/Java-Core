package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Persons;

import java.util.Map;

import static com.pradeep.java8.collections.map.MapUtils.getMap;
import static com.pradeep.java8.collections.map.MapUtils.printMap;

public class ForEachGetDefaultPutAbsent {
    public static void main(String[] args) {
        Map<String, Persons> map = getMap();
        System.out.print("For each: \n");
        printMap(map);

        Persons natasha = new Persons("Natasha", "Romanoff", 30);
        System.out.println("getting black widow when its not in map: " +
                map.get("blackWidow"));
        System.out.println("get or default to a value: " +
                map.getOrDefault("blackWidow", natasha));

        System.out.println("\nlist unchanged: ");
        printMap(map);

        System.out.println("returns null if natasha is not present and added it: " +
                map.putIfAbsent("blackWidow", natasha));
        printMap(map);

        natasha.setAge(35);
        System.out.println("change Natasha value and put if absent.\n " +
                "returns the value as key object is same even though underlying\n" +
                "value has changed: " +
                map.putIfAbsent("blackWidow", natasha));
        printMap(map);
        System.out.println(map.putIfAbsent("blackWidow", natasha));
    }
}
