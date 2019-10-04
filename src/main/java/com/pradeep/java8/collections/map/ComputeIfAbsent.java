package com.pradeep.java8.collections.map;

import com.pradeep.java8.common.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * all compute* methods return the value
 * it could have been in the map before or computed just now
 */
public class ComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, Map<String, Person>> map = new HashMap<>();
        Person john = new Person("John", "Connor", 40);


        map.computeIfAbsent("one", key -> new HashMap<>());
        map.computeIfAbsent("one", key -> new HashMap<>()).put("two", john);

        System.out.println(map);

        john.setAge(45);
        map.computeIfAbsent("one", key -> new HashMap<>()).put("two", john);
        System.out.println(map);
    }
}
