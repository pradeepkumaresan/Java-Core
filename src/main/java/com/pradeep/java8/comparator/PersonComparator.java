package com.pradeep.java8.comparator;

import com.pradeep.java8.util.Persons;

import java.util.Comparator;
import java.util.function.Function;

public class PersonComparator {
    public static void main(String[] args) {
        // One way to create comparators
        Comparator<Persons> comparatorAge =
                (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Persons> comparatorFName =
                (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Persons> comparatorLName =
                (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Persons, Integer> funcAge = Persons::getAge;
        Function<Persons, String> funcLastName = Persons::getLastName;
        Function<Persons, String> funcFirstName = Persons::getFirstName;

        // another way to create comparators
        Comparator<Persons> compAge = Comparator.comparing(funcAge);
        Comparator<Persons> compLName = Comparator.comparing(funcLastName);
        Comparator<Persons> compFName = Comparator.comparing(funcFirstName);

        // comparing by more than one category
        Comparator<Persons> cmpAgeLNameFName = compAge.thenComparing(compLName).thenComparing(compFName);
    }
}
