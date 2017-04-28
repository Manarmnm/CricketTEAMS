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
public class PLayer_Role {
    private String Role_ID;
    private String Role_Name;

    public PLayer_Role(String Role_ID, String Role_Name) {
        this.Role_ID = Role_ID;
        this.Role_Name = Role_Name;
    }

    public String getRole_ID() {
        return Role_ID;
    }

    public void setRole_ID(String Role_ID) {
        this.Role_ID = Role_ID;
    }

    public String getRole_Name() {
        return Role_Name;
    }

    public void setRole_Name(String Role_Name) {
        this.Role_Name = Role_Name;
    }
    
    
}
