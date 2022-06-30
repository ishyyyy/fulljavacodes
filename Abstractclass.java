package com.company;
abstract class Parent3 {
    public Parent3() {
        System.out.println("this is an constructor");
    }

    abstract public void greet();

    {
        System.out.println("good evening!");

    }
}
class Child3 extends Parent3 {
    @Override
    public void greet() {
        System.out.println("good evening");
    }
}

abstract class Child4 extends Parent3{
     public void greet(){
        System.out.println("good Afternoon");
    }
}




public class Abstractclass {
    public static void main(String[] args) {
        Parent3 p3 = new Child3();
        p3.greet();

    }
}