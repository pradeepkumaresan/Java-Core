package com.pradeep.java8.collections.map;

import com.pradeep.java8.common.Person;

import java.util.Map;

import static com.pradeep.java8.common.MapUtils.getMap;
import static com.pradeep.java8.common.MapUtils.printMap;

public class ReplaceAll1 {
    public static void main(String[] args) {
        Map<String, Person> map = getMap();

        printMap(map);

        map.replaceAll((k, v) -> {
            if (k.equals("thanos") && v.getFirstName().equals("Josh"))
                v.setFirstName("Father!!!");
            else
                v.setFirstName("Avenger");
            return v;
        });

        printMap(map);
    }
}
