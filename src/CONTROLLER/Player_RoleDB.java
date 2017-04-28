/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import CONTROLLER.*;
import MODEL.*;
import java.sql.Connection;

/**
 *
 * @author MASS MNM
 */
public class Player_RoleDB {
     Connection con = null;
     
    public int addCategory(PlayerCategory catg){  //add new login 
          int result=0;
          con = new DBConnection().getConnection();
       
  try{
            
        String insert="insert into player_category(Role_ID,Role_Name,Category)values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, catg.getRoleid());
        ps.setString(2, catg.getRoleName());
        ps.setString(3, catg.getCategory());
 
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
 }
     
    public ArrayList<PLayer_Role> getPlayerRole(){
       con = new DBConnection().getConnection();
           
       ArrayList<PLayer_Role> RList=new ArrayList<PLayer_Role>();
   
        try{
            String select="select * from player_role";
            PreparedStatement ps=con.prepareStatement(select);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                String RoleID=rs.getString("Role_ID");
                String RoleName=rs.getString("Role_Name");
               
                 
              
                
            PLayer_Role  role=new PLayer_Role(RoleID, RoleName);
            
            RList.add(role);
              
            }
            rs.close();
            ps.close();
            return RList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
     }
       
    public ArrayList<PlayerCategory> FindName(String RID){       
        ArrayList<PlayerCategory> aList=new ArrayList<PlayerCategory>();
        
       //String tmp=(String)cmbarea.getSelectedItem();
       String sql="SELECT  * From player_category AS c INNER JOIN player_role AS p ON c.Role_ID=p.Role_ID WHERE Role_Name=?";
        
        try{
        
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setString(1, RID);
             ResultSet rs=ps.executeQuery();
      
            while(rs.next()){
                String Prole= rs.getString("Player_Role");
                String Catgegory=rs.getString("Category");
                
                PlayerCategory catg= new PlayerCategory(RID, Prole,Catgegory);
                
                  aList.add(catg);
                  
                }
            rs.close();
            ps.close();
            return aList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
       }
   }
}
