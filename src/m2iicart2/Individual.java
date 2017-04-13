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
import static m2iicart2.Matrix.creerMatAlea4;
import static m2iicart2.Matrix.product2;

/**
 *
 * @author Dell
 */
public class Individual {

     int LnbrDC=Population.LnbrDC;
     int NnbrDS=Population.NnbrDS;
     int MnbrC=Population.MnbrC;
    
   final int[][] processingFactor = creerMatAlea1(Population.MnbrC,NnbrDS);
   final int[][] placementFactor = creerMatAlea2(Population.NnbrDS,LnbrDC);
   float fitnessFnc;
   
//   double fitnessFunc;
   
    static int defaultGeneLength = 64;
    private final byte[] genes = new byte[defaultGeneLength];
    // Cache
    //private double fitnessFunc = 0;

    public float getFitnessFnc() {
        return fitnessFnc;
    }

    public void setFitnessFnc(float fitnessFnc) {
        this.fitnessFnc = fitnessFnc;
    }

 
 
    // Create a random individual
   
    public float getFitness(Individual indivPlcF){
     //  int[][] indivPlcF = generateIndividual2();
         int [][] Z= product2(processingFactor,indivPlcF.placementFactor);
         int [][] Zb=Matrix.uzik(Z);
         int [][] SZb= SumRow2(Zb);
         float aux=0; 
  
     int [][]mu=creerMatAlea3(1,MnbrC);
     //float [][]mu=creerMatAlea4(1,MnbrC);
    // System.out.println("mu=\n"+toString2(mu));
   
 for(int i=0;i<MnbrC;i++){
     
    
      aux =(long)(aux+SZb[i][0])*mu[0][i];
       
    }
 
  return  1/aux;
 
  
    }
    
    
//    public int[][] generateIndividual2(){
//       int[][] indivPlcF = creerMatAlea2(NnbrDS,LnbrDC);
//
//  return  indivPlcF;
// 
//    }
    
    
    public int getLnbrDC() {
        return LnbrDC;
    }

    public void setLnbrDC(int LnbrDC) {
        this.LnbrDC = LnbrDC;
    }

    public int getNnbrDS() {
        return NnbrDS;
    }

    public void setNnbrDS(int NnbrDS) {
        this.NnbrDS = NnbrDS;
    }

    public int getMnbrC() {
        return MnbrC;
    }

    public void setMnbrC(int MnbrC) {
        this.MnbrC = MnbrC;
    }

    public static int getDefaultGeneLength() {
        return defaultGeneLength;
    }

    public static void setDefaultGeneLength(int defaultGeneLength) {
        Individual.defaultGeneLength = defaultGeneLength;
    }

 

   
}
 
  
 
//    /* Public methods */
//    public int size() {
//        return genes.length;
//    }
// 
//    public int getCompetence() {
//        if (competence == 0) {
//            competence = Skill.getSkill(this);
//        }
//        return competence;
//    }
 
//    @Override
//    public String toString() {
//        String geneString = "";
//        for (int i = 0; i < size(); i++) {
//            geneString += getGene(i);
//        }
//        return geneString;
//    }
//}
