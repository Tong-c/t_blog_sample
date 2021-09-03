package com.tong.t20210902;

import java.util.ArrayList;
import java.util.List;

public class ForEachNullPointerException {

    public static void main(String[] args) {
        List<String> all = null;
        for (String s : all) {
            System.out.println(s);
        }


    }
}
