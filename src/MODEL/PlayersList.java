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
    private String PlayerID;
    private String Player_Name;
    private String Player_Role;
    private String PlayerCategory;
    private String Nationality;
    private String Match_Type;
    private int    Total_Matchs;
    private int    Innings;
    public  double Bat_Strike_Rate;
    public  double Bat_Average;
    private int    NoOf100s;
    private int    NoOf50s;
    private int    High_Score;
    private String SratePerfact_Weight;
    private String AvergPerfact_Weight;
    private int    Result;
    public  String Error;
    private String  Epoc;
    private String Sum;

    public PlayersList(String PlayerID, String Player_Name, String Player_Role,String PlayerCategory, String Nationality, String Match_Type, int Total_Matchs, int Innings, double Bat_Strike_Rate, double Bat_Average, int NoOf100s, int NoOf50s, int High_Score,String SratePerfact_Weight,String AvergPerfact_Weight, int Result, String Error, String Epoc, String Sum) {
        this.PlayerID = PlayerID;
        this.Player_Name = Player_Name;
        this.Player_Role = Player_Role;
        this.PlayerCategory=PlayerCategory;
        this.Nationality = Nationality;
        this.Match_Type = Match_Type;
        this.Total_Matchs = Total_Matchs;
        this.Innings = Innings;
        this.Bat_Strike_Rate = Bat_Strike_Rate;
        this.Bat_Average = Bat_Average;
        this.NoOf100s = NoOf100s;
        this.NoOf50s = NoOf50s;
        this.High_Score = High_Score;
        this.SratePerfact_Weight= SratePerfact_Weight;
        this.AvergPerfact_Weight= AvergPerfact_Weight;
        this.Result = Result;
        this.Error = Error;
        this.Epoc = Epoc;
        this.Sum = Sum;
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

    public int getInnings() {
        return Innings;
    }

    public void setInnings(int Innings) {
        this.Innings = Innings;
    }

    public double getBat_Strike_Rate() {
        return Bat_Strike_Rate;
    }

    public void setBat_Strike_Rate(double Bat_Strike_Rate) {
        this.Bat_Strike_Rate = Bat_Strike_Rate;
    }

    public double getBat_Average() {
        return Bat_Average;
    }

    public void setBat_Average(double Bat_Average) {
        this.Bat_Average = Bat_Average;
    }

    public int getNoOf100s() {
        return NoOf100s;
    }

    public void setNoOf100s(int NoOf100s) {
        this.NoOf100s = NoOf100s;
    }

    public int getNoOf50s() {
        return NoOf50s;
    }

    public void setNoOf50s(int NoOf50s) {
        this.NoOf50s = NoOf50s;
    }

    public int getHigh_Score() {
        return High_Score;
    }

    public void setHigh_Score(int High_Score) {
        this.High_Score = High_Score;
    }

    public String getPlayerCategory() {
        return PlayerCategory;
    }

    public void setPlayerCategory(String PlayerCategory) {
        this.PlayerCategory = PlayerCategory;
    }

    public String getSPerfact_Weight() {
        return SratePerfact_Weight;
    }

    public void setSPerfact_Weight(String Perfact_Weight) {
        this.SratePerfact_Weight = Perfact_Weight;
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

    public String getAPerfact_Weight() {
        return AvergPerfact_Weight;
    }

    public void setAPerfact_Weight(String aweight) {
        this.AvergPerfact_Weight = aweight;
        
    }


}
