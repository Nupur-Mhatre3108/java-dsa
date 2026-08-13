import java.util.Scanner;

public class LC867_TransposeMatrix{
     public static int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int transposeMatrix[][]=new int[columns][rows];

        for(int i=0;i<columns;i++){
           for(int j=0;j<rows;j++){
               transposeMatrix[i][j]=matrix[j][i];
           }
        }
        return transposeMatrix;
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
    int transposeMatrix[][]=transpose(matrix);
     for(int i=0;i<transposeMatrix.length;i++){    
      for(int j=0;j<transposeMatrix[i].length;j++){       
        System.out.print(transposeMatrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}