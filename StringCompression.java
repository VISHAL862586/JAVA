public class StringCompression {
    public static void main(String[] args) {

        String str = "aabcacddde";
        StringBuilder ans = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            ans.append(str.charAt(i));

            if (count > 1)
                ans.append(count);

            count = 1;
        }

        System.out.println(ans);
    }
}
