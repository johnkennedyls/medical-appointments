public class Doctor {
   static int id;
    String name;
    String specialty;

    public Doctor() {
        System.out.println("Building the Doctor Object");
        id++;}

    public Doctor( String name) {
        this.name = name;
        System.out.println("Building the Doctor Object with name: " + name);
    }
    public void showName() {
         System.out.println(name);
    }

    public void showID() {
        System.out.println("Doctor ID: " + id);
    }

}
