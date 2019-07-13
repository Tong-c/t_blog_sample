package com.tong.t20190613;

import com.tong.t20190613.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //单例模式创建Singleton对象
        Singleton instance1 = Singleton.getInstance();

        //反射创建Singleton对象
        Constructor constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = (Singleton) constructor.newInstance();

        //比较对象地址值
        System.out.println(instance1 == instance2); //输出false
    }
}
