import java.util.*;
public class  PrintAllSubarrays{

  public static void printAllSubArrays(int[] nums){
  for(int i=0;i<nums.length;i++){
    for(int j=i;j<nums.length;j++){
      for(int k=i;k<=j;k++){
        System.out.print(nums[k]+ " ");
      }
       System.out.println("");
    }
  }
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
    printAllSubArrays(nums);
  }
}
