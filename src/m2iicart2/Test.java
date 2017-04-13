/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;


import static m2iicart2.Matrix.creerMatAlea1;
import static m2iicart2.Matrix.creerMatAlea2;
import static m2iicart2.Matrix.product2;
//import static m2iicart2.Matrix.transposeMatrix;
//import static m2iicart2.Matrix.SumColumn;
//import static m2iicart2.Matrix.SumRow;
import static m2iicart2.Matrix.SumRow2;
import static m2iicart2.Matrix.creerMatAlea3;
/**
 *
 * @author Dell
 */
public class Test {

//    public static double dataCenterSize = 100000;
//    public static double dataSetMaxSize = 1024;
//    public static double dataSetMinSize = 1;
   
    
    
    /* /** renvoie une chaine représentant la matrice 'mat' */
     public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }
      public static String toString2(double[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }
    public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);    
//    System.out.println("nombre de lignes : ");    
//    int n = in.nextInt(); 
//     System.out.println("nombre de colonnes : "); 
//     int m =in.nextInt();
//     int LnbrDC=10;
//     int NnbrDS=150;
//     int MnbrC=100;
//        int LnbrDC=5;
//     int NnbrDS=10;
//     int MnbrC=8;
       int[][] processingFactor = creerMatAlea1(Population.MnbrC,Population.NnbrDS);
      int[][] placementFactor = creerMatAlea2(Population.NnbrDS,Population.LnbrDC);
      /////////////
    
     // System.out.println("MatIni=\n"+toString(placementFactor));
      ////Matrix Z qui est le produit entre placementFactor (beta)et processingFactor(alpha)
     // int [][] T= transposeMatrix(placementFactor);
       //System.out.println("init=\n"+toString(placementFactor));
      
       //int [][] T= transposeMatrix(placementFactor);
      //   System.out.println("Transpose=\n"+toString(placementFactor));
     int [][] Z= product2(processingFactor,placementFactor);
     //int [][] SumRows = 
     
     System.out.println("\nBeta=\n"+toString(placementFactor)+"\nAlpha=\n"+toString(processingFactor));
    System.out.println("Beta*Alpha=\n"+toString(Z));
    int [][] Zb=Matrix.uzik(Z);
    System.out.println("Beta*Alpha binaire=\n"+toString(Zb));
    System.out.println("Somme des rows de Beta*Alpha binaire-1=\n"+toString(SumRow2(Zb)));
     int [][] SZb= SumRow2(Zb);
    //eq 14
//    for(int i=0;i<LnbrDC;i++){
//       
//   
//    // eq 13
//   
////    for(int j=0;j<LnbrDC;j++){
////         
////       if (SumColumn(Z,j)==1) 
////           System.out.println("1");
////       else System.out.println("0");
////       
////      }
//    }
    
     
     
  //   Computation c=new Computation(dataCenterSize, MnbrC);
     
     double aux=0; 
  
     int [][]mu=creerMatAlea3(1,Population.MnbrC);
     System.out.println("mu=\n"+toString(mu));
   
 for(int i=0;i<Population.MnbrC;i++){
     
    
      aux =(aux+SZb[i][0])*mu[0][i];
       
    }
 /////////////On cherche à minimiser cette somme c'est ça la solution 
        System.out.println("s = "+aux);
        System.out.println("La fonction fitness est = "+1/aux);
    }
}

