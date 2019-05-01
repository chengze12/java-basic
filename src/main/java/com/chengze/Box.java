package com.chengze;

public class Box<T> {
    T obj;

    void put(T obj) {
        this.obj = obj;
    }

    T get() {
        return this.obj;
    }
}
