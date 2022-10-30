package com.course.testing.forum;

public class SimpleUser {
    private String name;
    private String realName;


    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public SimpleUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
}
