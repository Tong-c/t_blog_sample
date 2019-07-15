package com.tong.t20190713;

import java.io.*;

public class SingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //输出true

        //将对象序列化到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance1);
        oos.close();

        //将文件反序列化到对象
        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton instance3 = (Singleton) ois.readObject();
        System.out.println(instance1 == instance3); //输出false
    }
}
