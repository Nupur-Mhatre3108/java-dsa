import java.util.Scanner;

public class LC2149_RearrangeArrayElementsBySign {
  public static int[] rearrangeArray(int[] nums) {
    int newArr[]=new int[nums.length];
    int evenPosition=0;
    int oddPosition=1;
    for(int i=0;i<nums.length;i++){
       if(nums[i]>0){
        newArr[evenPosition]=nums[i];
        evenPosition=evenPosition+2;
       }else{
        newArr[oddPosition]=nums[i];
        oddPosition=oddPosition+2;
       }
    }
    return newArr;
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
    int ansArray[]=rearrangeArray(arr);
    System.out.println("Rearranged Array is: ");
    for(int num:ansArray){
      System.out.print(num+" ");
    }
  }
}
