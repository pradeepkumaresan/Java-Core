package com.pradeep.java8.predicate;

import java.util.function.Predicate;

public class PredicateLessThan {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() < 5;

        System.out.println(p.test("sdsd"));
        System.out.println(p.test("sdsdds"));
    }
}
