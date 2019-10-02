package com.pradeep.java8.collections.list;

import com.pradeep.java8.common.ListUtils;
import com.pradeep.java8.common.Person;

import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Person> list = ListUtils.getPersonList();

        ListUtils.printPersonList(list);

        System.out.println();

        // takes a unary operator
        list.sort(Comparator.comparing(Person::getFirstName)
                            .thenComparing(Person::getAge));

        ListUtils.printPersonList(list);
    }
}
