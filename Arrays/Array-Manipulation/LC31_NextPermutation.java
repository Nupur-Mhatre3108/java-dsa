import java.util.*;

public class LC31_NextPermutation {
 public static void nextPermutation(int[] nums) {
      int n=nums.length;
      int i;
      int index=0;
      for(i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            index=i;
            break;
        }
      }
      if(i==-1){
        reverse(nums,0,n-1);
        return;
      }
      for(int j=n-1;j>=index;j--){
        if(nums[j]>nums[index]){
            int temp=nums[j];
            nums[j]=nums[index];
            nums[index]=temp;
            break;
        }
      }  
      reverse(nums,index+1,n-1);
    }
   public static void reverse(int nums[],int start,int end){
      while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
      }
    }
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int size=sc.nextInt();
    System.out.print("Enter elements of the array: ");
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
    }
    nextPermutation(arr);
    System.out.println("Next Permutation is: ");
    for(int num:arr){
      System.out.print(num+" ");
    }
  }
}
