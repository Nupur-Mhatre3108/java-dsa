import java.util.Scanner;

public class LC832_FlippingAnImage {
  public static int[][] flipAndInvertImage(int[][] image) {
      int r=image.length;
      int c=image[0].length;
      int imageFlip[][]=new int[r][c];

      for(int i=0;i<r;i++){
        int j=c-1;
        int k=0;
        while(j>=0){
          imageFlip[i][k]=image[i][j];
          j--;
          k++;
        }
      }
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          if(imageFlip[i][j]==0){
           imageFlip[i][j]=1;
          }else{
           imageFlip[i][j]=0;
          }
        }
      }
    return imageFlip;
  }
  public static void main(String[] args){
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
    System.out.println("Flipped Image of Matrix is:");
    int[][] flippedMatrix=flipAndInvertImage(matrix);
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(flippedMatrix[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
