import java.util.Scanner;

public class LC977_SquaresOfASortedArray {
  public static int[] sortedSquares(int nums[]){
    for(int i=0;i<nums.length;i++){
      nums[i]*=nums[i];
    }
    int sortedarr[]=new int[nums.length];
    int len=sortedarr.length-1;
    int start=0;
    int end=nums.length-1;
    while(start<end){
      if(nums[start]>nums[end]){
        sortedarr[len]=nums[start];
        len--;
        start++;
      }else{
        sortedarr[len]=nums[end];
        len--;
        end--;
      }
    }
    sortedarr[len]=nums[end];
    return sortedarr;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter length of an array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter elements of array: ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    int sortedarr[]=sortedSquares(arr);
    System.out.println("Squares of Array in sorted order is: ");
    for(int i=0;i<sortedarr.length;i++){
      System.out.println(sortedarr[i]+ " ");
    }
  }
}
