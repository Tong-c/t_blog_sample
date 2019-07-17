package com.tong.t20190716;

public class JoinTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread joinThread = new Thread(new RunnableImpl());
        ThreadTest threadTest = new ThreadTest(joinThread);//threadTest线程获得 joinThread 对象锁后休眠 9000

        threadTest.start();
        joinThread.start();

        joinThread.join(); //join 方法执行后，joinThread 线程执行完毕，但是主线程继续阻塞了一段时间，等待 threadTest 线程释放 joinThread 对象锁
        System.out.println("joinFinish");
    }
}
