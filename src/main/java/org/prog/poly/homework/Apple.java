package org.prog.poly.homework;

public class Apple implements ICellPhone{
    @Override
    public void call() {
        System.out.println("Apple can call");

    }

    @Override
    public void scanBiometrics() {
        System.out.println("Apple can scan Biometrics");

    }

    @Override
    public void makePhoto() {
        System.out.println("Apple can make Photos");

    }
}
