package com.tong.t20190713;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class SingletonTest {

    public static void main(String[] args) throws IOException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //输出true


    }
}
