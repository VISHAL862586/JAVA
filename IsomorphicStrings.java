import java.util.HashMap;

public class IsomorphicStrings {
    public static int isIsomorphic(String str1, String str2){
        if(str1.length()!=str2.length()){
            return 0;
        }
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 =  str2.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1)!=c2){
                    return 0;
                }
            }
            else{
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2)){
                if(map2.get(c2)!=c1){
                    return 0;
                }
            }
            else{
                map2.put(c2,c1);
            }
        }



        return 1;
    }
    public static void main(String args[]){
        String str1 = "abcd";
        String str2 = "abab";
        int result=isIsomorphic(str1, str2);
        if(result==1){
            System.out.println("Isomorphic");
        }
        else{
            System.out.println("Not Isomorphic");
        }
    }
}
