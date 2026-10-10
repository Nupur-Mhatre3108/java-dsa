import java.util.*;
public class LC387_FirstUniqueCharacterInAString {
  public static int firstUniqChar(String s) {
      HashMap<Character,Integer>  freq=new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(freq.containsKey(s.charAt(i))){
            freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
        }else{
            freq.put(s.charAt(i),1);
        }
      }
      for(int j=0;j<s.length();j++){
        if(freq.get(s.charAt(j))==1){
            return j;
        }
      }
      return -1;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string: ");
    String s=sc.nextLine();
    
    int index=firstUniqChar(s);
    System.out.print("Index of first unique character: "+index);

  }
}
