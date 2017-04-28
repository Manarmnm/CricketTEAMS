/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Random;

/**
 *
 * @author MASS MNM
 */
public class Train_Keeper {
    public double[] Stumps_weights;
    public double[] Catchs_weights;
    public int Bias=1;
    public double Learning_Rate = 0.01;
    public double sumvalue;
    public double result;
    public double error;
    public int target;
    public double[] Stump_array = new double[1];
    public double[] Catch_array= new double[1];
    public int Epoch=0;
    
    
   public double[] getStumpInput(double input1,  int inputbias){

             Stump_array[0] = input1;
             
             return Stump_array;
        }
   public double[] getCatchInput(double input2,  int inputbias){

             Catch_array[0] = input2;
           
            return  Catch_array;
       }
   public double[] RandomMethodStump(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   } 
           
      this.Stumps_weights=Temp;
      return Stumps_weights; 
    } 
  
  public double[] RandomMethodCatch(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                     Temp[k]=RandomWeight;
        } 
           
             this.Catchs_weights=Temp;
             return Catchs_weights; 
    } 
   
  public double SumFunction(){
            for (int i = 0; i < 1; i++) {
                sumvalue += Stumps_weights[i]*Stump_array[i]+Bias;  
           } 
          return sumvalue;
    }
       
  public double SumFunction1(){
            for (int i = 0; i < 1; i++) {
                sumvalue += Catchs_weights[i]*Catch_array[i]+Bias;  
           } 
          return sumvalue;
    }
  public void Activate(){ 

     for(int i=0; i<2; i++){
         result= 1/(1+ Math.pow(Math.E, (-1*sumvalue)));
         
      }
    }
   public void TrainingNetwork_Stump(int target){ 
    
       error = target - result ;
        
      Stumps_weights[0] = Stumps_weights[0] + error * Stump_array[0] * Learning_Rate ;
     
   }
      
  public void TrainingNetwork_Catch(int target){ 
    
       error = target - result ;
       
       Catchs_weights[0] = Catchs_weights[0] + error * Catch_array[0] * Learning_Rate ; 
   } 
}
