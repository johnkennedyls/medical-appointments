public class Patient {
    public String name;
    public String email;
    public String address;
    public String phoneNumber;
    public String birthDay;
    public String weight;
    public String height;
    public String blood;

    public Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Patient(String name, String email, String address, String phoneNumber, String birthDay, String weight, String height) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.weight = weight;
        this.height = height;
    }
}

