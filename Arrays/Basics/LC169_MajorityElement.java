import java.util.Scanner;

public class LC169_MajorityElement {
   public static int majorityElement(int[] nums){
     int candidate=nums[0];
     int count=1;
     for(int i=1;i<nums.length;i++){
      if(count==0){
        candidate=nums[i];
      }
      if(candidate==nums[i]){
        count++;
      }else{
        count--;
      }
     }
     return candidate;
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
    int majorityElement=majorityElement(arr);
    System.out.print("Majority element is: "+majorityElement);
  }
}
