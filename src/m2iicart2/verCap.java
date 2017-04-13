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
public class verCap {
    public static void main(String[] args) {
        int [][] mat1= new int[5][1];
        int [][]mat=Matrix.remplMatSizeDS(mat1, 5000);
        int [][] cap=Matrix.remplMatSizeDS(mat1, 10000) ;       
        System.out.println(" "+ verifyMaxCapacity(mat, cap));
    }
  public static boolean verifyMaxCapacity (int[][] mat, int [][] cap){
         int m=mat.length;
         boolean b= true;
//         int n= mat2[0].length;
//         int i=0;
//           while((i<m)&&(cap[i][0]>= mat[i][0])) {
//               i++;
//           }
//           if (i==(m+1)){b=true;
//           
//           }
            // else {return false;}
         for(int i=0;i<m;i++){
           if(mat[i][0]>cap[i][0]){b=false;}
         }
       return b;}  
}
