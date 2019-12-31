package com.pradeep.java8.streams;

import com.pradeep.java8.util.Persons;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static List<Persons> getPersonList(){
        List<Persons> list = new ArrayList<>();

        list.add(new Persons("Pradeep", "Kumaresan", 30));
        list.add(new Persons("Arpita", "Agarwal", 29));
        list.add(new Persons("Sandeep", "Kumaresan", 25));
        list.add(new Persons("Saraswathy", "Kumaresan", 53));
        list.add(new Persons("Aashi", "Agarwal", 7));

        return list;
    }

    public static void printPersonList(List<Persons> list){
        list.stream()
                .map(person -> person.getFirstName() + " " + person.getAge())
                .forEach(System.out::println);
    }
}
