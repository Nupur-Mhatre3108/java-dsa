import java.util.Scanner;

public class LC48_RotateImage {
   public static void rotate(int[][] matrix){
      int r=matrix.length;
      int c=matrix[0].length;
      int top=0;
      int left=0;

      while(top<r && left<c){
       for(int i=left;i<c;i++){
        int temp=matrix[top][i];
        matrix[top][i]=matrix[i][left];
        matrix[i][left]=temp;
       }
        top++;
        left++;
      }

     top=0;
     while(top<r){
      left=0;
      int right=c-1;
      while(left<right){
        int temp=matrix[top][left];
        matrix[top][left]=matrix[top][right];
        matrix[top][right]=temp;
        left++;
        right--;
      }
      top++;
     }
     
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
    rotate(matrix);
    System.out.println("Rotated Matrix:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
  }
}
