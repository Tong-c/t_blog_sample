package com.tong.t20190613;

public class ConstructorSafeSingleton {

    private static volatile ConstructorSafeSingleton instance = null;

    private ConstructorSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("duplicate instance create error !" + ConstructorSafeSingleton.class.getName());
        }
    }

    public static ConstructorSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ConstructorSafeSingleton.class) {
                if (instance == null) {
                    return new ConstructorSafeSingleton();
                }
            }
        }
        return instance;
    }
}
