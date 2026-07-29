import java.util.Scanner;

public class LC75_SortColors{
  public static void sortColors(int[] nums){
    int low=0;
    int mid=0;
    int high=nums.length-1;
    while(mid<=high){
      if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        low++;
        mid++;
      }else if(nums[mid]==2){
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
      }else{
        mid++;
      }
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
    sortColors(arr);
    for(int num:arr){
      System.out.print(num+ " ");
    }

  }
}