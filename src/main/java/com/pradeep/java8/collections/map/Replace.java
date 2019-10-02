package com.pradeep.java8.collections.map;

import com.pradeep.java8.common.MapUtils;
import com.pradeep.java8.common.Person;

import java.util.Map;

import static com.pradeep.java8.common.MapUtils.getMap;
import static com.pradeep.java8.common.MapUtils.printMap;

public class Replace {
    public static void main(String[] args) {
        Map<String, Person> map = getMap();

        Person natasha = new Person("Natasha", "Romanoff", 30);

        map.put("blackWidow", natasha);

        System.out.println("added Natasha");
        printMap(map);

        Person natashaNew = new Person("Natasha", "Romanoff", 35);

        System.out.println("false: " + map.replace("blackWidow", natashaNew, natasha));
        System.out.println("true as existing value matches the passed object: " +
                map.replace("blackWidow", natasha, natashaNew));

        System.out.println();
        printMap(map);
    }
}
