import java.util.Scanner;

public class LC238_ProductOfArrayExceptSelf {
   public static int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int answer[]=new int[size];
        int prefix[]=new int[size];
        int suffix[]=new int[size];
        int product=1;
        int product2=1;
        for(int i=0;i<size;i++){
            product*=nums[i];
            prefix[i]=product;
            System.out.println(prefix[i]);
        }
        for(int j=size-1;j>=0;j--){
            product2*=nums[j];
            suffix[j]=product2;
            System.out.println(suffix[j]);
        }
        for(int k=0;k<size;k++){
            if(k==0){
                answer[0]=suffix[1];
            }else if(k==size-1){
                answer[k]=prefix[k-1];
            }else{
                answer[k]=prefix[k-1]*suffix[k+1];
            }
        }
        return answer;
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
    int ans[]=productExceptSelf(arr);
    for( int answers:ans){
      System.out.print(answers+" ");
    }
  }
}
