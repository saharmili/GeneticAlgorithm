/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Crossover.toString;

/**
 *
 * @author Dell
 */
public class Test3 {
      public static void main(String[] args) {
         
        Population p = new Population(Population.PopulationSize, true);
         
       
       
       //for (int i=0; i<Population.PopulationSize;i++){
            
           // System.out.println("\n"+p.individuals[i].getFitness(p.individuals[i]));
      
        System.out.println("mat1\n"+toString((p.individuals[1]).placementFactor));
        System.out.println("mat2\n"+toString(p.individuals[2].placementFactor));
           Crossover.changeGeneSeg(p,p.individuals[0].placementFactor,p.individuals[1].placementFactor);
           System.out.println("mat1apresCrossover\n"+toString((p.individuals[1]).placementFactor));
        System.out.println("mat2aprescrossover\n"+toString(p.individuals[2].placementFactor));
           
        //} 
    }
      public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    
}
}
