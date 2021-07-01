package com.company;

public class KronometreThread implements  Runnable {
    private  Thread thread;
    private String threadName;

    public  KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("olusturuluyor..."+threadName);
    }
    @Override
    public void run() {
        System.out.println("calistiriliyor..."+threadName);

        try {
            for(int i=1;i<=10;i++) {
                System.out.println(threadName+" : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi !");
        }

        System.out.println("Thread Bitti."+threadName);

    }
    public  void  start(){
        System.out.println("thread nesnesi olusturuluyor!");
        if(thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
