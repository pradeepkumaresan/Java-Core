package com.pradeep.java8.collections.streams;

import com.pradeep.java8.common.MapUtils;
import com.pradeep.java8.common.Person;

import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Person> persons = MapUtils.getListOfPersons();
        System.out.println(persons);


    }
}
