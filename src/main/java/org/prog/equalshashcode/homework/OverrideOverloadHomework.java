package org.prog.equalshashcode.homework;

/**
 * Write inheritance classes with depth of 4:
 * classA > classB > classC > classD
 *
 * Add a method to base class
 * Override that method in classB and classD slots
 *
 * Add method with overload to any class with at least 3 samples
 * method(a), method(a,b) method(a,b,c)
 */

public class OverrideOverloadHomework {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        ClassD objD = new ClassD();

        // Testing overridden methods
        objA.baseMethod(); // Calls ClassA's method
        objB.baseMethod(); // Calls ClassB's overridden method
        objC.baseMethod(); // Calls ClassB's overridden method (inherited)
        objD.baseMethod(); // Calls ClassD's overridden method

        // Testing overloaded methods in ClassD
        objD.overloadedMethod(1);
        objD.overloadedMethod(1, 2);
        objD.overloadedMethod(1, 2, 3);
    }
}
