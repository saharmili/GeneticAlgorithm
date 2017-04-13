package m2iicart2;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Mutation {
    
//    public static double dataCenterSize = 100000;
//    public static double dataSetSize = 1024;
   // public static void main(String[] args) {
    
       // Population p= new Population(Population.PopulationSize, true);
    public static void mutate(Population p){
        int i=0;
        if(i<p.PopulationSize){
           ///  System.out.println("indiv avant mutation\n"+toString(p.individuals[i].placementFactor));
              float r;
              r= (float)Math.random()*1;
              ///System.out.println("r= "+r);
              ///System.out.println("MutationRate= "+Population.MUTATION_RATE);
             if(r<Population.MUTATION_RATE){
                
               mutateIndiv(p.individuals[i].placementFactor);
                 ///System.out.println("l'individu va subir une mutation");
                 ///System.out.println("indiv apres mutation\n"+toString(p.individuals[i].placementFactor));
               
                // System.out.println("i= "+i);
              // System.out.println("indiv apres mutation\n"+toString(p.individuals[i].placementFactor));
               
               
//                 int r1;
//              int aux= p.NnbrDS;
////         r1=(int) Math.round(Math.random()*aux);
////                 System.out.println("r1= "+r1);
             } 
         
        }
        
       i++; 
     //  System.out.println("indiv apres mutation\n"+toString(p.individuals[i].placementFactor));
    /// if(SumRow(p.individuals[i].placementFactor)==1){
       //System.out.println("indiv apres mutation\n"+toString(p.individuals[i].placementFactor));
         ///System.out.println("individu retenu");
         
     ///}
             
    }

    public static void mutateIndiv(int [][] indiv) {
         int r1;
         int aux= (indiv.length-1);
         int aux1=(indiv[0].length-1);
         r1=(int) Math.round(Math.random()*aux);
         int r2,r3;
         r2= (int) Math.round(Math.random()*aux1);
         r3= (int) Math.round(Math.random()*aux1);
         if(r2!=r3){
             //System.out.println("done if r2!= r3");
                 if(indiv[r1][r2]==1){
                 indiv[r1][r2]=0;
                 indiv[r1][r3]=1;
                 }
         }
         else{
             indiv[r1][r2]=1;
               int k=0;
               if((indiv[r1][k]==1)&&(k!=r2)){
                  // System.out.println("done if 2"); 
               indiv[r1][k]=0;
           }
               k++;
               
         }//
    
    }
       
    
    
      public  static int  SumRow (int [][]mat){
   
 int aux=0;       
//lignes
      int m=mat.length;
      //colomns
      int n=mat[0].length;
   // for(int ind=0;ind<m;ind++){
      int ind=0;
      if(ind<m){
        for(int i=0;i<n;i++){
            aux=aux+mat[ind][i];
            
         
    }
     if(aux==1){ind ++;}
     else return 0;
      
   }  return 1;
      
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
