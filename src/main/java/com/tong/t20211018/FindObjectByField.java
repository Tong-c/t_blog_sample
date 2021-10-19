package com.tong.t20211018;

import java.util.ArrayList;
import java.util.List;

public class FindObjectByField {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("张三", "1@qq.com"));
        users.add(new User("李四", "2@qq.com"));

        // 查找名称为”张三“的用户
        User user = users.stream()
                        .filter(u -> u.getName().equals("张三"))
                        .findAny()
                        .orElse(null);
        System.out.println("===============");
    }

    private static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
