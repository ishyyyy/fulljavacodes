package com.company;
class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("I am Thread1");
            System.out.println("Cooking");
            i++;
        }

    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("I am Thread2");
            System.out.println("Chatting");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();



    }
}
