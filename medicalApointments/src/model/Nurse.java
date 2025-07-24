package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
        System.out.println("Building the Nurse Object with name: " + name + " and speciality: " + speciality);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: General Hospital");
        System.out.println("Department: Nursing");
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
