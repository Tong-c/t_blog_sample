package com.tong.t20190713;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingleHolder.singleton;
    }

    private static class SingleHolder {
        private static final Singleton singleton = new Singleton();
    }

}
