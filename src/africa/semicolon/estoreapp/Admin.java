package africa.semicolon.estoreapp;

public class Admin extends Users{

public Admin(int age, String emailAddress, String name, String password, String phone, Address homeAddress){
    super(age, emailAddress, name, password, phone, homeAddress);
}
    @Override
    public int getAge() {
        return super.getAge();
    }

@Override
    public void setAge(int age) {
    super.setAge(age);
    }

    @Override
    public String getEmailAddress() {
        return super.getEmailAddress();
    }

    @Override
    public void setEmailAddress(String emailAddres) {
        super.setEmailAddress(emailAddres);
    }

    public String getName() {
        return super.getName();
    }


    public void setName(String name) {
        super.setName(name);
    }

    @Override
   public String getPassword() {
        return super.getPassword();
    }

@Override
    public void setPassword(String pasword) {
        super.setPassword(pasword);
    }

@Override
    public String getPhone() {
        return super.getPhone();
    }

@Override
   public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public Address getHomeAddress() {
        return super.getHomeAddress();
    }

    @Override
    public void setHomeAddress(Address homeAddress) {
            super.setHomeAddress(homeAddress);
    }
}
