package com.pradeep.general;

/**
 * static methods cannot access non-static fields and methods.
 * Non-static methods can access static fields and methods.
 *
 * Static fields and methods are not tied to any instance of the class.
 * Instead they are tied to the class itself.
 */
public class StaticNonStatic {
    static Object staticObj;
    Object nonStaticObj;

    public static void main(String[] args) {
        staticObj = null;
        //nonStaticObj = null; non-static field cannot be referenced in static context.
        //test(); non-static method cannot be referenced in static context.
    }

    public void test(){
        staticObj = null;
        nonStaticObj = null;

    }
}
