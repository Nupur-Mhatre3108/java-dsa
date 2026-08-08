import java.util.Scanner;

public class LC189_RotateArray{
   public static void rotate(int[] nums, int k) {
    int size=nums.length;
    if(k>size){
      k=k%size;
    }
    reverseArray(nums, 0, size-(k+1));
    reverseArray(nums, size-k, size-1);
    reverseArray(nums, 0, size-1);
    }

    public static void reverseArray(int[] arr,int start,int end){
      while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
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
    System.out.print("Enter no of places by which u want to rotate the array :");
    int k=sc.nextInt();
    rotate(arr, k);
    for(int num:arr){
      System.out.print(num+" ");
    }
  }
}