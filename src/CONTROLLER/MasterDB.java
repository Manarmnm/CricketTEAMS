/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MASS MNM
 */
public class MasterDB {
    Connection con=null;
    
    
  public int AddBatsmanTrainData(Neural_Playerlist batsman){  //add trainData
          int result=0;
          con = new DBConnection().getConnection();       
  try{
            
        String insert="insert into batsman_traindata(Player_ID,Player_Name,Player_Role,Player_Category,Match_Type,Nationality,Total_Match,Innings,Bat_StrikeRate,Bat_Average,High_Score,No50s,No100s,SRate_Weight,Average_Weight,Result,Error,Epoc,Sum)"
                + "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, batsman.getPlayerID());
        ps.setString(2, batsman.getPlayer_Name());
        ps.setString(3, batsman.getPlayer_Role());
        ps.setString(4, batsman.getPlayerCategory());
        ps.setString(5, batsman.getMatch_Type());
        ps.setString(6, batsman.getNationality());
        ps.setInt   (7, batsman.getTotal_Matchs());
        ps.setInt   (8, batsman.getInnings());
        ps.setDouble(9, batsman.getBat_Strike_Rate());
        ps.setDouble(10,batsman.getBat_Average());
        ps.setInt   (11,batsman.getHigh_Score());
        ps.setInt   (12,batsman.getNoOf50s());
        ps.setInt   (13,batsman.getNoOf100s());
        ps.setString(14,batsman.getSPerfact_Weight());
        ps.setString(15,batsman.getAPerfact_Weight());
        ps.setInt   (16,batsman.getResult());
        ps.setString(17,batsman.getError());
        ps.setString(18,batsman.getEpoc());
        ps.setString(19,batsman.getSum());
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
     }
  
  public int AddBowlerTrainData(Neural_BowlerList bowler){  //add trainData
          int result=0;
          con = new DBConnection().getConnection();
       
  try{
            
        String insert="insert into bowler_traindata(Player_ID,Player_Name,Player_Role,Player_Category,Match_Type,Nationality,Total_Match,Bowl_Economy,Bowl_Average,TotWickets,No5Wickets,BowlEconomy_Weight,BowlAverage_Weight,Result,Error,Epoc,Sum)"
                + "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, bowler.getPlayerID());
        ps.setString(2, bowler.getPlayer_Name());
        ps.setString(3, bowler.getPlayer_Role());
        ps.setString(4, bowler.getPlayerCategory());
        ps.setString(5, bowler.getMatch_Type());
        ps.setString(6, bowler.getNationality());
        ps.setInt   (7, bowler.getTotal_Matchs());
        ps.setDouble(8,bowler.getBowl_Economy());
        ps.setDouble(9,bowler.getBowl_Average());
        ps.setDouble(10,bowler.getBest_Bowl());
        ps.setInt   (11,bowler.getNoOf5Wikcets());
        ps.setString(12,bowler.getBEcon_Weight());
        ps.setString(13,bowler.getBAve_Weight());
        ps.setInt   (14,bowler.getResult());
        ps.setString(15,bowler.getError());
        ps.setString(16,bowler.getEpoc());
        ps.setString(17,bowler.getSum());
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
     }
  
  public int AddWic_KeeperTrainData(Neural_WicketKeeperList wkeeper){  //add trainData
          int result=0;
          con = new DBConnection().getConnection();
       
   try{
            
        String insert="insert into wkeeper_traindata(Player_ID,Player_Name,Player_Role,Player_Category,Match_Type,Nationality,Total_Match,Stumps,Catchs,Stumps_Weight,Catchs_Weight,Result,Error,Epoc,Sum)"
                + "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, wkeeper.getPlayerID());
        ps.setString(2, wkeeper.getPlayer_Name());
        ps.setString(3, wkeeper.getPlayer_Role());
        ps.setString(4, wkeeper.getPlayerCategory());
        ps.setString(5, wkeeper.getMatch_Type());
        ps.setString(6, wkeeper.getNationality());
        ps.setInt   (7, wkeeper.getTotal_Matchs());
        ps.setInt   (8,wkeeper.getStumps());
        ps.setInt   (9,wkeeper.getNo_ofCatchs());
        ps.setString(10,wkeeper.getStump_Weight());
        ps.setString(11,wkeeper.getCatch_Weight());
        ps.setInt   (12,wkeeper.getResult());
        ps.setString(13,wkeeper.getError());
        ps.setString(14,wkeeper.getEpoc());
        ps.setString(15,wkeeper.getSum());
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
     }
  
  public int AddAllrounder(Neural_AllRounderList allrounder){
       int result=0;
          con = new DBConnection().getConnection();
       
  try{
            
        String insert="insert into allrounder_traindata(Player_ID,Player_Name,Player_Role,Player_Category,Match_Type,Nationality,Total_Match,Bat_StrikeRate,Bat_Average,Bowl_Economy,Bowl_Average,TotWickets,BatSrate_Weight,BatAver_Weight,BowlEcon_Weight,BowlAver_Weight,Result,Error,Epoc,Sum)"
                + "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, allrounder.getAllrounder_ID());
        ps.setString(2, allrounder.getPlayerName());
        ps.setString(3, allrounder.getPlayerRole());
        ps.setString(4, allrounder.getPlayerCategory());
        ps.setString(5, allrounder.getMatchType());
        ps.setString(6, allrounder.getNationality());
        ps.setInt   (7, allrounder.getTotalMatchs());
        ps.setDouble(8, allrounder.getBat_Strike_Rate());
        ps.setDouble(9, allrounder.getBat_Average());
        ps.setDouble(10,allrounder.getBowl_Average());
        ps.setDouble(11,allrounder.getBowl_Economy());
        ps.setInt   (12,allrounder.getBestbowl());
        ps.setString(13,allrounder.getSrate_Weight());
        ps.setString(14,allrounder.getBatAve_Weight());
        ps.setString(15,allrounder.getBEcon_Weight());
        ps.setString(16,allrounder.getBowlAve_Weight());
        ps.setInt   (17,allrounder.getResult());
        ps.setString(18,allrounder.getError());
        ps.setString(19,allrounder.getEpoc());
        ps.setString(20,allrounder.getSum());
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
  } 
  
  public ArrayList<PlayersList> GetBatsman(String PName){        
    ArrayList< PlayersList> pList=new ArrayList<PlayersList>();
         
          con = new DBConnection().getConnection();
     try{
            
            String select="select * from batsman_traindata where Player_Role=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, PName);
            ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                    
                
                   String PlayerID=rs.getString("Player_ID");
                   String PlName=rs.getString("Player_Name");
                   String PlRole=rs.getString("Player_Role");
                   String PlCategory=rs.getString("Player_Category");
                   String Matchtype=rs.getString("Match_Type");
                   String Nationality=rs.getString("Nationality");
                   int    TotalMatch=rs.getInt("Total_Match");
                   int    Innings=rs.getInt("Innings");
                   double BatStrike=rs.getDouble("Bat_StrikeRate");
                   double BatAverage=rs.getDouble("Bat_Average");  
                   int    Highscore=rs.getInt("High_Score");
                   int    No50s=rs.getInt("No50s");
                   int    No100s=rs.getInt("No100s");    
                   String Pwheight=rs.getString("SRate_Weight");
                   String Awheight=rs.getString("Average_Weight");
                   int    Result=rs.getInt("Result");  
                   String Error=rs.getString("Error");  
                   String Epoc=rs.getString("Epoc");  
                   String Sum=rs.getString("Sum");   
                   
                    PlayersList batsman=new PlayersList(PlayerID, PlName, PlRole, PlCategory, Nationality, Matchtype, TotalMatch, Innings, BatStrike, BatAverage, No100s, No50s, Highscore, Pwheight,Awheight, Result, Error, Epoc, Sum);
                    pList.add(batsman);
                }
            rs.close();
            ps.close();
            return pList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
     }
  }
  
  public ArrayList<BowlerList> GetBowlers(String PName){       //search  Plauers ID
    ArrayList< BowlerList> bList=new ArrayList<BowlerList>();
          // int result=0;
          con = new DBConnection().getConnection();
     try{
            
            String select="select * from bowler_traindata where Player_Role=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, PName);
            ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                    
                
                   String PlayerID=rs.getString("Player_ID");
                   String PlName=rs.getString("Player_Name");
                   String PlRole=rs.getString("Player_Role");
                   String PlCategory=rs.getString("Player_Category");
                   String Matchtype=rs.getString("Match_Type");
                   String Nationality=rs.getString("Nationality");
                   int    TotalMatch=rs.getInt("Total_Match");
                   double BowlEconomy=rs.getDouble("Bowl_Economy");
                   double BowlAverage=rs.getDouble("Bowl_Average");
                   int    Bestbowl=rs.getInt("TotWickets");
                   int    No5wickets=rs.getInt("No5Wickets");  
                   String BEwheight=rs.getString("BowlEconomy_Weight");
                   String BAwheight=rs.getString("BowlAverage_Weight");
                   int    Result=rs.getInt("Result");  
                   String Error=rs.getString("Error");  
                   String Epoc=rs.getString("Epoc");  
                   String Sum=rs.getString("Sum");   
                   
                   BowlerList  bowler=new BowlerList(PlayerID, PlName, PlRole, PlCategory, Nationality, Matchtype, TotalMatch, BowlEconomy, BowlAverage, Bestbowl, No5wickets, BEwheight,BAwheight, Result, Error, Epoc, Sum);
                    bList.add(bowler);
                }
            rs.close();
            ps.close();
            return bList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
     }
  } 
  
  public ArrayList<Wicket_KeeperList> GetKeepers(String PName){       //search  Plauers ID
    ArrayList<Wicket_KeeperList> wkList=new ArrayList<Wicket_KeeperList>();
           
          con = new DBConnection().getConnection();
     try{
            
            String select="select * from wkeeper_traindata where Player_Role=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, PName);
            ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                    
                
                   String PlayerID=rs.getString("Player_ID");
                   String PlName=rs.getString("Player_Name");
                   String PlRole=rs.getString("Player_Role");
                   String PlCategory=rs.getString("Player_Category");
                   String Matchtype=rs.getString("Match_Type");
                   String Nationality=rs.getString("Nationality");
                   int    TotalMatch=rs.getInt("Total_Match");
                   int    Stumps=rs.getInt("Stumps");
                   int    Catchs=rs.getInt("Catchs");  
                   String Stumwheight=rs.getString("Stumps_Weight");
                   String Catwheight=rs.getString("Catchs_Weight");
                   int    Result=rs.getInt("Result");  
                   String Error=rs.getString("Error");  
                   String Epoc=rs.getString("Epoc");  
                   String Sum=rs.getString("Sum");   
                   
                    Wicket_KeeperList  keeper=new Wicket_KeeperList(PlayerID, PlName, PlRole, PlCategory, Nationality, Matchtype, TotalMatch, Catchs, Stumps,Stumwheight, Catwheight, Result, Error, Epoc, Sum);
                    wkList.add(keeper);
                }
            rs.close();
            ps.close();
            return wkList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
     }
  }
  
  public ArrayList<Allrounder_List> GetAllRounder(String PName){       //search  Plauers ID
    ArrayList<Allrounder_List> allList=new ArrayList<Allrounder_List>();
           
          con = new DBConnection().getConnection();
     try{
            
            String select="select * from allrounder_traindata where Player_Role=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, PName);
            ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                  
                
                   String PlayerID=rs.getString("Player_ID");
                   String PlName=rs.getString("Player_Name");
                   String PlRole=rs.getString("Player_Role");
                   String PlCategory=rs.getString("Player_Category");
                   String Matchtype=rs.getString("Match_Type");
                   String Nationality=rs.getString("Nationality");
                   int    TotalMatch=rs.getInt("Total_Match");  
                   double BatStrike=rs.getDouble("Bat_StrikeRate");
                   double BatAverage=rs.getDouble("Bat_Average");
                   double BowlEconomy=rs.getDouble("Bowl_Economy");
                   double BowlAverage=rs.getDouble("Bowl_Average");
                   int    Bestbowl=rs.getInt("TotWickets");
                   String Sratewheight=rs.getString("BatSrate_Weight");
                   String BAvewheight=rs.getString("BatAver_Weight");
                   String BEconwheight=rs.getString("BowlEcon_Weight");
                   String BowlAvewheight=rs.getString("BowlAver_Weight");          
                   int    Result=rs.getInt("Result");  
                   String Error=rs.getString("Error");  
                   String Epoc=rs.getString("Epoc");  
                   String Sum=rs.getString("Sum");   
                   
                  Allrounder_List  allrounder=new Allrounder_List(PlayerID, PlName, PlRole, PlCategory, Nationality, Matchtype, TotalMatch, BatStrike, BatAverage, BowlEconomy, BowlAverage, Bestbowl, Sratewheight,BAvewheight,BEconwheight,BowlAvewheight, Result, Error, Epoc, Sum);
                    allList.add(allrounder);
                }
            rs.close();
            ps.close();
            return allList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
     }
  }
  
  public int AddTeamPlayers(Team_Players team){  //add teams
          int result=0;
          con = new DBConnection().getConnection();       
  try{
            
        String insert="insert into teams(Teams_id,Team_Name,Player_Name,PlayerRole,Nationality,Total_Match,Innings,High_score,TotWickets,Strike_Rate,Average,Bowl_Economy,Bowl_Average,Total_Catch,Total_Stump,Bat_Sweight,Bat_Aweight,Bowl_Eweight,Bowl_Aweight,Stump_weight,Catch_weight)"
                + "    values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert);
        
        ps.setString(1, team.getTeam_ID());
        ps.setString(2, team.getTeam_Name());
        ps.setString(3, team.getPlayerName());
        ps.setString(4, team.getPlayerRole());
        ps.setString(5, team.getNationality());
        ps.setInt   (6, team.getTotalMatchs());
        ps.setInt   (7, team.getInnings());
        ps.setInt   (8, team.getHighscore());
        ps.setInt   (9, team.getNoofwickets());
        ps.setDouble(10, team.getBat_Strike_Rate());
        ps.setDouble(11,team.getBat_Average());
        ps.setDouble(12,team.getBowl_Economy());
        ps.setDouble(13,team.getBowl_Average());
        ps.setInt   (14,team.getCatchs());
        ps.setInt   (15,team.getStumps());
        ps.setString(16,team.getSrate_Weight());
        ps.setString(17,team.getBatAve_Weight());
        ps.setString(18,team.getBEcon_Weight());
        ps.setString(19,team.getBowlAve_Weight());
        ps.setString(20,team.getStump_Weight());
        ps.setString(21,team.getCatch_Weight());
         
        
        result=ps.executeUpdate();
        ps.close();
        return result;
        
            
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return result;
          }
     }
  
  public ArrayList<Team_Players> GetTeam(String PRole){        
    ArrayList<Team_Players> pList=new ArrayList<Team_Players>();
         
          con = new DBConnection().getConnection();
     try{
            
            String select="select * from teams where PlayerRole=?";
            PreparedStatement ps=con.prepareStatement(select);
            ps.setString(1, PRole);
            ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                    
                
                   String TeamID=rs.getString("Teams_id");
                   String TeamName=rs.getString("Team_Name");
                   String PlName=rs.getString("Player_Name");
                   String PlRole=rs.getString("PlayerRole");                  
                   String Nationality=rs.getString("Nationality");
                   int    TotalMatch=rs.getInt("Total_Match");
                   int    Innings=rs.getInt("Innings");
                   int    Highscore=rs.getInt("High_score");
                   int    TotWickets=rs.getInt("TotWickets");
                   double BatStrike=rs.getDouble("Strike_Rate");
                   double BatAverage=rs.getDouble("Average");               
                   double Bowl_economy=rs.getInt("Bowl_Economy");
                   double Bowl_Average=rs.getInt("Bowl_Average");  
                   int    Stumps= rs.getInt("Total_Catch");
                   int    Catchs= rs.getInt("Total_Stump");
                   String Bat_Swheight=rs.getString("Bat_Sweight");
                   String Bat_Awheight=rs.getString("Bat_Aweight");
                   String Bowl_Ewheight=rs.getString("Bowl_Eweight");
                   String Bowl_Avwheight=rs.getString("Bowl_Aweight");
                   String Stump_wheight=rs.getString("Stump_weight");
                   String Catch_wheight=rs.getString("Catch_weight");
                   
                  
                   Team_Players  teampl= new Team_Players(TeamID, TeamName, PlName, PlRole, Nationality, TotalMatch, Innings, Highscore, TotWickets, BatStrike, BatAverage, Bowl_economy, Bowl_Average, Stumps, Catchs, Bat_Swheight, Bat_Awheight, Bowl_Ewheight, Bowl_Avwheight, Stump_wheight, Catch_wheight);
                    pList.add(teampl);
                }
            rs.close();
            ps.close();
            return pList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null; 
     }
  } 
}
