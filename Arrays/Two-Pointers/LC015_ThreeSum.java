import java.util.*;

public class LC015_ThreeSum {
  //  public static List<List<Integer>> threeSum(int[] nums) {
  //       List<List<Integer>> ans = new ArrayList<>();
  //       Arrays.sort(nums);
  //       for(int i=0;i<nums.length-1;i++){
  //         if(nums[i]==nums[i+1]){
  //           continue;
  //         }
  //           int target=0-nums[i];
  //           int j=i+1;
  //           int k=nums.length-1;
  //           while(j<k){
  //                if(nums[j]+nums[k]==target){
  //                   ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
  //                 j++;
  //                 k--; 
  //           }else if(nums[j]+nums[k]>target){
  //               k--;
  //           }else if(nums[j]+nums[k]<target){
  //               j++;
  //           }
  //           }
  //       }
         
  //       return ans;
  //   }
public static List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> ans = new ArrayList<>();
    Set<Integer> set=new HashSet<>();
    
    Set<List<Integer>> tripletstore=new HashSet<>();
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
         int num=-(nums[i]+nums[j]);
         if(set.contains(num)){
          List<Integer> triplet=new ArrayList<>();
           triplet.add(nums[i]);
           triplet.add(nums[j]);
           triplet.add(num);
           Collections.sort(triplet);
           tripletstore.add(triplet);
         }else{
           set.add(nums[j]);
         }
      }
      set.clear();
    }
    ans.addAll(tripletstore);
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
    List<List<Integer>> threeSumans=threeSum(arr);
    System.out.println(threeSumans);
  }
}

//  ans.add(triplets);
//             System.out.println(ans);