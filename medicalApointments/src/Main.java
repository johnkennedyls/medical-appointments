import ui.UIMenu;

import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor("Jim", "Cardiology");
        myDoctor.addAvailableAppointment(new Date(), "10:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "11:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "12:00 PM");

for (Doctor.AvailableAppointment appointment : myDoctor.getAvailableAppointments()) {
            System.out.println("Available Appointment: " + appointment.getDate() + " at " + appointment.getTime());
        }

        // Uncomment the following lines to test the Patient class
        


//        Patient patient = new Patient("Carl", "carl123@gmail.com");
//        System.out.println("Patient Name: " + patient.getName());
//        System.out.println("Patient Email: " + patient.getEmail());
//
//        patient.setWeight(70.5);
//        patient.setHeight(1.75);
//        System.out.println("Patient Weight: " + patient.getWeight());
//        System.out.println("Patient Height: " + patient.getHeight());
//
//        patient.setPhoneNumber("1234567890");
//        System.out.println("Patient Phone Number: " + patient.getPhoneNumber());
//

        //showMenu();

    }
}