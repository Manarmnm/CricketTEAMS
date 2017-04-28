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
public class Train_Bowler {
    public double[] Econ_weights;
    public double[] Ave_weights;
    public int Bias=1;
    public double Learning_Rate = 0.01;
    public double sumvalue;
    public double result;
    public double error;
    public int target;
    public double[] Econ_array = new double[1];
    public double[] Ave_array= new double[1];
    public int Epoch=0;

 
 public double[] getEconInput(double input1,  int inputbias){

             Econ_array[0] = input1;
      
            return Econ_array;
      }
 
 public double[] getAverageInput(double input2,  int inputbias){

             Ave_array[0] = input2;
             
            return  Ave_array;
        }
   
   
  public double[] RandomMethodBEcon(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   } 
           
      this.Econ_weights=Temp;
      return Econ_weights; 
    } 
  
  public double[] RandomMethodAverage(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                     Temp[k]=RandomWeight;
        } 
           
             this.Ave_weights=Temp;
             return Ave_weights; 
    } 
   
  public double SumFunction(){
         for (int i = 0; i < 1; i++) {
               
            sumvalue += Econ_weights[i]*Econ_array[i]+Bias;  
           
         }  
          return sumvalue;
    }
   
  public double SumFunction1(){
       
        for (int i = 0; i < 1; i++) {
               
            sumvalue += Ave_weights[i]*Ave_array[i]+Bias;  
        } 
           
        return sumvalue;
    }
   
  public void Activate(){ 
 
     for(int i=0; i<2; i++){
         
         result= 1/(1+ Math.pow(Math.E, (-1*sumvalue)));
         
      } 
  }
    
  public void TrainingNetwork_BEcon(int target){ 
    
       error = target - result ;
        
       Econ_weights[0] = Econ_weights[0] + error * Econ_array[0] * Learning_Rate ;
    
   }
      
  public void TrainingNetwork_Average(int target){ 
    
       error = target - result ;
       
       Ave_weights[0] = Ave_weights[0] + error * Ave_array[0] * Learning_Rate ; 
   }  
   
}
