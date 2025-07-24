import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor("Jim", "jim@toString.com");
        myDoctor.addAvailableAppointment(new Date(), "10:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "11:00 AM");
        myDoctor.addAvailableAppointment(new Date(), "12:00 PM");

        System.out.println(myDoctor);
        User user = new Doctor("Jim", "jim@toString.com");
        user.showDataUser();

        User userPa = new Patient("Jim", "jim@toString.com");
        user.showDataUser();








    }
}