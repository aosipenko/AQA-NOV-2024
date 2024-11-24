package org.prog.poly.homework;

/** TODO: HOMEWORK
 * Write interface for a cell phone which can (ICellPhone):
 * - call
 * - scan biometrics
 * - make photo
 *
 * Add Adnroid and Apple phones which implement this interface
 * Write method that will accept ICellPhone as parameter
 * And it will scan,make photo, call;
 */
public class PolyHomeWork {

    public static void main(String[] args){
        Apple apple = new Apple();
        Android android = new Android();

        phoneFunctions(apple);
        phoneFunctions(android);
    }

public static void phoneFunctions (ICellPhone iCellPhone) {
    iCellPhone.scanBiometrics();
    iCellPhone.makePhoto();
    iCellPhone.call();

}
}


