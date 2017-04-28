/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import MODEL.*;

/**
 *
 * @author MASS MNM
 */
public class Login_DB {
     Connection con = null;
   
   
     
  public int addLogin(Register reg){  //add new login 
          int result=0;
          con = new DBConnection().getConnection();
       
  try{
            
        String insert="insert into user_login(First_Name,Last_Name,Address,Country,Gender,Date_of_Birth,NIC,Contacts_No,Category,Email,User_Name,Password,Job)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, reg.getFirst_Name());
        ps.setString(2, reg.getLast_Name());
        ps.setString(3, reg.getAddress());
        ps.setString(4, reg.getCountry());
        ps.setString(5, reg.getGender());
        ps.setString(6, reg.getDate_of_Birth());
        ps.setString(7, reg.getNIC());
        ps.setInt   (8, reg.getContacts_No());
        ps.setString(9, reg.getCategory());
        ps.setString(10,reg.getEmail());
        ps.setString(11,reg.getUser_Name());
        ps.setString(12,reg.getPassword());
        ps.setString(13,reg.getJob());
        
        
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
 }
       
  public String getPassword(String uName){   //get all password from database
        con = new DBConnection().getConnection();
        
         String pwd="";
         
     try{
            String select="Select Password From user_login where User_Name=?";
            
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, uName);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                pwd=rs.getString("Password");
              }
            
            rs.close();
            ps.close();
            return pwd;
            
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
  
  public String getUserType(String uName){
        String uType="";
         try{
            String select="select Category from user_login where User_Name=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, uName);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                uType=rs.getString("Category");
            }
            rs.close();
            ps.close();
            return uType; 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        
    }    
  
  public int changePassword(Register chg){  //chenge the passowrd from database
        
        int result=0;
        
      try{
            
            String update="update user_login set Password=? where User_Name=?";
            PreparedStatement ps=con.prepareStatement(update);
            ps.setString(1, chg.getPassword());
            ps.setString(2, chg.getUser_Name());
            result=ps.executeUpdate();
            ps.close();
            return result;
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
        }
    }  
}
