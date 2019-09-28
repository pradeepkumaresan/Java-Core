package com.pradeep.java8.predicate;

import java.util.function.Predicate;

public class PredicateEquals {
    public static void main(String[] args) {
        Predicate<String> pYes = Predicate.isEqual("Yes");
        Predicate<String> pNo = Predicate.isEqual("No");

        System.out.println(pYes.test("sdsd"));
        System.out.println(pYes.test("yes"));
        System.out.println(pYes.test("Yes"));

        System.out.println(pYes.negate().test("No"));
        System.out.println(pYes.or(pNo).test("No"));

    }
}
