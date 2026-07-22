import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "aabcacddde";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            ans.append(entry.getKey());

            if (entry.getValue() > 1)
                ans.append(entry.getValue());
        }

        System.out.println(ans);
    }
}