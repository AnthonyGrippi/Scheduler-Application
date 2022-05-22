public class Person {
    
    String fName;
    String MName;
    String LName;

    String email;
    String phoneNumber;

    String streetAddress;
    String city;
    String state;
    String zip;

    public Person() {
    }

    public Person(String fName, String MName, String LName, String email, String phoneNumber, String streetAddress, String city, String state, String zip) {
        this.fName = fName;
        this.MName = MName;
        this.LName = LName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getMName() {
        return this.MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getLName() {
        return this.LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return
            "First Name: \t" + getFName() + "\n" +
            "Middle Name: \t" + getMName() + "\n" +
            "Last Name: \t\t" + getLName() + "\n" +
            "Email: \t\t\t" + getEmail() + "\n" +
            "Phone Number: \t" + getPhoneNumber() + "\n" +
            "Street Address: " + getStreetAddress() + "\n" +
            "City: \t\t\t" + getCity() + "\n" +
            "State: \t\t\t" + getState() + "\n" +
            "Zip Code: \t\t" + getZip() + "\n";
    }
}
