
package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Chicken",2));
        shapes.add(new Rectangle("Meow",3,4));
        shapes.add(new Triangle("Waow",3,4,5));

        for (Shape s : shapes){
            System.out.println(s.describe());
        }

        shapes.sort(Comparator.comparingDouble(Shape::area)); // Should I create a defensive copy here??
        System.out.println("Sorted by area (least to greatest):");
        shapes.forEach(System.out::println);


    }
}
