public class CountPalindroms {
    public static int TotalPalindroms(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            count+=expands(str, i, i);

            count+=expands(str, i, i+1);
        }
        return count;
    }

    public static int expands(String str, int left, int right){
        int count =0;
        if(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            count++;
            right++;
            left--;
        }
        return count;
    }
    public static void main(String args[]){
        String str="abbc";
        int count = TotalPalindroms(str);
        System.out.println("Total Palindromic Strings: "+count);
    }
    
}
