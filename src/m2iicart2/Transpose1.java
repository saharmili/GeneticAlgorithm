/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Transpose1 {
    
 

    public static void main(String[] args) {
        int [][] mat1= new int [2][3];
        for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
            mat1[i][j]= i+1;
          }
        }
         System.out.println("la matrice initiale est\n"+toString(mat1));
    
       int n=mat1[0].length;
//      System.out.println("ncolones"+n);
     //lignes
      int m=mat1.length;
      int [][] Tmat1 = new int[3][2];
      
      for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
//                int temp = Tmat1[i][j];
//                Tmat1[i][j] = Tmat1[j][i];
//                Tmat1[j][i] = temp;
               // int temp = mat1[i][j];
                Tmat1[i][j] = mat1[j][i];
               // Tmat1[j][i] = temp;
             
              
            }
        }
//        System.out.println("la matrice initiale est\n"+toString(mat1));
        System.out.println("la matrice inversée est\n"+toString(Tmat1));
   

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