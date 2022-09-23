package com.course.testing.shape;

public class Square implements Shape {
    private String name;
    private int edge;

    public Square(String name, int edge) {
        this.name = name;
        this.edge = edge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void getShapeName() {

        System.out.println("This is: " + getName());
    }

    @Override
    public void getField() {
        System.out.println("Field = " + edge * edge);
    }
}
