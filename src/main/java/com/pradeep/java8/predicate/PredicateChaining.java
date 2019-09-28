package com.pradeep.java8.predicate;

import java.util.function.Predicate;

/**
 * with AND and OR
 */
public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<String> below20 = s -> s.length() < 20;
        Predicate<String> above5 = s -> s.length() > 5;

        // String greater than 5 AND less than 20
        Predicate<String> below20AndAbove5 = below20.and(above5);
        System.out.println(below20AndAbove5.test("dsds"));
        System.out.println(below20AndAbove5.test("dsdsds"));

        // String greater than 5 OR less than 20
        Predicate<String> below20OrAbove5 = below20.or(above5);
        System.out.println(below20OrAbove5.test("dsds"));
        System.out.println(below20OrAbove5.test("dsdsds"));
    }
}
