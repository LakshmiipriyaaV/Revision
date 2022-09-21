package rev;

import java.util.Scanner;

class Multiply2Matrix {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    //matrix-I
    int matrix1[][] = {{1, 2, 3},
                      {1, 1, 1}};
         
    //matrix-II          
    int matrix2[][] = {{1, 2},
                       {1, 3},
                       {1, 1}}; 
 
    
    int result[][] = new int[2][2];
 
    
    for(int i=0; i<result.length; i++){
      for(int j=0; j<result[0].length; j++){
        int sum=0;
        for(int k=0; k<matrix1[0].length; k++){
            sum += matrix1[i][k]*matrix2[k][j];
        }
        result[i][j] = sum;
      }
    }
 
    
    System.out.println("Resultant Matrix");
    for(int i=0; i<result.length; i++){
        for(int j=0; j<result[0].length; j++){
            System.out.print(result[i][j]+ " ");
        }
        System.out.println();
    }
    
  }
}