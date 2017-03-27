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
public class Allrounder_List {
    private String Allrounder_ID;
    private String PlayerName;
    private String PlayerRole;
    private String Nationality;
    public  String MatchType;
    private int    TotalMatchs;
    public  double Strike_Rate;
    public  double Bat_Average;
    public  double Bowl_Economy;
    public  double Bowl_Average;
    private int    Bestbowl;
 

    public Allrounder_List(String Allrounder_ID, String PlayerName, String PlayerRole, String Nationality, String MatchType, int TotalMatchs, double Strike_Rate, double Bat_Average,  double Bowl_Economy, double Bowl_Average, int Bestbowl) {
        this.Allrounder_ID = Allrounder_ID;
        this.PlayerName = PlayerName;
        this.PlayerRole = PlayerRole;
        this.Nationality = Nationality;
        this.MatchType = MatchType;
        this.TotalMatchs = TotalMatchs;
        this.Strike_Rate = Strike_Rate;
        this.Bat_Average = Bat_Average;
        this.Bowl_Economy = Bowl_Economy;
        this.Bowl_Average = Bowl_Average;
        this.Bestbowl = Bestbowl;
    
    }

    public String getAllrounder_ID() {
        return Allrounder_ID;
    }

    public void setAllrounder_ID(String Allrounder_ID) {
        this.Allrounder_ID = Allrounder_ID;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getPlayerRole() {
        return PlayerRole;
    }

    public void setPlayerRole(String PlayerRole) {
        this.PlayerRole = PlayerRole;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getMatchType() {
        return MatchType;
    }

    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    public int getTotalMatchs() {
        return TotalMatchs;
    }

    public void setTotalMatchs(int TotalMatchs) {
        this.TotalMatchs = TotalMatchs;
    }
 

    public double getStrike_Rate() {
        return Strike_Rate;
    }

    public void setStrike_Rate(double Strike_Rate) {
        this.Strike_Rate = Strike_Rate;
    }

    public double getBat_Average() {
        return Bat_Average;
    }

    public void setBat_Average(double Bat_Average) {
        this.Bat_Average = Bat_Average;
    }

 

    public double getBowl_Economy() {
        return Bowl_Economy;
    }

    public void setBowl_Economy(double Bowl_Economy) {
        this.Bowl_Economy = Bowl_Economy;
    }

    public double getBowl_Average() {
        return Bowl_Average;
    }

    public void setBowl_Average(double Bowl_Average) {
        this.Bowl_Average = Bowl_Average;
    }

    public int getBestbowl() {
        return Bestbowl;
    }

    public void setBestbowl(int Bestbowl) {
        this.Bestbowl = Bestbowl;
    }
 
    
    
}
