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
public class BowlerList {
    private String Player_Name;
    private int    Matchs;
    private int    Wickets;
    private double Economy;
    private double BowlAverage;
    private String Best_Bowl;

    public BowlerList(String Player_Name,int Matchs, int Wickets, double Economy,double Bowlaverage, String Best_Bowl) {
        this.Player_Name = Player_Name;
        this.Matchs = Matchs;
        this.Wickets = Wickets;
        this.Economy = Economy;
        this.BowlAverage= Bowlaverage;
        this.Best_Bowl = Best_Bowl;
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

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int Wickets) {
        this.Wickets = Wickets;
    }

    public double getEconomy() {
        return Economy;
    }

    public void setEconomy(double Economy) {
        this.Economy = Economy;
    }

    public String getBest_Bowl() {
        return Best_Bowl;
    }

    public void setBest_Bowl(String Best_Bowl) {
        this.Best_Bowl = Best_Bowl;
    }
    
   public double getBowlAverage() {
        return BowlAverage;
    }

    public void setBowlAverage(double BowlAverage) {
        this.BowlAverage = BowlAverage;
    } 
}
