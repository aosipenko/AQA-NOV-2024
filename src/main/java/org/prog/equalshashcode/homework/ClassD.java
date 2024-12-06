package org.prog.equalshashcode.homework;

class ClassD extends ClassC {
    @Override
    public void baseMethod() {
        System.out.println("Overridden method in ClassD");
    }

    // Method overloading in ClassD
    public void overloadedMethod(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    public void overloadedMethod(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public void overloadedMethod(int a, int b, int c) {
        System.out.println("Method with three parameters: " + a + ", " + b + ", " + c);
    }
}

