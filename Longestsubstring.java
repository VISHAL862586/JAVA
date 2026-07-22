import java.util.HashSet;

public class Longestsubstring {
    public static void main(String args[]){
        String str = "aabcdbcdef";
        String ans = " ";
        int maxLen = 0;

        HashSet <Character> set = new HashSet<>();
        int left=0;
        for(int right=0; right<str.length(); right++){
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
                set.add(str.charAt(right));
      
            if(right-left+1 > maxLen){
                maxLen = right-left+1;
                ans = str.substring(left, right+1);
            }
            
        }
        System.out.println(ans);
        System.out.println("Max Length :"+maxLen);
    }
}
