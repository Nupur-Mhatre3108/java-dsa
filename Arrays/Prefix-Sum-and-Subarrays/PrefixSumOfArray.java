import java.util.*;
public class PrefixSumOfArray{
  public static int[] prefixSum(int[] nums){
   
    for(int i=1;i<nums.length;i++){
      nums[i]=nums[i-1]+nums[i];
    }
    return nums;
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
    int[] pref= prefixSum(nums);
    System.out.println("Prefix Sum is: ");
    for(int val:pref){
      System.out.print(val+ " ");
    }
  }
}
 // int pref[]=new int[nums.length];
    // pref[0]=nums[0];
    //  for(int i=1;i<nums.length;i++){
    //    pref[i]=pref[i-1]+nums[i];
    // }
    // System.out.println("Prefix sum of array is: ");
    // for(int j=0;j<nums.length;j++){
    //   System.out.print(pref[j]+" ");
    // }
