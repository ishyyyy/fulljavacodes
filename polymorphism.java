package com.company;

interface Camera2
{   void openCamera();
    void clickPhoto();

}
interface Gallery2{
    void cameraImages();
    void whatsappImages();
    void savedImages();
}
class Phone {
    public void Whatsapp(){
        System.out.println("Whatsapp old version");
    }
    public void Facebook(){
        System.out.println("open facebook on web");
    }
}
class Smartphone extends Phone implements Camera2,Gallery2{
    public void Whatsapp(){
        System.out.println("Automatically Upgraded to Latest version in New Smart PHone");
    }
    public void Facebook(){
        System.out.println("no need to open web ,open Facebook app on New Smartphone");
    }

    @Override
    public void openCamera() {
        System.out.println("-----CAMERA-----");

    }

    @Override
    public void clickPhoto() {
        System.out.println("-----CLICK PHOTO-----");

    }

    @Override
    public void cameraImages() {
        System.out.println("OPEN CAMERA IMAGES");


    }

    @Override
    public void whatsappImages() {
        System.out.println("OPEN WHATSAPP IMAGES");

    }

    @Override
    public void savedImages() {
        System.out.println("OPEN SAVED IMAGES");

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Phone obj=new Smartphone();
        obj.Whatsapp();
        obj.Facebook();

    }
