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
public class Wicket_KeeperList {
    private String Player_Name;
    private int Matchs;
    private int No_ofCatchs;
    private int stemps;

    public Wicket_KeeperList(String Player_Name, int Matchs, int No_ofCatchs, int stemps) {
        this.Player_Name = Player_Name;
        this.Matchs = Matchs;
        this.No_ofCatchs = No_ofCatchs;
        this.stemps = stemps;
    }

    public String getPlayer_Name() {
        return Player_Name;
    }

    public void setPlayer_Name(String Player_Name) {
        this.Player_Name = Player_Name;
    }

    public int getMatchs() {
        return Matchs;
    }

    public void setMatchs(int Matchs) {
        this.Matchs = Matchs;
    }

    public int getNo_ofCatchs() {
        return No_ofCatchs;
    }

    public void setNo_ofCatchs(int No_ofCatchs) {
        this.No_ofCatchs = No_ofCatchs;
    }

    public int getStemps() {
        return stemps;
    }

    public void setStemps(int stemps) {
        this.stemps = stemps;
    }
    
    
}
