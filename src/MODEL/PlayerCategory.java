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
public class PlayerCategory {
    private String Roleid;
    private String RoleName;
    private String Category;

    public PlayerCategory(String Roleid, String RoleName,String Category) {
        this.Roleid = Roleid;
        this.RoleName = RoleName;
        this.Category = Category;
    }

    public String getRoleid() {
        return Roleid;
    }

    public void setRoleid(String Roleid) {
        this.Roleid = Roleid;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
    
}
