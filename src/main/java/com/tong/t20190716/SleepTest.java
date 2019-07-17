package com.tong.t20190716;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepTest {

    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("线程A开始睡眠");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程A结束睡眠");
                lock.unlock();
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("线程B开始睡眠");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程B结束睡眠");
                lock.unlock();
            }
        };

        threadA.start();
        threadB.start();
    }
}
