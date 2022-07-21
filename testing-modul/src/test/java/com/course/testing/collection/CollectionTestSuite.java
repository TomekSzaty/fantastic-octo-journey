package com.course.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Collection Test Suite starting");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Collection Test Suite ending");
    }

    @BeforeEach
    void before() {
        System.out.println("Test Case running");
    }

    @AfterEach
    void after() {
        System.out.println("Test case stop");
    }

    @DisplayName("""
            When list is empty method \"exterminate\"
            should return info 
            """)
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> listNum = OddNumbersExterminator.exterminate(emptyList);
        //System.out.println("Testing list is empty !");

        //Then
        Assertions.assertEquals(emptyList, listNum);
    }

    @DisplayName("""
            When list is fulfilled method \"exterminate\"
            should return new list with  odd numbers
            """)
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> myOddList = new ArrayList<>(Arrays.asList(2,4,6));

        //When
        List<Integer> expectedList = OddNumbersExterminator.exterminate(myList);
        //Then
        Assertions.assertEquals( myOddList, expectedList);
    }
}
