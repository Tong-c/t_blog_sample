package com.tong.t20210902;

import java.util.ArrayList;
import java.util.List;

public class AddAllNullPointerException {

    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        List<String> part = null;

        all.addAll(part);


    }
}
