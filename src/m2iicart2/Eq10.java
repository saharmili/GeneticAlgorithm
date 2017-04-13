/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Matrix.remplMatSizeDS;
import static m2iicart2.Matrix.verifyMaxCapacity;

/**
 *
 * @author Dell
 */
public class Eq10 {
    
    
 //public static boolean verifyEqTen (int [][] mat){
   // public static void main(String[] args) {
       public static boolean verifyEqTen(Population p,int ind){
        //Population p= new Population(Population.PopulationSize, true);
        // int ind= 2;
        int [][] mat=p.individuals[ind].placementFactor;
        int[][] matSizeDS=new int[Population.NnbrDS][1];
        //System.out.println("nbr des lignes= "+ matSizeDS.length);
        int[][] matCapDC=new int[Population.LnbrDC][1];
        //remplmatSizeDS(matSizeDS,1024)
        //int [][]=new 
        int[][] product= new int[Population.LnbrDC][1];
//        System.out.println("transpose matrice mat\n"+toString(Matrix.transposeMatrix(mat)));
//        System.out.println("matSizeDS"+matSizeDS.length);
//        System.out.println("La matrice MatSizeDs\n"+toString(Matrix.remplMatSizeDS(matSizeDS,1024)));
        product= Matrix.product2(Matrix.transposeMatrix(mat),Matrix.remplMatSizeDS(matSizeDS, (int) DataSet.dataSetSize));
        //System.out.println("product\n"+toString(product));

        if(verifyMaxCapacity(product,remplMatSizeDS(matCapDC, (int) DataCenter.dataCenterSize))){
           //System.out.println("ok");
       
        return true ;
            
     
      
    }
      else return false;
    }
       
       
           public static boolean verifyEqTen2(int [][]mat){
        //Population p= new Population(Population.PopulationSize, true);
        // int ind= 2;
        int[][] matSizeDS=new int[Population.NnbrDS][1];
        //System.out.println("nbr des lignes= "+ matSizeDS.length);
        int[][] matCapDC=new int[Population.LnbrDC][1];
        //remplmatSizeDS(matSizeDS,1024)
        //int [][]=new 
        int[][] product= new int[Population.LnbrDC][1];
//        System.out.println("transpose matrice mat\n"+toString(Matrix.transposeMatrix(mat)));
//        System.out.println("matSizeDS"+matSizeDS.length);
//        System.out.println("La matrice MatSizeDs\n"+toString(Matrix.remplMatSizeDS(matSizeDS,1024)));
        product= Matrix.product2(Matrix.transposeMatrix(mat),Matrix.remplMatSizeDS(matSizeDS,(int) DataSet.dataSetSize));
        //System.out.println("product\n"+toString(product));

        if(verifyMaxCapacity(product,remplMatSizeDS(matCapDC,(int) DataCenter.dataCenterSize))){
           //System.out.println("ok");
       
        return true ;
            
     
      
    }
      else return false;
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

