package com.capgemini.java.course.pages;

public interface Closeable {
    default void close(){
        System.out.println("default close method");

    }
}
