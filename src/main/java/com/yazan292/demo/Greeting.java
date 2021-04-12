package com.yazan292.demo;

public class Greeting {
    private Long id;
    private String content;

    public Greeting() {
    }

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return this.id;
    }


    public String getContent() {
        return this.content;
    }




}
