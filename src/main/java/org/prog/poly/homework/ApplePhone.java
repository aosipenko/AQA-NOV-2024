package org.prog.poly.homework;

public class ApplePhone implements ICellPhone {

// ApplePhone class implementing ICellPhone


    @Override
    public void call(String phoneNumber) {
        System.out.println("Apple phone calling " + phoneNumber);
    }

    @Override
    public void scanBiometrics() {
        System.out.println("Apple phone scanning biometrics...");
    }

    @Override
    public void makePhoto() {
        System.out.println("Apple phone taking a photo.");
    }
}
