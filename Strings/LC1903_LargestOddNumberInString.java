import java.util.Scanner;

public class LC1903_LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        String ans = "";
        int index = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "";
        }

        ans = num.substring(0, index + 1);
        return ans;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string: ");
    String s=sc.nextLine();

    String ans=largestOddNumber(s);
    System.out.println("Largest odd number in given string is: "+ans);
  }
}
