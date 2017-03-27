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
public class Login {
   // private int uid;
    private String FName;
    private String LName;
    private String UName;
    private String Address;
    private String Gender;
    private String Dob;
    private String Nic;
    private String Telno;
    private String Category;
    private String Password;
    private String Area;
    private String Job;
    private String Email;
    
    public Login(){
        
    }
    
    public Login (String FName, String LName, String UName,String Address,String Gender,String Dob,String Nic,String Telno,String Category,String Password,String Area,String email,String job){  
        this.FName=FName;
        this.LName= LName;
        this.UName=UName;
        this.Address=Address;
        this.Gender=Gender;
        this.Dob= Dob;
        this.Nic=Nic;
        this.Telno=Telno;
        this.Category=Category;
        this.Password=Password;
        this.Area= Area;
        this.Email=email;
        this.Job=job;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public String getTelno() {
        return Telno;
    }

    public void setTelno(String Telno) {
        this.Telno = Telno;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPassword() {
        return Password;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    } 
      
    
}
