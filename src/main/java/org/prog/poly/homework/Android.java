package org.prog.poly.homework;

public class Android implements ICellPhone{
    @Override
    public void call() {
        System.out.println("Android can call");
    }

    @Override
    public void scanBiometrics() {
        System.out.println("Android can scan Biometrics");

    }

    @Override
    public void makePhoto() {
        System.out.println("Android can make Photos");

    }
}