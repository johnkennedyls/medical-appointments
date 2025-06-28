import ui.UIMenu;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Dr. Smith";
        myDoctor.showName();
        myDoctor.showID();
        //System.out.println(Doctor.id);


        Doctor myDoctorAnn = new Doctor();
        myDoctor.showID();
        //System.out.println(Doctor.id);

        showMenu();

    }
}