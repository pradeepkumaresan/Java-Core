package com.pradeep.java8.collections.list;

import com.pradeep.java8.common.ListUtils;
import com.pradeep.java8.common.Person;

import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<Person> list = ListUtils.getPersonList();

        ListUtils.printPersonList(list);

        System.out.println();

        // takes a predicate
        list.removeIf(person -> person.getAge() < 28);

        ListUtils.printPersonList(list);
    }
}
