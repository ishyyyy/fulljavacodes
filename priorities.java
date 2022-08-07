package com.company;
class priority extends Thread{
    public void run(){
        System.out.println("I,m Thread : "+ Thread.currentThread().getName());
        System.out.println("I,m Thread : "+ Thread.currentThread().getPriority());
    }
}

public class trial {
    public static void main(String[] args) {
        priority p1=new priority();
        priority p2=new priority();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p1.start();
        p2.start();
    }
}
