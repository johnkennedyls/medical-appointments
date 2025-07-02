import ui.UIMenu;

import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor("Jim", "jim@toString.com");
        myDoctor.addAvailableAppointment(new Date(), "10:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "11:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "12:00 PM");

        System.out.println(myDoctor);


     Patient patient = new Patient("Yeison", "yeison123@gmail.com");
        patient.setBirthDay("1990-01-01");
        patient.setWeight(70.5);
        patient.setHeight(1.75);
        patient.setBlood("O+");
        patient.setPhoneNumber("1234567890");

        System.out.println(patient);







    }
}