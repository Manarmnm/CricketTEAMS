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
    private String PlayerID;
    private String Player_Name;
    private String Player_Role;
    private String PlayerCategory;
    private String Nationality;
    private String Match_Type;
    private int    Total_Matchs;
    public int     No_ofCatchs;
    public int     Stumps;
    private int    Result;
    private String Stump_Weight;
    private String Catch_Weight;
    public  String Error;
    private String Epoc;
    private String Sum;

    public Wicket_KeeperList(String PlayerID, String Player_Name, String Player_Role,String PlayerCategory, String Nationality, String Match_Type, int Total_Matchs, int No_ofCatchs, int Stumps,String Stump_Weight,String Catch_Weight,int Result, String Error, String Epoc, String Sum) {
        this.PlayerID = PlayerID;
        this.Player_Name = Player_Name;
        this.Player_Role = Player_Role;
        this.Nationality = Nationality;
        this.Match_Type = Match_Type;
        this.Total_Matchs = Total_Matchs;
        this.No_ofCatchs = No_ofCatchs;
        this.Stumps = Stumps;
        this.PlayerCategory=PlayerCategory;
        this.Result = Result;
        this.Error = Error;
        this.Epoc = Epoc;
        this.Sum = Sum;
        this.Stump_Weight=Stump_Weight;
        this.Catch_Weight=Catch_Weight;
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

    public int getNo_ofCatchs() {
        return No_ofCatchs;
    }

    public void setNo_ofCatchs(int No_ofCatchs) {
        this.No_ofCatchs = No_ofCatchs;
    }

    public int getStumps() {
        return Stumps;
    }

    public void setStumps(int Stumps) {
        this.Stumps = Stumps;
    }

    public String getPlayerCategory() {
        return PlayerCategory;
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

    public void setPlayerCategory(String PlayerCategory) {
        this.PlayerCategory = PlayerCategory;
    }

    public String getStump_Weight() {
        return Stump_Weight;
    }

    public void setStump_Weight(String Stump_Weight) {
        this.Stump_Weight = Stump_Weight;
    }

    public String getCatch_Weight() {
        return Catch_Weight;
    }

    public void setCatch_Weight(String Catch_Weight) {
        this.Catch_Weight = Catch_Weight;
    }

 

}
