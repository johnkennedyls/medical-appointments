public class Patient {

    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthDay;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            System.out.println("The phone number is too long");
            return;
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;

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
}

