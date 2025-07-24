package model;

public class Patient extends User {


    private String birthDay;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);

    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            System.out.println("The phone number is too long");
            return;
        } else if (phoneNumber.length() == 10) {
            super.setPhoneNumber(phoneNumber);
        }
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getWeight() {
        return weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "model.Patient{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}

