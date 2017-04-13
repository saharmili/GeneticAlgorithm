/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

/**
 *
 * @author Dell
 */
 public class Crossover {
    int i=0;
    int num= 0;
    public static void CrossoverIndviduals(Population p){
    float [] r =new float[Population.PopulationSize];
    // int [] rk =new int[p.PopulationSize];
     //int [] pool =new int[p.PopulationSize];
    Population pool= new Population(Population.PopulationSize, true);
     int k=0;  
     int i=0;
     int num=0;
     int j=0;
      if (i<Population.PopulationSize){
         
            r[i]=(float)(Math.random()*1);
            if (r[i]<Population.CROSSOVER_RATE){
                pool.individuals[k]=p.individuals[i];
                k++;
                //int selected= i;
                num=num+1;
            }
      i=i+1;
      if (j<(num/2)){
       
          int rk = (int)((num/2)+Math.random()*num);
          if (rk!=j){
          //    change Genes segments of rk and j 
              changeGeneSeg(p, p.individuals[rk].placementFactor,p.individuals[j].placementFactor);
            
          }
          j=j+1;
           }
      }

  
   }
       public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }
    public static Population PopPaired(Population p){
        
        ///////////////
    
    return p;
    }

   // public static void changeGeneSeg(Individual indiv1, Individual indiv2,int PopulationSize) {
   // public static void main(String[] args) {
    public static void changeGeneSeg(Population p, int[][] indiv1, int [][] indiv2){
        
//      Population p= new Population(Population.PopulationSize, true);
//         int[][] indiv1=p.individuals[1].placementFactor;
//         int[][] indiv2=p.individuals[2].placementFactor;
        
      int r1,r2;
      r1=(int)( Math.round(Math.random()*(indiv1.length)) );
      int aux= indiv1.length - r1;
      r2= (int)(r1+( Math.round(Math.random()*aux)));
//        System.out.println("r1= "+r1+" et r2= "+r2);
//       System.out.println("indiv1\n"+toString(indiv1));
//       System.out.println("indiv2\n"+toString(indiv2));
       int [][] gene1= new int[(r2-r1)+1][indiv1[0].length];
       int [][] gene2= new int[(r2-r1)+1][indiv2[0].length];
       //int [][] mat= new int[indiv1.length][indiv1[0].length];
       int [][] mat1= indiv1;
       int [][] mat2= indiv2;
      // int [][] mat= indiv1;
       //System.out.println("mat\n"+toString(mat));
        int k=0;
       for(int i=r1;i<=r2;i++){
          
           for(int j=0;j<mat1[0].length;j++){
              // System.out.println("generateIndividual2()[i][j]= "+indiv1.generateIndividual2()[i][j]);
            // System.out.println("indiv1["+i+"]"+"["+j+"]= "+indiv1[i][j]);
            gene1[k][j]=indiv1[i][j];
            gene2[k][j]=indiv2[i][j];
            mat1[i][j]=gene2[k][j];
            mat2[i][j]=gene1[k][j];
             
     
       }
        k++;
       }
//        System.out.println("gene1\n"+toString(gene1));
//        System.out.println("gene2\n"+toString(gene2));
//        System.out.println("mat1\n"+toString(mat1));
//        System.out.println("mat2\n"+toString(mat2));
    }  
    }
//}
