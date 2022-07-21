package com.course.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {


    public static List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            System.out.println(" Info method - Testing list is empty !");
            return numbers;
        } else {
            for (Integer num : numbers) {
                if (num % 2 == 0) {
                    oddNumbers.add(num);
                }
            }
            System.out.println("Created list odd integers !");
            return oddNumbers;
        }
    }
}
