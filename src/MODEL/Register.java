/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

 

/**
 *
 * @author MASS MNM
 */
public class Register {
    private String First_Name;
    private String Last_Name;
    private String Address;
    private String Country;
    private String Gender;
    private String Date_of_Birth;
    private String NIC;
    private int Contacts_No;
    private String Category;
    private String Email;
    private String User_Name;
    private String Password;
    private String Job;

    public Register(String First_Name, String Last_Name, String Address, String Country, String Gender, String Date_of_Birth, String NIC, int Contacts_No, String Category, String Email, String User_Name, String Password,String Job) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.Country = Country;
        this.Gender = Gender;
        this.Date_of_Birth = Date_of_Birth;
        this.NIC = NIC;
        this.Contacts_No = Contacts_No;
        this.Category = Category;
        this.Email = Email;
        this.User_Name = User_Name;
        this.Password = Password;
        this.Job= Job;
    }

    public Register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int  getContacts_No() {
        return Contacts_No;
    }

    public void setContacts_No(int Contacts_No) {
        this.Contacts_No = Contacts_No;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }
    
    
}
