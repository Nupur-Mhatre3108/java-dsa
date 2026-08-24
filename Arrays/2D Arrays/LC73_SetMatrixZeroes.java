import java.util.*;

public class LC73_SetMatrixZeroes{
   public static void setZeroes(int[][] matrix) {
      
      List<Integer> row=new ArrayList<>();
      List<Integer> column=new ArrayList<>();

      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
          if(matrix[i][j]==0){
            row.add(i);
            column.add(j); 
          }
        }
      } 

      for (int r : row) {
        for(int c=0;c<matrix[0].length;c++){
            matrix[r][c]=0;
        }
      } 

      for (int c : column) {
        for(int r=0;r<matrix.length;r++){
            matrix[r][c]=0;
        }
      } 
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter rows for matrix:");
    int r=sc.nextInt();
    System.out.print("Enter columns for matrix:");
    int c=sc.nextInt();
    
    System.out.println("Enter matrix :");
    int matrix[][]=new int[r][c];

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    setZeroes(matrix);
    System.out.println("Matrix after setting zeroes:");
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}