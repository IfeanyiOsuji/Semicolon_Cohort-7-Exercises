package africa.semicolon.estoreapp;

public class Users {
    private int age;
    private String emailAddress;
    private String name;
    private String password;
    private String phone;
    private Address homeAddress;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Users(int age, String emailAddress, String name, String password, String phone, Address homeAddress) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.homeAddress = homeAddress;
    }
    public Users(){}
}

