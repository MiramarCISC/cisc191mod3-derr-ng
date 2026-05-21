package edu.sdccd.cisc191;

<<<<<<< HEAD
import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }
@Override
    public double area() {
        return Math.PI * radius * radius;
=======
public class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        if (radius < 0) {
            throw new IllegalArgumentException("Can't have a negative radius.");
        }
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
>>>>>>> d9ee3ee976b987c579a7ab5e671ac736523e6566
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
<<<<<<< HEAD
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 && Objects.equals(name, other.name);
=======

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) obj;

        return getName().equals(other.getName()) && Double.compare(radius, other.radius) == 0;
>>>>>>> d9ee3ee976b987c579a7ab5e671ac736523e6566
    }
}
