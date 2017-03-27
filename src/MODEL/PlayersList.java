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
public class PlayersList {
    private String Player_Name;
    private int    Matchs;
    private int    innings;
    public  double Strike_Rate;
    public  double Average;
    private int    High_Score;

    public PlayersList(String Player_Name, int Matchs, int innings, double Strike_Rate, double Average, int High_Score) {
        this.Player_Name = Player_Name;
        this.Matchs = Matchs;
        this.innings = innings;
        this.Strike_Rate = Strike_Rate;
        this.Average = Average;
        this.High_Score = High_Score;
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

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public double getStrike_Rate() {
        return Strike_Rate;
    }

    public void setStrike_Rate(double Strike_Rate) {
        this.Strike_Rate = Strike_Rate;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    public int getHigh_Score() {
        return High_Score;
    }

    public void setHigh_Score(int High_Score) {
        this.High_Score = High_Score;
    }
    
    
    
}
