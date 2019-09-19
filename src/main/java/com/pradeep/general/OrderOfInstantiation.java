package com.pradeep.general;

public class OrderOfInstantiation {
    public static void main(String[] args) {
        System.out.println("First ever instantiation");
        new Sub().hello();
        System.out.printf("%s\n", "------------ Second and subsequent instantiations");
        new Sub().hello();
    }
}

class Base {
    static {
        System.out.printf("%s - %s - %s\n", "base", "static", "block");
    }

    {
        System.out.printf("%s - %s - %s\n", "base", "instance", "block");
    }

    public Base() {
        System.out.printf("%s - %s\n", "base", "constructor");
    }

    public void init() {
        System.out.printf("%s - %s\n", "base", "PostConstruct");
    }

    public void hello() {
        System.out.printf("%s - %s\n", "base", "method");
    }
}

class Sub extends Base {
    static {
        System.out.printf("%s - %s - %s\n", "sub", "static", "block");
    }

    {
        System.out.printf("%s - %s - %s\n", "sub", "instance", "block");
    }

    public Sub() {
        System.out.printf("%s - %s\n", "sub", "constructor");
    }

    public void init() {
        System.out.printf("%s - %s\n", "sub", "PostConstruct");
    }

    @Override
    public void hello() {
        // super.hello();
        System.out.printf("%s - %s\n", "sub", "method");
    }
}
