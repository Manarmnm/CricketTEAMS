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
public class Neural_Playerlist extends PlayersList{
    public double[] weights;
    public int Bias=1;
    public double Learning_Rate = 0.05;
    public double sumvalue;
    public double result;
    public double target;
    public double error;
    public double input1;
    public double input2;
    public double[] inputarray = new double[2];
    public int Epoch=0;
  //  public double srate;
   
    
    public Neural_Playerlist(String Player_Name, int Matchs, int innings, double Strike_Rate, double Average, int High_Score) {
        super(Player_Name, Matchs, innings, Strike_Rate, Average, High_Score);
       }
    
      public double[] getInput(){
  
             input1 = this.Strike_Rate;
             input2 = this.Average;
             inputarray[0] = input1;
             inputarray[1] = input2;
  //System.out.println("Input Signals : "+Arrays.toString(inputarray));
                return inputarray;
        }
   
     public double[] RandomMethod(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[2];

           for(int k=0;k<2;k++){
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                     Temp[k]=RandomWeight;
        } 
           
            this.weights=Temp;
             return weights; 
    } 
   
     public double SumFunction(){
            for (int i = 0; i < 2; i++) {
                sumvalue += weights[i]*inputarray[i]+Bias;  
           } 
          return sumvalue;
    }
     
    public void Activate(){ 
    //Lianer function     
//     if(sumvalue>1)
//        result=1;
//     else if(sumvalue<=1)
//        result=0;
     for(int i=0; i<2; i++){
         result= 1/(1+ Math.pow(Math.E, (-1*sumvalue)));
         
      }
    }
    
    public void TrainingNetwork(){ 
    
        target = 0;
      
       error = target - result;
        
       weights[0] = weights[0] + error * inputarray[0] * Learning_Rate;
       weights[1] = weights[1] + error * inputarray[1] * Learning_Rate;
       
       
   }
   
   public void FirstRun(){
         
      System.out.println("Inputs : "+Arrays.toString(inputarray));
      System.out.println("Rand : "+Arrays.toString(weights));
      System.out.println("Sum : "+sumvalue);
      System.out.println("Result : "+result);
      System.out.println("Target : "+target);
      System.out.println("Error : "+error);
      
  }
   
   public void Adjustment(){
       
     System.out.println("Input : "+Arrays.toString(inputarray));
     System.out.println("Rand : "+Arrays.toString(weights));
     System.out.println("Sum : "+sumvalue);
     System.out.println("Result : "+result);
     System.out.println("Target : "+target);
     System.out.println("Error : "+error);
   
   }   
    
}
