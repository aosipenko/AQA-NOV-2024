package org.prog.poly.homework;

import org.prog.poly.Ford;
import org.prog.poly.ICar;
import org.prog.poly.Mazda;

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

    // Method to test ICellPhone functionality
    public static void testCellPhone(ICellPhone phone, String phoneNumber) {
        phone.scanBiometrics();
        phone.makePhoto();
        phone.call(phoneNumber);
    }

    // Main method to run the test
    public static void main(String[] args) {
        ICellPhone androidPhone = new AndroidPhone();
        ICellPhone applePhone = new ApplePhone();

        System.out.println("Testing Android phone:");
        testCellPhone(androidPhone, "123-456-7890");

        System.out.println("\nTesting Apple phone:");
        testCellPhone(applePhone, "987-654-3210");
    }
}



