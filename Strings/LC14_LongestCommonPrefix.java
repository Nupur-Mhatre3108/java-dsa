import java.util.Scanner;

public class LC14_LongestCommonPrefix{
      public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String s1 = strs[0];
        String s2 = strs[1];
        String commonPref = "";
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonPref += s1.charAt(i);
                i++;
            } else {
                break;
            }
        }

        for (int j = 2; j < strs.length; j++) {
            String str = strs[j];
            int k = 0;
            if (str.length() == 0 || commonPref.length() == 0 || str.charAt(k) != commonPref.charAt(k)) {
                return "";
            }

            while (k < str.length() && k < commonPref.length()) {
                if (commonPref.charAt(k) == str.charAt(k)) {
                    k++;
                } else {
                    break;
                }
            }
            commonPref = commonPref.substring(0, k);
        }
        return commonPref;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of your array:");
    int size=sc.nextInt();
    sc.nextLine();

    String strs[]=new String[size];
    System.out.print("Enter your array: ");
    for(int i=0;i<strs.length;i++){
      strs[i]=sc.nextLine();
    }
    String ans=longestCommonPrefix(strs);
    System.out.print("Longest Common Prefix from given array of strings is: "+ans);
  }
}