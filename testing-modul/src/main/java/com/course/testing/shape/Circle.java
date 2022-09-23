package com.course.testing.shape;

public class Circle implements Shape {

    private String name;
    private Double radius;

    public Circle(String name, Double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void getShapeName() {
        System.out.println("This is " +  getName());
    }

    @Override
    public void getField() {
        System.out.println("Field :" +  (3.14 * radius * radius));
    }
}
