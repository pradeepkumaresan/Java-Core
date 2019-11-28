package com.pradeep.java8.streams;

import com.pradeep.java8.util.Person;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static List<Person> getPersonList(){
        List<Person> list = new ArrayList<>();

        list.add(new Person("Pradeep", "Kumaresan", 30));
        list.add(new Person("Arpita", "Agarwal", 29));
        list.add(new Person("Sandeep", "Kumaresan", 25));
        list.add(new Person("Saraswathy", "Kumaresan", 53));
        list.add(new Person("Aashi", "Agarwal", 7));

        return list;
    }

    public static void printPersonList(List<Person> list){
        list.stream()
                .map(person -> person.getFirstName() + " " + person.getAge())
                .forEach(System.out::println);
    }
}
