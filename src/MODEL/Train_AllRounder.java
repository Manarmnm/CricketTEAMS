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
public class Train_AllRounder {
    public double[] Srate_weights;
    public double[] Ave_weights;
    public double[] BEcon_weights;
    public double[] BAve_weights;
    public int Bias=1;
    public double Learning_Rate = 0.01;
    public double sumvalue;
    public double result;
    public double error;
    public int target;
    public double[] Srate_array = new double[1];
    public double[] Ave_array= new double[1];
    public double[] BEcon_array = new double[1];
    public double[] BAve_array= new double[1];
    public int Epoch=0;  
     public double[] getSrateInput(double input1,  int inputbias){

             Srate_array[0] = input1;
             return Srate_array;
        }
 public double[] getBatAveInput(double input2,  int inputbias){

             Ave_array[0] = input2;
            return  Ave_array;
        }
 public double[] getBEconInput(double input3,  int inputbias){

            BEcon_array [0] = input3;
            return  BEcon_array;
        }
 public double[] getBowAveInput(double input4,  int inputbias){

            BAve_array [0] = input4;
            return  BAve_array;
        }
   
  public double[] RandomMethodSrate(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   }     
      this.Srate_weights=Temp;
      return Srate_weights; 
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
  public double[] RandomMethodBEcon(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   }     
      this.BEcon_weights=Temp;
      return BEcon_weights; 
    } 
  public double[] RandomMethodBowAver(){
         double Max = 1;
         double Mini = 0;
         double [] Temp = new double[1];

           for(int k=0;k<1;k++){
               
               double Rand = new Random().nextDouble();
               double RandomWeight = Mini+ (Rand * (Max - Mini));
               
                 Temp[k]=RandomWeight;
   }     
      this.BAve_weights=Temp;
      return BAve_weights; 
    }  
  public double SumFunction(){
            for (int i = 0; i < 1; i++) {
                sumvalue += Srate_weights[i]*Srate_array[i]+Bias;  
           } 
          return sumvalue;
    }
  public double SumFunction1(){
            for (int i = 0; i < 1; i++) {
                sumvalue += Ave_weights[i]*Ave_array[i]+Bias;  
           } 
          return sumvalue;
    }
  public double SumFunction2(){
            for (int i = 0; i < 1; i++) {
                sumvalue += BEcon_weights[i]*BEcon_array[i]+Bias;  
           } 
          return sumvalue;
    }     
  public double SumFunction3(){
            for (int i = 0; i < 1; i++) {
                sumvalue += BAve_weights[i]*BAve_array[i]+Bias;  
           } 
          return sumvalue;
    } 
  public void Activate(){ 

     for(int i=0; i<2; i++){
         result= 1/(1+ Math.pow(Math.E, (-1*sumvalue)));
         
      }
    }
    
    public void TrainingNetwork(int target){ 

       error = target - result ;
       Srate_weights[0] = Srate_weights[0] + error * Srate_array[0] * Learning_Rate ;
   }
    public void TrainingNetwork1(int target){ 

       error = target - result ;
       Ave_weights[0] = Ave_weights[0] + error * Ave_array[0] * Learning_Rate ;
   }  
  public void TrainingNetwork2(int target){ 

       error = target - result ;
       BEcon_weights[0] = BEcon_weights[0] + error * BEcon_array[0] * Learning_Rate ;
   } 
  public void TrainingNetwork3(int target){ 

       error = target - result ;
       BAve_weights[0] = BAve_weights[0] + error * BAve_array[0] * Learning_Rate ;
   } 
}
