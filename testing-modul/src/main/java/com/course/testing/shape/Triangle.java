package com.course.testing.shape;

public class Triangle implements Shape{
    private String name;
    private double edge;
    private double height;

    public Triangle(String name, double edge, double height) {
        this.name = name;
        this.edge = edge;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void getShapeName() {
        System.out.println("This is: " + getName());
    }

    @Override
    public void getField() {
        double field = edge * height / 2;
        System.out.println("Field = " + field);
    }
}
