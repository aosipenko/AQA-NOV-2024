package org.prog.poly.homework;

// AndroidPhone class implementing ICellPhone
public class AndroidPhone implements ICellPhone {

    @Override
    public void call(String phoneNumber) {
        System.out.println("Android phone calling " + phoneNumber);
    }

    @Override
    public void scanBiometrics() {
        System.out.println("Android phone scanning biometrics...");
    }

    @Override
    public void makePhoto() {
        System.out.println("Android phone taking a photo.");
    }
}


