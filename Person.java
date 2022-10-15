package EX11_02;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    Person() {
        name = "Eslam.";
        address = "4 Ahmed Maher Street,Faisl,ElGiza.";
        phoneNumber = "01187585938";
        emailAddress = "eslam@gmail.com";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = EmailAddress;
    }
    public String toString() {
        return"Name Is : " + name + "\nAddress Is : "
                + address + "\nPhoneNumber Is : " + phoneNumber + " \nEmailAddress Is : " + emailAddress + ".\n";
    }
    
}
