import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC1431_KidsWithTheGreatestNumberOfCandies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> result=new ArrayList<>();
      for(int i=0;i<candies.length;i++){
        int currentCandies=candies[i];
        currentCandies+=extraCandies;
        boolean flag=true;
        for(int j=0;j<candies.length;j++){
         
         if(j==i){
          continue;
         }else{
           if(currentCandies<candies[j]){
            flag=false;
            break;
           }
         }
        } 
        if(flag==false){
          result.add(false);
        }else{
          result.add(true);
        }
      }
     return result;
    }
    
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LC1431_KidsWithTheGreatestNumberOfCandies obj = new LC1431_KidsWithTheGreatestNumberOfCandies();
    System.out.print("Enter length of an array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter elements of array: ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter extra candies: ");
    int extraCandies=sc.nextInt();
    List<Boolean> answer = obj.kidsWithCandies(arr, extraCandies);
    System.out.println("The answer is: ");
    for(int i=0;i<answer.size();i++){
      System.out.print(answer.get(i) + " ");
    }
   }   
}
