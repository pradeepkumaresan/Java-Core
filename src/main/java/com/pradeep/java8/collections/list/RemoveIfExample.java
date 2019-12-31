package com.pradeep.java8.collections.list;

import com.pradeep.java8.streams.ListUtils;
import com.pradeep.java8.util.Persons;

import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<Persons> list = ListUtils.getPersonList();

        ListUtils.printPersonList(list);

        System.out.println();

        // takes a predicate
        list.removeIf(person -> person.getAge() < 28);

        ListUtils.printPersonList(list);
    }
}
