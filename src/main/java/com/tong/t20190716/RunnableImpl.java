package com.tong.t20190716;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Begin sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End sleep");
    }

}
