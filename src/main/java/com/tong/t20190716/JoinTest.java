package com.tong.t20190716;


public class JoinTest implements Runnable {

    public static int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            a = a + 1;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread joinThread = new Thread(new JoinTest());
        joinThread.start();
        joinThread.join();
        System.out.println(a);
    }
}
