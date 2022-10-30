package com.course.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> shapeList = new ArrayList<>();

    public ShapeCollector() {
    }

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public int getShapeQuantity() {
        return shapeList.size();
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getShape(int shapeNum) {
        if (shapeNum >= 0 && shapeNum < shapeList.size()) {
            return (Shape) shapeList.get(shapeNum);
        }
        return null;
    }

    public void shoWFigures() {
        for (Shape shape : shapeList) {
            shape.getShapeName();
        }
    }
}
