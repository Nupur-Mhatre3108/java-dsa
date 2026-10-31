import java.util.*;
public class LC33_SearchInRotatedSortedArray {
  public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] <= nums[high]) {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ans;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of your array: ");
    int size=sc.nextInt();
    
    int nums[]=new int[size];
    System.out.println("Enter elements of your array:");
    for(int i=0;i<nums.length;i++){
      nums[i]=sc.nextInt();
    }

    System.out.print("Enter element to be searched: ");
    int target=sc.nextInt();
    
    int index=search(nums, target);
    System.out.print("Element is found at index: "+index);
  }
}
