package edu.sdccd.cisc191;

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
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 && Objects.equals(name, other.name);
    }
}
