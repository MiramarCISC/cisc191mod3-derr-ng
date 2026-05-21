package edu.sdccd.cisc191;

import java.util.Objects;

/**
 * Rectangle implementation of Shape
 */
public class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(String name, double length, double width) {
        super(name);

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive values");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return getName().equals(other.getName()) &&
                Double.compare(length, other.length) == 0 &&
                Double.compare(width, other.width) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), length, width);
    }
    @Override
    public String toString() {
        return "Rectangle{name='" + getName() +
                "', length=" + length +
                ", width=" + width + "}";
    }
}