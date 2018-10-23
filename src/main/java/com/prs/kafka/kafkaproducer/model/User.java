package com.prs.kafka.kafkaproducer.model;

public class User {
    private String name;
    private int userId;

    public User() {
    }

    public User(final String name, final int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(final int userId) {
        this.userId = userId;
    }

    @Override public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
