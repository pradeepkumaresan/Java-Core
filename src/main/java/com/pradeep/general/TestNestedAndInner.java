package com.pradeep.general;

public class TestNestedAndInner {
    public static void main(String[] args) {
        NestedClass.Nested nested = new NestedClass.Nested();

        InnerClass.Inner inner = new InnerClass().new Inner();
        inner.innerVar = null;
    }

}
