import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC54_SpiralMatrix {
  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> elements=new ArrayList<>();
    int r=matrix.length;
    int c=matrix[0].length;
    int top=0;
    int left=0;
    int right=c-1;
    int bottom=r-1;

    while(top<=bottom && left<=right){
     for(int k=left;k<=right;k++){
      elements.add(matrix[top][k]);
     } 
      top++;

     for(int k=top;k<=bottom;k++){
      elements.add(matrix[k][right]);
     } 
     right--;
     
     if(top<=bottom){
        for(int k=right;k>=left;k--){
          elements.add(matrix[bottom][k]);
        }
        bottom--;
      }
 
      if(left<=right){
        for(int k=bottom;k>=top;k--){
          elements.add(matrix[k][left]);
        }
          left++;
      }
    }
    return elements;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter rows for matrix 1:");
    int r=sc.nextInt();
    System.out.print("Enter columns for matrix 1:");
    int c=sc.nextInt();
    
    System.out.println("Enter matrix 1:");
    int matrix[][]=new int[r][c];

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    List<Integer> spiralOrder=spiralOrder(matrix);
    System.out.println("Spiral Traversal Of Matrix:");
    System.out.println(spiralOrder);

  }
}
