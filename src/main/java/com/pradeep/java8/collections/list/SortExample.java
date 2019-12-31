package com.pradeep.java8.collections.list;

import com.pradeep.java8.streams.ListUtils;
import com.pradeep.java8.util.Persons;

import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Persons> list = ListUtils.getPersonList();

        ListUtils.printPersonList(list);

        System.out.println();

        // takes a unary operator
        list.sort(Comparator.comparing(Persons::getFirstName)
                            .thenComparing(Persons::getAge));

        ListUtils.printPersonList(list);
    }
}
