package com.pradeep.java8.collections.map;

import com.pradeep.java8.util.Person;

import java.util.List;
import java.util.Map;

public class Merge {
    public static void main(String[] args) {
        Map<String, List<Person>> map1 = MapUtils.getMapOfListOfPersons();
        Map<String, List<Person>> map2 = MapUtils.getMapOfListOfPersons();

        map2.forEach(
                (key, value) ->
                    map1.merge(
                            // 1. if this key is not present in map1,
                            // key value pair be directly added to map1.
                            // 2. if the key is already present, we need
                            // to add people from new list in map2 to
                            // existing list in map1 (duplicates allowed).
                            key, value,
                            (existingPeople, newPeople) -> {
                                existingPeople.addAll(newPeople);
                                return existingPeople;
                            }
                    )
        );
        System.out.println(map1);
    }
}
