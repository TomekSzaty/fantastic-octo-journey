package com.course.testing.forum.tdd;

import com.course.testing.forum.ForumComment;
import com.course.testing.forum.ForumPost;
import com.course.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: ForumTestSuite \uD83D\uDE31")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Posts")
    class TestPosts {
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            //When
            forumUser.addPost("Szaka", "This is my first post");
            //Then
            Assertions.assertEquals(1, forumUser.getPostQuantity());
        }

        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost
                    ("Hello all, this is my first contribution here",
                            "Szaka");
            forumUser.addPost(forumUser.getAkaUser(), forumPost.getPostBody());

            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPosts(0);

            //Then
            Assertions.assertEquals(forumPost, retrievedPost);
        }

        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost("Hello all, this is my first contribution here", forumUser.getAkaUser());
            //When
            boolean result = forumUser.removePost(forumPost);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost("Hello all, this is my first contribution here", "Szaka");
            forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());

            //When
            boolean result = forumUser.removePost(forumPost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for Comments")
    class TestComments {

        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost
                    ("Hello all, this is my first contribution here",
                            "Szaka");
            //When
            forumUser.addComment(forumPost,
                    "Szaka",
                    "Thanks for all good words ");
            //Then
            Assertions.assertEquals(1, forumUser.getCommentQuantity());
        }


        @Test
        void testGetComments() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost("Hello all, this is my first contribution here",
                    "Szaka");
            ForumComment forumComment = new ForumComment(
                    forumPost,
                    "Thanks for all good words",
                    forumUser.getAkaUser()
            );
            forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());

            //When
            ForumComment retrievedForumComment;
            retrievedForumComment = forumUser.getComments(0);

            //Then
            Assertions.assertEquals(forumComment, retrievedForumComment);
        }


        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost("Hello all, this is my first contribution here", forumUser.getAkaUser());
            ForumComment forumComment = new ForumComment(forumPost, "Thanks for all good words", forumUser.getAkaUser());

            //When
            boolean result = forumUser.removeComment(forumComment);

            //Then
            Assertions.assertFalse(result);
        }


        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("Szaka", "TomekSz");
            ForumPost forumPost = new ForumPost("Hello all, this is my first contribution here", "Szaka");
            ForumComment forumComment = new ForumComment(forumPost, "thank you for your all good words", "Szaka");
            forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
            //When
            boolean result = forumUser.removeComment(forumComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentQuantity());
        }
    }
}

