package com.pradeep.java8.collections.list;

import com.pradeep.java8.streams.ListUtils;
import com.pradeep.java8.util.Persons;

import java.util.List;

public class ReplaceAllExample {
    public static void main(String[] args) {
        List<Persons> list = ListUtils.getPersonList();

        ListUtils.printPersonList(list);

        System.out.println();

        // takes a unary operator
        list.replaceAll(person -> {
            if (person.getFirstName().equals("Pradeep"))
                person.setFirstName("Praddy");
            return person;
        });

        ListUtils.printPersonList(list);

        System.out.println();

        list.replaceAll(person -> {
            person.setFirstName(person.getFirstName().toUpperCase());
            return person;
        });

        ListUtils.printPersonList(list);
    }
}
