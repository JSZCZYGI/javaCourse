package com.capgemini.java.course.pages;

public class Homepage extends Page implements Closeable {
    public Homepage() {
        super("www.capgemini.com", "Homepage");
    }

    @Override
    public void close() {
        System.out.println("Special treatment for closing method");
    }
}
