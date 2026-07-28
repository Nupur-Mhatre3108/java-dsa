import java.util.Arrays;
import java.util.Scanner;
public class LC001_TwoSum {
  public  static int[] twosumTarget(int arr[],int target){
    int targetsum[]=Arrays.copyOf(arr, arr.length);
    Arrays.sort(targetsum);
    int left=0;
    int right=targetsum.length-1;
    int num1=0;
    int num2=0;
    int indices[]=new int[2];
    while(left<right){
    if(targetsum[left]+targetsum[right]==target){
     num1=targetsum[left];
     num2=targetsum[right];
     break;
    }else if(targetsum[left]+targetsum[right]>target){
      right--;
    }else if(targetsum[left]+targetsum[right]<target){
      left++;
    }
    }
  for(int j=0;j<arr.length;j++){
      if(arr[j]==num1){
        indices[0]=j;
      }else if(arr[j]==num2){
        indices[1]=j;
      }
    }
    return indices;
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
    System.out.print("Enter target:");
    int target=sc.nextInt();
    int indexarr[]=twosumTarget(arr, target);
      System.out.print("The index which gives two sum is: " );
    for(int i=0;i<indexarr.length;i++){
    System.out.print(indexarr[i]+ " ");
    }
    
  }
}
