package com.pradeep.java8.comparator;

import java.util.Comparator;
import java.util.function.Function;

public class PersonComparator {
    public static void main(String[] args) {
        // One way to create comparators
        Comparator<Person> comparatorAge =
                (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> comparatorFName =
                (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> comparatorLName =
                (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Person, Integer> funcAge = Person::getAge;
        Function<Person, String> funcLastName = Person::getLastName;
        Function<Person, String> funcFirstName = Person::getFirstName;

        // another way to create comparators
        Comparator<Person> compAge = Comparator.comparing(funcAge);
        Comparator<Person> compLName = Comparator.comparing(funcLastName);
        Comparator<Person> compFName = Comparator.comparing(funcFirstName);

        // comparing by more than one category
        Comparator<Person> cmpAgeLNameFName = compAge.thenComparing(compLName).thenComparing(compFName);
    }
}
