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
    private String PlayerID;
    private String Player_Name;
    private String Player_Role;
    private String PlayerCategory;
    private String Nationality;
    private String Match_Type;
    private int    Total_Matchs;
    public  double Bowl_Economy;
    public  double Bowl_Average;
    public  double Best_Bowl;
    private int    NoOf5Wikcets;
    private String BEcon_Weight;
    private String BAve_Weight;
    private int    Result;
    public  String Error;
    private String  Epoc;
    private String Sum;

    public BowlerList(String PlayerID, String Player_Name, String Player_Role,String PlayerCategory, String Nationality, String Match_Type, int Total_Matchs, double Bowl_Economy, double Bowl_Average, double Best_Bowl, int NoOf5Wikcets,String BEcon_Weight,String BAve_Weight,int Result, String Error, String Epoc, String Sum) {
        this.PlayerID = PlayerID;
        this.Player_Name = Player_Name;
        this.Player_Role = Player_Role;
        this.PlayerCategory= PlayerCategory;
        this.Nationality = Nationality;
        this.Match_Type = Match_Type;
        this.Total_Matchs = Total_Matchs;
        this.Bowl_Economy = Bowl_Economy;
        this.Bowl_Average = Bowl_Average;
        this.Best_Bowl = Best_Bowl;
        this.NoOf5Wikcets = NoOf5Wikcets;
        this.Result = Result;
        this.Error = Error;
        this.Epoc = Epoc;
        this.Sum = Sum;
        this.BEcon_Weight= BEcon_Weight;
        this.BAve_Weight= BAve_Weight;
        
    }

    public String getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(String PlayerID) {
        this.PlayerID = PlayerID;
    }

    public String getPlayer_Name() {
        return Player_Name;
    }

    public void setPlayer_Name(String Player_Name) {
        this.Player_Name = Player_Name;
    }

    public String getPlayer_Role() {
        return Player_Role;
    }

    public void setPlayer_Role(String Player_Role) {
        this.Player_Role = Player_Role;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getMatch_Type() {
        return Match_Type;
    }

    public void setMatch_Type(String Match_Type) {
        this.Match_Type = Match_Type;
    }

    public int getTotal_Matchs() {
        return Total_Matchs;
    }

    public void setTotal_Matchs(int Total_Matchs) {
        this.Total_Matchs = Total_Matchs;
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

    public double getBest_Bowl() {
        return Best_Bowl;
    }

    public void setBest_Bowl(double Best_Bowl) {
        this.Best_Bowl = Best_Bowl;
    }

    public int getNoOf5Wikcets() {
        return NoOf5Wikcets;
    }

    public int getResult() {
        return Result;
    }

    public void setResult(int Result) {
        this.Result = Result;
    }

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
    }

    public String getEpoc() {
        return Epoc;
    }

    public void setEpoc(String Epoc) {
        this.Epoc = Epoc;
    }

    public String getSum() {
        return Sum;
    }

    public void setSum(String Sum) {
        this.Sum = Sum;
    }

    public void setNoOf5Wikcets(int NoOf5Wikcets) {
        this.NoOf5Wikcets = NoOf5Wikcets;
    }

    public String getPlayerCategory() {
        return PlayerCategory;
    }

    public void setPlayerCategory(String PlayerCategory) {
        this.PlayerCategory = PlayerCategory;
    }

    public String getBAve_Weight() {
        return BAve_Weight;
    }

    public void setPBAve_Weight(String BAve_Weight) {
        this.BAve_Weight = BAve_Weight;
    }

    public String getBEcon_Weight() {
        return BEcon_Weight;
    }

    public void setBEcon_Weight(String BEcon_Weight) {
        this.BEcon_Weight = BEcon_Weight;
    }

    
}
