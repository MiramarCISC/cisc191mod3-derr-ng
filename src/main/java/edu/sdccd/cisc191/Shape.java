package edu.sdccd.cisc191;

import java.util.Comparator;

public abstract class Shape implements Measurable, Comparable<Shape> {
    protected String name;

    public Shape(String name) {
        if  (name == null) {
            throw new IllegalArgumentException("shape must have a name");
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Shape o) {
        return this.name.compareTo(o.name);
    }
    public abstract double area();
    public abstract double perimeter();

    public String describe() {
        return name;
    }
}
