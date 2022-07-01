package com.company;
class A{
    int a;
    public void func(int b){
        a=b;

    }
    public void func(){ //method overridden
        System.out.println("i am in class A");
    }

}
class B extends A{
    @Override
    public void func(){ //method overriding
        System.out.println("i am in class B ");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.func();

        B b=new B();
        b.func();


    }
}
