package com.tong.t20210915;

import java.util.ArrayList;
import java.util.List;

public class StreamListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String[] array = list.stream().toArray(String[]::new);
        System.out.println("--------");
    }
}
