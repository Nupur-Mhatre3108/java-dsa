import java.util.Scanner;

public class LC026_RemoveDuplicatesFromSortedArray {
  public static int removeDuplicatesFromSortedArray(int nums[]){
    int i=0;
    int j=i+1;
    while(j<nums.length){
      if(nums[i]==nums[j]){
        j++;
      }else{
        i++;
        nums[i]=nums[j];
      }
    }
    return i+1;
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
    int uniqueele=removeDuplicatesFromSortedArray(arr);
    System.out.println("No.of unique elements: "+ uniqueele);
  }
}
