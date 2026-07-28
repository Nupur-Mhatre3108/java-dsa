import java.util.*;
public class KadaneAlgorithm {

  public static int  maxSubArraysSum(int[] nums){
  int sum=0;
  int maxsum = Integer.MIN_VALUE;
  for(int i=0;i<nums.length;i++){
    for(int j=i;j<nums.length;j++){
      sum+=nums[j];
      if(sum>maxsum){
        maxsum=sum;      
      }
    }
    sum=0;
  }
  return maxsum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of your array: ");
    int size=sc.nextInt();
    
    int nums[]=new int[size];
    System.out.println("Enter elements of your array:");
    for(int i=0;i<nums.length;i++){
      nums[i]=sc.nextInt();
    }
     int maxsum= maxSubArraysSum(nums);
     System.out.print("Maximum Subarray sum is: "+ maxsum);
  }
}
  