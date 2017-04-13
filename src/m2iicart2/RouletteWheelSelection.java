/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;
//import m2iicart2.Population;

public class RouletteWheelSelection {
  
    
    public static void main(String[] args) {
     
     // int populationSize=11;
      
       double p[] = new double[Population.PopulationSize];
       double p1[] =new double[Population.PopulationSize];
       double q[] = new double[Population.PopulationSize];
    Population pop = new Population(Population.PopulationSize, true);
   
    
  double aux= 0;
 
  int indselect;
  for(int i=0;i<Population.PopulationSize;i++){
     // System.out.println("p["+i+"]= "+pop.individuals[i].generateIndividual());
       p1[i]=(pop.individuals[i].getFitness(pop.individuals[i]));
      // System.out.println("p1["+i+"]= "+p1[i]);
      aux=aux+p1[i];
      
     }
  
   float aux3=(float) 0.0;
  for(int i=0;i<Population.PopulationSize;i++){
      p[i]= (p1[i]/aux);
     System.out.println("p["+i+"]= "+p[i]);
     aux3=(float)(aux3+p[i]);
  } 
        System.out.println("la somme des probabilités vaut aux3= "+aux3);
  double aux1=0;
   double r= Math.random()*1;
     System.out.println("le reel généré est r="+r);
     q[0]=0.0;
        System.out.println("q[0]= "+q[0]);
  for(int k=1;k<Population.PopulationSize;k++){
     
     
      for(int i=1;i<(k+1);i++){
          aux1=aux1+p[i];  
          //System.out.println("aux1= "+aux1);
      }
      //genetic operators step 3
      q[k]= aux1;
      aux1=0.0;
      System.out.println("q["+k+"]= "+q[k]);
     //genetic operators step 4
      
      if((r>q[k-1])&&(r<q[k])){
          
         indselect=k;
         System.out.println("indselect= "+indselect);
          System.out.println("matplacement Ind selected\n"+toString(pop.individuals[indselect].placementFactor));
          if((Eq10.verifyEqTen(pop,indselect))==true){
           System.out.println("l'individu selectinné:\n"+toString(pop.individuals[indselect].placementFactor));
       }
          
     // }
   //  aux1=0.0;    
  }
  
    }}
public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }}
