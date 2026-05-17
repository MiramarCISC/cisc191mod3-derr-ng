package edu.sdccd.cisc191;
import java.util.Objects;
public class Triangle extends Shape {
    private String name;
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);

        if (a <= 0 || b <=0 || c <=0 ) {
            throw new IllegalArgumentException("Positive sides needed");
        }
        if (a + b <= c || a + c <=b || b + c <=a) {
            throw new IllegalArgumentException("Triangle needed");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
       double s = perimeter()/2;
       return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle other = (Triangle) o;
        return Double.compare(a, other.a) == 0 && Double.compare(b, other.b) == 0 && Double.compare(c, other.c) == 0
                && Objects.equals(name, other.name);
    }
}
