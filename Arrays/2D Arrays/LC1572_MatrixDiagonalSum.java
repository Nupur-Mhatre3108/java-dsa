import java.util.*;
public class LC1572_MatrixDiagonalSum {
  public static int diagonalSum(int[][] mat) {
    int diagSum=0;
    int a=0;
    int b=0;

    while(a<mat.length){
      diagSum+=mat[a][b];
      a++;
      b++;
    }
    int i=0;
    int j=mat[i].length-1;
    while(i<mat.length){
      if(i==j){
        i++;
        j--;
        continue;
      }

      diagSum+=mat[i][j];
      i++;
      j--;
    }
    return diagSum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);   
    System.out.print("Enter no of rows in a 2D array:"); 
    int rows=sc.nextInt();   
    System.out.print("Enter no of columns in a 2D array:");    
    int columns=sc.nextInt();    
    int matrix[][]=new int[rows][columns];  
    System.out.println("Enter elements of 2D array: ");  
                   
    for(int i=0;i<matrix.length;i++){    
      for(int j=0;j<matrix[i].length;j++){       
        matrix[i][j]=sc.nextInt();   
      }
    }
    int diagonalSum=diagonalSum(matrix);
    System.out.print("Diagonal sum is: "+diagonalSum);
  }
}
