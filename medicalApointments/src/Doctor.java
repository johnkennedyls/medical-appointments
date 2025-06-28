public class Doctor {
   static int id;
    String name;
    String specialty;

    public Doctor() {
        System.out.println("Building the Doctor Object");
        }

    public Doctor( String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        System.out.println("Building the Doctor Object with name: " + name + " and specialty: " + specialty);
    }
    public void showName() {
         System.out.println(name);
    }

    public void showID() {
        System.out.println("Doctor ID: " + id);
    }

}
