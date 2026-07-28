import java.util.Scanner;

public class LC167_TwoSumII{
  public static  int[] twosumTarget(int numbers[],int target){
    int i,j;
        int ans[]=new int[2];
        i=0;
        j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                ans[0]=i;
                ans[1]=j;
                break;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }
        }
        return ans;
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
    for(int index:indexarr){
      System.out.println(index+" ");
    }
  }
}
