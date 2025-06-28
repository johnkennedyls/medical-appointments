import ui.UIMenu;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor("Jim", "Cardiology");
        System.out.println("Doctor Name: " + myDoctor.name);
        System.out.println("Doctor Specialty: " + myDoctor.specialty);

        Patient patient = new Patient("Carl", "carl123@gmail.com");
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Email: " + patient.getEmail());

        patient.setWeight(70.5);
        patient.setHeight(1.75);
        System.out.println("Patient Weight: " + patient.getWeight());
        System.out.println("Patient Height: " + patient.getHeight());

        patient.setPhoneNumber("1234567890");
        System.out.println("Patient Phone Number: " + patient.getPhoneNumber());


        //showMenu();

    }
}