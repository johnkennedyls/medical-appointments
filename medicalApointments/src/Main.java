import ui.UIMenu;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor("Jim", "Cardiology");
        System.out.println("Doctor Name: " + myDoctor.name);
        System.out.println("Doctor Specialty: " + myDoctor.specialty);


        //showMenu();

    }
}