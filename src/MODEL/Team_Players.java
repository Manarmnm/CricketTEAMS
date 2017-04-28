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
public class Team_Players {
    private String Team_ID;
    private String Team_Name;
    private String PlayerName;
    private String PlayerRole;
    private String Nationality;
    private int    TotalMatchs;
    private int    Innings;
    private int    Highscore;
    private int    Noofwickets;
    public  double Bat_Strike_Rate;
    public  double Bat_Average;
    public  double Bowl_Economy;
    public  double Bowl_Average;
    private int    Stumps;
    private int    catchs;
    private String Srate_Weight;
    private String BatAve_Weight;
    private String BEcon_Weight;
    private String BowlAve_Weight;
    private String Stump_Weight;
    private String Catch_Weight;

    public Team_Players(String Team_ID, String Team_Name, String PlayerName, String PlayerRole, String Nationality, int TotalMatchs, int Innings, int Highscore,int Noofwickets, double Bat_Strike_Rate, double Bat_Average, double Bowl_Economy, double Bowl_Average, int Stumps, int catchs, String Srate_Weight, String BatAve_Weight, String BEcon_Weight, String BowlAve_Weight, String Stump_Weight, String Catch_Weight) {
        this.Team_ID = Team_ID;
        this.Team_Name = Team_Name;
        this.PlayerName = PlayerName;
        this.PlayerRole = PlayerRole;
        this.Nationality = Nationality;
        this.TotalMatchs = TotalMatchs;
        this.Innings = Innings;
        this.Highscore = Highscore;
        this.Noofwickets= Noofwickets;
        this.Bat_Strike_Rate = Bat_Strike_Rate;
        this.Bat_Average = Bat_Average;
        this.Bowl_Economy = Bowl_Economy;
        this.Bowl_Average = Bowl_Average;
        this.Stumps = Stumps;
        this.catchs = catchs;
        this.Srate_Weight = Srate_Weight;
        this.BatAve_Weight = BatAve_Weight;
        this.BEcon_Weight = BEcon_Weight;
        this.BowlAve_Weight = BowlAve_Weight;
        this.Stump_Weight = Stump_Weight;
        this.Catch_Weight = Catch_Weight;
    }

    public String getTeam_ID() {
        return Team_ID;
    }

    public void setTeam_ID(String Team_ID) {
        this.Team_ID = Team_ID;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String Team_Name) {
        this.Team_Name = Team_Name;
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

    public int getTotalMatchs() {
        return TotalMatchs;
    }

    public void setTotalMatchs(int TotalMatchs) {
        this.TotalMatchs = TotalMatchs;
    }

    public int getInnings() {
        return Innings;
    }

    public void setInnings(int Innings) {
        this.Innings = Innings;
    }

    public int getHighscore() {
        return Highscore;
    }

    public void setHighscore(int Highscore) {
        this.Highscore = Highscore;
    }

    public int getNoofwickets() {
        return Noofwickets;
    }

    public void setNoofwickets(int Noofwickets) {
        this.Noofwickets = Noofwickets;
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

    public int getStumps() {
        return Stumps;
    }

    public void setStumps(int Stumps) {
        this.Stumps = Stumps;
    }

    public int getCatchs() {
        return catchs;
    }

    public void setCatchs(int catchs) {
        this.catchs = catchs;
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
