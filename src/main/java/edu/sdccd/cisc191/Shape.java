package edu.sdccd.cisc191;

<<<<<<< HEAD
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
=======
public abstract class Shape implements Measurable, Comparable<Shape> {

    private String name;
    public Shape(String name){
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("Shape name is null or empty");
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String describe() {
        return String.format(
                "%s - '%s' | Area = %.3f | Perimeter = %.3f",
                getClass().getSimpleName(), name, area(), perimeter()
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%s - '%s' - %.3f",
                getClass().getSimpleName(), name, area()
        );
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) {
        return this.getName().compareTo(other.getName());
    }
}
>>>>>>> d9ee3ee976b987c579a7ab5e671ac736523e6566
