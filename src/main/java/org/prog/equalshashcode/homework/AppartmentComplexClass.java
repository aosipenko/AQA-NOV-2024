package org.prog.equalshashcode.homework;

public class AppartmentComplexClass {

    public void looksGreat() {
        System.out.println("That looks perfect");
    }

    public static void main(String[] args) {
        AppartmentComplexClass appartmentComplexClass = new AppartmentComplexClass();
        SectionsClass sectionsClass = new SectionsClass();
        AppartmentsClass appartmentsClass = new AppartmentsClass();
        RoomsClass roomsClass = new RoomsClass();
        GoingHome goingHome = new GoingHome();

        appartmentComplexClass.looksGreat();
        sectionsClass.looksGreat();
        appartmentsClass.looksGreat();
        roomsClass.looksGreat();

        goingHome.getHome("Home");
        goingHome.getHome("Home", "work");
        goingHome.getHome("to party", "friends", "a plane");
        goingHome.getHome("to a friend", "home", "taxi", "light is Off");
    }
}
