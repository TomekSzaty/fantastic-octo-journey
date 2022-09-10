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
        ForumPost forumPost = new ForumPost(postBody,
                author);
        posts.add(forumPost);

    }

    public void addComment(ForumPost forumPost, String author, String commentBody) {
        ForumComment forumComment = new ForumComment(forumPost,
                commentBody,
                author);
        comments.add(forumComment);
    }

    public String getAkaUser() {
        return akaUser;
    }

    public String getRealName() {
        return realName;
    }

    public int getPostQuantity() {
        return posts.size();
    }

    public int getCommentQuantity() {
        return comments.size();
    }

    public ForumPost getPosts(int postNum) {
        if (postNum >= 0 && postNum < posts.size()) {
            return posts.get(postNum);
        }
        return null;
    }

    public ForumComment getComments(int commentNum) {
        ForumComment forumComment;
        forumComment = null;
        if (commentNum >= 0 && commentNum < comments.size()) {
            forumComment = comments.get(commentNum);
        }
        return forumComment;
    }

    public boolean removePost(ForumPost post) {
        boolean result = false;
        if(posts.contains(post)) {
            posts.remove(post);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment comment) {
        boolean result = false;
        if (comments.contains(comment)) {
            comments.remove(comment);
            result = true;
        }
        return result;
    }
}
