package com.company;
class priority2 extends Thread{
    public priority2(String name){
        super(name);

    }
    public void run(){
        int i=0;
        while(i<30){
            System.out.println("Priority Name :"+this.getName());
            i++;
        }
    }

}

public class trial2 {
    public static void main(String[] args) {
        priority2 t1=new priority2("Isha 1");
        priority2 t2=new priority2("Isha 2");
        priority2 t3=new priority2("Isha 3");
        priority2 t4=new priority2("Isha 4");
        priority2 t5=new priority2("Isha 5");
        priority2 t6=new priority2("Isha 6");
        priority2 t7=new priority2("Isha 7 (most Important)");
        t7.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();


    }
}
