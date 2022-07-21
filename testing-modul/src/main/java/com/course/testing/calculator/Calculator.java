package com.course.testing.calculator;

public class Calculator {

    private int a;
    private  int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
