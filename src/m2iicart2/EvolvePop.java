/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Test3.toString;

/**
 *
 * @author Dell
 */

public class EvolvePop {
    static long start = System.currentTimeMillis();
    public static void main(String[] args) {
      long start =System.currentTimeMillis();  
      
      Population [] pops = new Population[Population.nbrGenerations];
      // 
       Population p = new Population(Population.PopulationSize, true);
       pops[0]= p;
        //  System.out.println("Placement mat of indiv 0 de la population initiale \n"+toString(pops[0].individuals[0].placementFactor));  

    
     // evolve of second population 
     ///pops[1]= pops[0];
     Individual elitism = BestFitness(pops[0]);
      //  System.out.println("l'elitism est\n"+
        //        toString(elitism.placementFactor)+
          //      "de fitness= "+elitism.getFitness(elitism)); 
//         System.out.println("la 1ere population est ");
//      for(int i=0;i<Population.PopulationSize;i++){
//          System.out.println(""+toString(pops[0].individuals[i].placementFactor));
//      }
        
//        if(RouWhSelection.SelectIndivRWH(pops[0])!=(-1)){
//          
//        }
     
     //Population pool= new Population(Population.PopulationSize, true);
     
    for(int j=1;j<Population.nbrGenerations;j++){ 
//        int j=1;
       boolean elitismModified= true;
//      while((j<Population.nbrGenerations)&&(elitismModified==true)){
       pops[j]= new Population(Population.PopulationSize, true);
       pops[j]=pops[j-1];   
      Crossover.CrossoverIndviduals(pops[j]);
      Mutation.mutate(pops[j]);
      
     // System.out.println("la 2eme population est ");
     
      //for(int i=0;i<Population.PopulationSize;i++){
         // System.out.println(""+toString(pops[j].individuals[i].placementFactor));
//          if((pops[j].individuals[i].getFitness(pops[j].individuals[i]))>elitism.getFitness(elitism))
//          {
//             elitism=pops[j].individuals[i];
//             // System.out.println("le nouveau elitism est de fitness "+elitism.getFitness(elitism));
//             elitismModified=true;
//          }
//          else elitismModified=false;
    //}
      
      // && (Eq10.verifyEqTen2(pops[j],elitism))==true)
            if ( (BestFitness(pops[j]).getFitness(BestFitness(pops[j]))> elitism.getFitness(elitism) )) 
                   {
                //System.out.println("ok");
               // System.out.println("BestFitness(pops[j]).getFitness(BestFitness(pops[j]))");
          elitism= BestFitness(pops[j]);
          elitismModified=true;
          //System.out.println("le nouveau elitism est de fitness "+elitism.getFitness(elitism));
           
          } else { elitismModified=false;}
           }
        
        System.out.println("La solution apres "+Population.nbrGenerations+" itérations est\n"+toString(elitism.placementFactor));
        System.out.println("de fitness "+elitism.getFitness(elitism));
        long end =System.currentTimeMillis();
        System.out.println( "This test took approximately: " + (end - start)+ " ms" );
    
    }
    
    
        public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    
}

    private static Individual BestFitness(Population p) {
        float maxfitness=p.individuals[0].getFitness(p.individuals[0]);
         int ind=0;
        for(int i=0; i<Population.PopulationSize;i++){
            if(p.individuals[i].getFitness(p.individuals[i])>maxfitness){
              maxfitness= p.individuals[i].getFitness(p.individuals[i]);
              ind=i;
            }
        
        }
        return p.individuals[ind];
       
    }
    
    
     private static int IndBestFitness(Population p) {
        float maxfitness=p.individuals[0].getFitness(p.individuals[0]);
         int ind=0;
        for(int i=0; i<Population.PopulationSize;i++){
            if(p.individuals[i].getFitness(p.individuals[i])>maxfitness){
              maxfitness= p.individuals[i].getFitness(p.individuals[i]);
              ind=i;
            }
        
        }
        return ind;
       
    }
}