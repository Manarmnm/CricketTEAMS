/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MASS MNM
 */
public class Login_DB {
    Connection con = null;
   
       public int addLogin(Login log){  //add new login 
          int result=0;
          con = new DBConnection().getConnection();
       
    try{
            
        String insert="insert into user_login(Fname,Lname,Uname,Address,Gender,Dob,Nic,Tel_no,Category,Password,Area,Email,Job)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, log.getFName());
        ps.setString(2, log.getLName());
        ps.setString(3, log.getUName());
        ps.setString(4, log.getAddress());
        ps.setString(5, log.getGender());
        ps.setString(6, log.getDob());
        ps.setString(7, log.getNic());
        ps.setString(8, log.getTelno());
        ps.setString(9, log.getCategory());
        ps.setString(10,log.getPassword());
        ps.setString(11,log.getArea());
        ps.setString(12,log.getEmail());
        ps.setString(13,log.getJob());
        
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
            String select="select Password from user_login where Uname=?";
            
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
//       public Login empLogin(String uname, String pwd) throws SQLException {
//        String sql = "SELECT Password from user_login where user_login.Uname='" + uname + "' AND user_login.Password='"+ pwd + "'";
//
//        DBConnection dc = new DBConnection ();
//        Connection con = dc.getConnection();
//
//        PreparedStatement stmt = con.prepareStatement(sql);
//
//        ResultSet rs = stmt.executeQuery(sql);
//
//        Login employee = null;
//
//       // rs.last();
//        int total = rs.getRow();
//       // rs.first();
//        if (total == 1) {
//            employee = new Login(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
//        }
//
//        return employee;
//    }
    public int changePassword(Login logs){  //chenge the passowrd from database
        
        int result=0;
        try{
            
            String update="update user_login set Password=?,Uname=? where user_id=?";
            PreparedStatement ps=con.prepareStatement(update);
            ps.setString(10, logs.getPassword());
            ps.setString(3, logs.getUName());
            result=ps.executeUpdate();
            ps.close();
            return result;
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
        }
    }      
    public String getUserType(String uName){
        String uType="";
         try{
            String select="select  Category from user_login where Uname=?";
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
}
