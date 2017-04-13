
package m2iicart2;

import static java.lang.Math.round;
import java.util.Scanner;


public class Matrix {

  /** crée et renvoie la matrice somme des deux matrices 'mat1' et 'mat2'.
   *  si les dimensions ne sont pas les mêmes, renvoie une matrice vide. */
//  public static int[][] somme(int[][] mat1, int[][] mat2) {
//    int n = mat1.length;
//    int m = (n>0) ? mat1[0].length : 0;
//    int n2 = mat2.length;
//    int m2 = (n2>0) ? mat2[0].length : 0;
//    if(n != n2 || m != m2) {n=0;m=0;};
//    int[][] mat = new int[n][m];
//    for (int i=0; i<n;i++)
//      for (int j=0; j<m;j++)
//        mat[i][j] = mat1[i][j] + mat2[i][j];
//    return mat;
//    }
    
      /*  si les dimensions ne sont pas correctes, renvoie une matrice vide. */
//  public static int[][] produitM(int[][] mat1, int[][] mat2) {
//    int n = mat1.length;
//    int m = mat1[0].length;
//    int n2 = mat2.length;
//    int p =  mat2[0].length;
//    if(m != n2) {n=0;p=0;};
//    int[][] mat = new int[n][p];
//    for (int i=0; i<n;i++)
//      for (int j=0; j<p;j++) {
//        mat[i][j] = 0;
//         for (int k=0;k<m;k++) mat[i][j] += mat1[i][k] * mat2[k][j];
//         }
//    return mat;
//    }
 public static int[][] product2(int [][] mat1,int [][] mat2 ) {
        if (mat1[0].length != mat2.length) throw new RuntimeException("Illegal matrix dimensions.");
        int [][] C = new int [mat1.length][mat2[0].length];
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C[0].length; j++)
                for (int k = 0; k < mat1[0].length; k++)
                    C[i][j] += (mat1[i][k] * mat2[k][j]);
         
        return C;
    }

  /** crée et renvoie une matrice de dimensions 'n' et 'm' remplie aléatoirement
   *  par des chiffres 0 ou 1 
   */
 public static int[][] creerMatAlea1(int n, int m) {
    int[][] mat = new int[n][m];
    double aux= 0.0;
    for (int i =0;i<n;i++){
      
        //aux=Math.round(Math.random()*(n-1));
         //System.out.println("c'est la colonne "+j+" et le 1 est au niveau du ligne "+(int)aux);
       
      for (int j=0;j<m;j++){
          aux=Math.round(Math.random()*(n-1));
          if((int)aux%2==0){
          mat[i][j] = 0;
          }
         else mat[i][j] = 1;
      }aux=0.0;
    }
    return mat;
       }
  /** crée et renvoie une matrice de dimensions 'n' et 'm' remplie aléatoirement
   *  par des chiffres 0 ou 1 en respectant qu'une colonne contient seulement un seul 1 
   */
    public static int[][] creerMatAlea2(int m, int n) {
    int[][] mat = new int[m][n];
    int aux= 0;
    for (int i=0;i<m;i++){
      
        aux=(int)Math.round(Math.random()*(n-1));
         //System.out.println("c'est la colonne "+j+" et le 1 est au niveau du ligne "+(int)aux);
       mat[i][aux]=1;
//      for (int j=0;j<n;j++){
//          if(j==(int)aux%2){
//          mat[i][j] = 1;
//          }
//         else mat[i][j] = 0;
//      }
        
       
    }
//     
  if(Eq10.verifyEqTen2(mat)==true){ 
    return  mat;}
    else {
     return null;
    }
    }
//   return  mat; }
     
    
//      public static boolean verifyEqTen (int [][] mat){
//          
//        int[][] matSizeDS=new int[][];
//        
//        int[][] matCapDC=new int[][];
//          
//        int[][] product = product2(transposeMatrix(mat),remplMatSizeDS(matSizeDS,1024));
//        if(verifyMaxCapacity(product,remplMatSizeDS(matCapDC,10000))){
//                return true;
//        }
//     else
//          
//     return false;      
//      }
    
    
    public static int [][] remplMatSizeDS(int [][] matSizeDS, int size){
      int m= matSizeDS.length;
     // int n=matSizeDS[0].length;
      
      
      for (int i=0;i<m;i++){
         matSizeDS[i][0]= size;
      }
      
     return matSizeDS;
    }
    // comparer entre les deux vecteurs
    public static boolean verifyMaxCapacity (int[][] mat, int [][] cap){
         int m=mat.length;
         boolean b= true;
//         int n= mat2[0].length;
         for(int i=0;i<m;i++){
           if(mat[i][0]>cap[i][0]){b=false;}
         }
      return b;}
    
    public static int [][] creerMatAlea3(int m, int n) {
    int[][] mat = new int[m][n];
    double aux= 0.0;
    for (int i=0;i<m;i++){
      
       for (int j=0;j<n;j++){
           aux= (round(Math.random())*1)+1;
          mat[i][j] = (int) aux;
     
      }}
    return mat;
         
       }
     public static float [][] creerMatAlea4(int m, int n) {
    float[][] mat = new float[m][n];
    double aux= 0.0;
    for (int i=0;i<m;i++){
      
       for (int j=0;j<n;j++){
           aux= ((Math.random())*1)+1;
          mat[i][j] = (float) aux;
     
      }}
    return mat;
         
       }
    
    //matrice null
    
    
  /** renvoie une chaine représentant la matrice 'mat' */
  public static String toString(int[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }
//  public static int [][] SumRow (int [][]mat){
//     for(int j=0;j<mat[0].length;j++){
//     }
//      
//      return null;
//  
//  }
/*Tronspose ************************/
  public  static int[][] transposeMatrix(int [][]mat1)
  {   
       //lignes
      int m=mat1.length;
       //colomns
      int n=mat1[0].length;
//      System.out.println("ncolones"+n);
    
      int [][] Tmat1 = new int[n][m];
      
      for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            
                Tmat1[i][j] = mat1[j][i];
               
               
              
            }
        }
      
     
     return Tmat1;
  
  }
  
    public static int [][] uzik(int [][]mat){
    
      int m=mat.length;
      int n= mat[0].length;
      for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]!=0)
                    mat[i][j]=1;
                else mat[i][j]=0;
    
  }

}
     return mat;
  }
  
   public  static int  SumRow (int [][]mat,int ind){
   
 int aux=0;       
//lignes
      int m=mat.length;
      //colomns
      int n=mat[0].length;
    //for(int j=0;j<n;j++){
      for(int i=0;i<n;i++){
            aux=aux+mat[ind][i];
         
    }
     return aux;
  } 
   
   
     public  static int[][]  SumRow2 (int [][]mat){
//      int m= mat.length;
   int [][]col=new int[mat.length][1];    
//    for(int i=0;i<m;i++){
//         col[i][0]=SumRow(mat, i);
//                 }
       
////lignes
      int m=mat.length;
      //colomns
      int n=mat[0].length;
    for(int i=0;i<m;i++){
        int aux=0; 
      for(int j=0;j<n;j++){
            aux=aux+mat[i][j];
            col[i][0]=aux-1;
               
    }
    }
     return col;
  }
   
   
  ////equation 13
  public  static int  SumColumn (int [][]mat,int ind){
 int aux=0;       
//lignes
      int m=mat.length;
      //colomns
      int n=mat[0].length;
    //for(int j=0;j<n;j++){
      for(int i=0;i<m;i++){
            aux=aux+mat[i][ind];
     // }
    if (aux != 0)
        return 1;
    else return 0;
    }
     return 0;
  } 
  
 //Uzik

 

     
    /** programme de test d somme et produit de matrices aléatoires dont les
     *  dimensions sont lues au clavier
     */
   public static String toString2(double[][] mat) {
    String s = "";
    for (int i=0;i<mat.length;i++) {
      for (int j=0;j<mat[0].length;j++) s += "  "+mat[i][j];
      s += "\n";
      }
    return s;
    }
  //////////////////////
   
   
   
  /*Main****************************************************************************************/
//    public static void main(String[] args) {
//  Scanner in = new Scanner(System.in);    
//    System.out.println("nombre de lignes : ");    
//  int n = in.nextInt(); 
//    System.out.println("nombre de colonnes : "); 
//   int m =in.nextInt();
////     
//   double[][] mat1 = creerMatAlea3(n,m);
//    // int[][] mat2 = creerMatAlea1(n,m);
////      
////    System.out.println("\nmat1=\n"+toString(mat1)+"\nmat2=\n"+toString(mat2));
//////   System.out.println("mat1*mat2=\n"+toString(product2(mat1,mat2)));
////      }
  //System.out.println("\nmat1=\n"+toString2(mat1));
//    
//   int[][] mat2=transposeMatrix(mat1);
//  
//   System.out.println("Tmat1\n"+toString(mat2));
//}
//}
//}

   
}