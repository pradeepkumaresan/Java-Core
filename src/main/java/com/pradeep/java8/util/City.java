package com.pradeep.java8.util;

/**
 *
 * @author José Paumard
 */
public class City {

    private String name ;
    
    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + '}';
    }
}
