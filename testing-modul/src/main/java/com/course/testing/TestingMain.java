package com.course.testing;

import com.course.testing.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {

//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getName();
//
//        if (result.equals("theForumUser")) {
//            System.out.println("Test Ok");
//        } else {
//            System.out.println("Fail");
//        }

//        Calculator calculator = new Calculator();
//
//        int resultAdd = calculator.add(4, 5);
//
//        if (resultAdd == 9) {
//            System.out.println("Test adding OK");
//        } else {
//            System.out.println("Test adding FAIL");
//        }
//
//        int resultSub = calculator.sub(10, 7);
//        if(resultSub == 3) {
//            System.out.println("Test subtract OK");
//        } else {
//            System.out.println("Test subtract FAIL");
//        }
        //System.out.println(Calculator.class);

        //metoda szukajaca miejsc zerowych funkcji kwadratowej
        final int index = 5;

        List<int[]> dane = new ArrayList<>();
        dane.add(new int[]{1, 2, 3});
        dane.add(new int[]{-10, 5, 7});

        for (int i = 0; i < dane.size(); i++) {
            int d = delta(dane.get(i)[0], dane.get(i)[1], dane.get(i)[2]);
            policzMiejsca(d, dane.get(i)[0], dane.get(i)[1], dane.get(i)[2]);
        }
    }

    public static int delta(int x, int y, int z) {
        return y * y - 4 * x * z;
    }

    private static void policzMiejsca(int d, int x, int y, int z) {
        if (d == 0) {
            System.out.println("Jedno rozwiązanie: " + -y / 2 * x);
        } else {
            System.out.println("Dwa rozwiązania: " + ((-y - d ^ 1 / 2) / 2 * x) + " i " + ((-y + d ^ 1 / 2) / 2 * x));
        }
    }
}
