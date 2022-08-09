package com.company;


public class tryy {
    public static void main(String[] args) {
        int a = 5600;
        int b = 0; // Arithmetic Exception will come here
        int c = 0;
        try {
            c = a / b;
            System.out.println("RESULT IS :" + c);

        } catch (Exception e) {
            System.out.println("Exception comes here");
            System.out.println(e);

        }

    }
}
