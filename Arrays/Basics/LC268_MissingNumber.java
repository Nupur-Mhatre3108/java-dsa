import java.util.Scanner;

public class LC268_MissingNumber {
  public static int missingNumber(int[] nums) {
        int i=0;
        int missingNumber=0;
        boolean flag=false;
        while(i<nums.length){
            int correctIndex=nums[i];
            if(i==correctIndex){
                i++;
            }else if(correctIndex>=nums.length){
                i++;
            }else{
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                missingNumber=j;
                flag=true;
                break;
            }
        }  
        if(missingNumber==0 && flag==false){
            missingNumber=nums.length;
        }
        return missingNumber;
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
    int missingNumber=missingNumber(arr);
    System.out.print("Missing number is:"+missingNumber);
  }
}
