/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Matrix.SumRow2;
import static m2iicart2.Matrix.creerMatAlea1;
import static m2iicart2.Matrix.creerMatAlea2;
import static m2iicart2.Matrix.creerMatAlea3;
import static m2iicart2.Matrix.product2;
import static m2iicart2.Test.toString2;

/**
 *
 * @author Dell
 */
public class Individual2 {
     int LnbrDC=5;
     int NnbrDS=10;
     int MnbrC=8;
    public Matrix indiv ;
    
    final int[][] processingFactor = creerMatAlea1(MnbrC,NnbrDS); 
   public double fitnessFunc;
   
 
    public Individual2(Matrix indiv) {
        this.indiv = indiv;
        
    }
    
    

    public void generateIndividual(){
       int[][] indivPF = creerMatAlea2(NnbrDS,LnbrDC);
        int [][] Z= product2(processingFactor,indivPF);
         int [][] Zb=Matrix.uzik(Z);
         int [][] SZb= SumRow2(Zb);
          double aux=0; 
  
     int [][]mu=creerMatAlea3(1,MnbrC);
    // System.out.println("mu=\n"+toString2(mu));
   
 for(int i=0;i<MnbrC;i++){
     
    
      aux =(aux+SZb[i][0])*mu[0][i];
       
    }
 
  double fitnessFunc= 1/aux;
 
    }

  
    
}
