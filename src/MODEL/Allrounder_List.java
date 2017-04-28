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
    private String PlayerCategory;
    private String Nationality;
    public  String MatchType;
    private int    TotalMatchs;
    public  double Bat_Strike_Rate;
    public  double Bat_Average;
    public  double Bowl_Economy;
    public  double Bowl_Average;
    private int    Bestbowl;
    private String Srate_Weight;
    private String BatAve_Weight;
    private String BEcon_Weight;
    private String BowlAve_Weight;
    private int    Result;
    public  String Error;
    private String Epoc;
    private String Sum;
 

    public Allrounder_List(String Allrounder_ID, String PlayerName, String PlayerRole,String PlayerCategory,String Nationality, String MatchType, int TotalMatchs, double Bat_Strike_Rate, double Bat_Average,  double Bowl_Economy, double Bowl_Average, int Bestbowl,String Srate_Weight,String BatAve_Weight,String BEcon_Weight,String BowlAve_Weight, int Result, String Error, String Epoc, String Sum) {
        this.Allrounder_ID = Allrounder_ID;
        this.PlayerName = PlayerName;
        this.PlayerRole = PlayerRole;
        this.Nationality = Nationality;
        this.MatchType = MatchType;
        this.TotalMatchs = TotalMatchs;
        this.Bat_Strike_Rate = Bat_Strike_Rate;
        this.Bat_Average = Bat_Average;
        this.Bowl_Economy = Bowl_Economy;
        this.Bowl_Average = Bowl_Average;
        this.Bestbowl = Bestbowl;
        this.PlayerCategory= PlayerCategory;
        this.Result = Result;
        this.Error = Error;
        this.Epoc = Epoc;
        this.Sum = Sum;   
        this.BEcon_Weight= BEcon_Weight;
        this.BatAve_Weight=BatAve_Weight;
        this.BowlAve_Weight=BowlAve_Weight;
        this.Srate_Weight=Srate_Weight;
         
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
        return Bat_Strike_Rate;
    }

    public void setStrike_Rate(double Bat_Strike_Rate) {
        this.Bat_Strike_Rate = Bat_Strike_Rate;
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

    public String getPlayerCategory() {
        return PlayerCategory;
    }

    public void setPlayerCategory(String PlayerCategory) {
        this.PlayerCategory = PlayerCategory;
    }

    public double getBat_Strike_Rate() {
        return Bat_Strike_Rate;
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

    public void setBat_Strike_Rate(double Bat_Strike_Rate) {
        this.Bat_Strike_Rate = Bat_Strike_Rate;
    }

    public String getSrate_Weight() {
        return Srate_Weight;
    }

    public void setSrate_Weight(String Srate_Weight) {
        this.Srate_Weight = Srate_Weight;
    }

    public String getBatAve_Weight() {
        return BatAve_Weight;
    }

    public void setBatAve_Weight(String BatAve_Weight) {
        this.BatAve_Weight = BatAve_Weight;
    }

    public String getBEcon_Weight() {
        return BEcon_Weight;
    }

    public void setBEcon_Weight(String BEcon_Weight) {
        this.BEcon_Weight = BEcon_Weight;
    }

    public String getBowlAve_Weight() {
        return BowlAve_Weight;
    }

    public void setBowlAve_Weight(String BowlAve_Weight) {
        this.BowlAve_Weight = BowlAve_Weight;
    }

 
    
    
}
