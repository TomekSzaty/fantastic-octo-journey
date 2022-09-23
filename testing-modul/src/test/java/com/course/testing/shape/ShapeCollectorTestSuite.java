package com.course.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeTestSuite \u25B3 \u25A1 \u25CB")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start tests!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests end");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Test number: "+ testCounter);
    }

    @Test
    void testAddShape() {
        //Given
        Shape circle = new Circle("Cricle1", 20.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(1, shapeCollector.getShapeQuantity());
    }

    @Test
    void testRemoveShape() {
        //Given
        Shape triangle = new Triangle("Triangle1", 10.5, 15.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @Test
    void testGetFigure() {
        //Given
        Shape square = new Square("Square1", 9);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedShape =  shapeCollector.getShape(0);
        //Then
        Assertions.assertEquals(square, retrievedShape);

    }

    @Test
    void testGetNamesFigure() {
        //Given
        Shape shape;
        Shape square = new Square("Square1", 9);
        Shape circle = new Circle("Circle1", 9.5);
        Shape triangle = new Triangle("Triangle1", 9.4, 5.8);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        //ShapeCollector shapeCollector2= new ShapeCollector(triangle);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //Then
        shapeCollector.shoWFigures();
        // need implement assertions
    }
}
