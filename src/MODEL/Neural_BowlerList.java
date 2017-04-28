/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author MASS MNM
 */
public class Neural_BowlerList extends BowlerList{
    public double[] BEconomy_weights;
    public double[] BAverage_weights;
    public int Bias=1;
    public double Learning_Rate = 0.01;
    public double sumvalue;
    public double result;
    public double error;
    public int target;
    public double[] Econ_array = new double[1];
    public double[] Ave_array= new double[1];
    public int Epoch=0;

    public Neural_BowlerList(String PlayerID, String Player_Name, String Player_Role, String PlayerCategory, String Nationality, String Match_Type, int Total_Matchs, double Bowl_Economy, double Bowl_Average, double Best_Bowl, int NoOf5Wikcets,String BEcon_Weight,String BAve_Weight,int Result, String Error, String Epoc, String Sum) {
        super(PlayerID, Player_Name, Player_Role, PlayerCategory, Nationality, Match_Type, Total_Matchs, Bowl_Economy, Bowl_Average, Best_Bowl, NoOf5Wikcets,BEcon_Weight,BAve_Weight,Result, Error, Epoc, Sum);
    }

   public double[] getBEconInput(double input1,  int inputbias){

             Econ_array[0] = input1;
             
             return Econ_array;
        }
   public double[] getBAverageInput(double input2,  int inputbias){

             Ave_array[0] = input2;
           
            return  Ave_array;
        }
     
   public double[] RandomMethodBECon(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   } 
           
      this.BEconomy_weights=Temp;
      return BEconomy_weights; 
    } 
  
   public double[] RandomMethodBAverage(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                     Temp[k]=RandomWeight;
        } 
           
             this.BAverage_weights=Temp;
             return BAverage_weights; 
    } 
   
   public double SumFunction(){
           for (int i = 0; i < 1; i++) {
               
                sumvalue += BEconomy_weights[i]*Econ_array[i]+Bias;  
           } 
           
          return sumvalue;
    }
   
   public double SumFunction1(){
       
           for (int i = 0; i < 1; i++) {
               
                sumvalue += BAverage_weights[i]*Ave_array[i]+Bias;  
           } 
           
          return sumvalue;
    }
   
   public void Activate(){ 
 
     for(int i=0; i<2; i++){
         result= 1/(1+ Math.pow(Math.E, (-1*sumvalue)));
         
      } 
  }
    
   public void TrainingNetwork_Econe(int target){ 
    
       error = target - result ;
        
      BEconomy_weights[0] = BEconomy_weights[0] + error * Econ_array[0] * Learning_Rate ;
      // weights[1] = weights[1] + error * inputarray[1] * Learning_Rate ; 
   }
      
  public void TrainingNetwork_Average(int target){ 
    
       error = target - result ;
       
       BAverage_weights[0] = BAverage_weights[0] + error * Ave_array[0] * Learning_Rate ; 
   }  
   
   public void FirstRun(){
         
      System.out.println("Inputs 1: "+Arrays.toString(Econ_array));
      System.out.println("Inputs 2: "+Arrays.toString(Ave_array));
      System.out.println("Rand : "+Arrays.toString(BEconomy_weights));
      System.out.println("Rand : "+Arrays.toString(BAverage_weights));
      System.out.println("Sum : "+sumvalue);
      System.out.println("Result : "+result);
      System.out.println("Target : "+target);
      System.out.println("Error : "+error);
      
  }
   
   public void Adjustment(){
       
      System.out.println("Inputs 1: "+Arrays.toString(Econ_array));
      System.out.println("Inputs 2: "+Arrays.toString(Ave_array));
      System.out.println("New Weight  1: "+Arrays.toString(BEconomy_weights));
      System.out.println("New Weightt 2: "+Arrays.toString(BAverage_weights));
     System.out.println("Sum : "+sumvalue);
     System.out.println("Result : "+result);
     System.out.println("Target : "+target);
     System.out.println("Error : "+error);
   
   }   
}
