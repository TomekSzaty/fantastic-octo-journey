package com.course.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String akaUser;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String akaUser, String realName) {
        this.akaUser = akaUser;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {

    }

    public void addComment(ForumPost forumPost, String author, String commentBody) {

    }

    public String getAkaUser() {
        return akaUser;
    }

    public String getRealName() {
        return realName;
    }

    public int getPostQuantity() {
        return 100;
    }

    public int getCommentQuantity() {
        return 100;
    }

    public ForumPost getPosts(int postNum) {
        return null;
    }

    public ForumComment getComments(int commentNum) {
        return null;
    }

    public boolean removePost(ForumPost post) {
        return true;
    }

    public boolean removeComment(ForumComment comment) {
        return true;
    }
}
