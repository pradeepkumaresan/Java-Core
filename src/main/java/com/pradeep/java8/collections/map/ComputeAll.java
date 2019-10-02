package com.pradeep.java8.collections.map;

import com.pradeep.java8.common.Person;

import java.util.HashMap;
import java.util.Map;

import static com.pradeep.java8.common.MapUtils.getMap;
import static com.pradeep.java8.common.MapUtils.printMap;

/**
 * Constraints for execution -
 * compute() - always executes. key present or absent. value present or absent.
 * computeIfPresent() - key's value present and not null.
 * computeIfAbsent() - key is not already associated with a value or is mapped to null.
 */
public class ComputeAll {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println(map);

        // key present. value non-null. it computes new value(2)
        // and adds it to key.
        map.compute("A", (k, v) -> (v == null ? 0 : v + 1));
        System.out.println(map);

        // key absent. value null. it computes new value(0)
        map.compute("D", (k, v) -> (v == null ? 0 : v + 1));
        System.out.println(map);

        // key present. value non null.
        // it computes new value(1) and adds it to key.
        map.computeIfPresent("D", (k, v) -> v + 1);
        System.out.println(map);

        // key absent. it computes new value(1) and adds it to key.
        map.computeIfAbsent("E", v -> 1);
        System.out.println(map);

        map.put("E", null);

        // key present. value null. so computes new key
        map.computeIfAbsent("E", v -> 2);
        System.out.println(map);

        // key present. value not null. so no compute
        map.computeIfAbsent("E", v -> 3);
        System.out.println(map);

    }
}
