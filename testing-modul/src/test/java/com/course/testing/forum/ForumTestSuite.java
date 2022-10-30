package com.course.testing.forum;

import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Test Suite starting");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test Suite ending");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Test Case running");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test Case stop ");
    }

    @DisplayName("""
            When created user with name then method 
            "getName" should return correct AKA name
            """)

    @Test
    void testCaseUserName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("forumUser", "John Doe");

        //When
        String result = simpleUser.getName();
        String expectedName = "forumUser";

        //Then
        Assertions.assertEquals(expectedName, result);
    }
    @DisplayName("""
            When created user with REAl NAME then method 
            "getRealName" should return correct REAL name
            """)

    @Test
    void testCaseUserRealName() {
        //Given
        SimpleUser user = new SimpleUser("forumUser", "John Doe");

        //When
        String result = user.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Doe", result);
    }
}
