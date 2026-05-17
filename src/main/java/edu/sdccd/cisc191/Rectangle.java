package edu.sdccd.cisc191;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Need positive values");
        }
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) o;
        return Double.compare(width, other.width) == 0 && Double.compare(height, other.height) == 0
                && Objects.equals(name, other.name);

    }
}
