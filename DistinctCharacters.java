import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main (String[] args) {
        String input = "Java";
        Map<Character, Integer> charCount = getCharCount(input);
        
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
    
    public static Map<Character, Integer> getCharCount(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for(char ch : input.toCharArray()) {
            if(charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            }
            else {
                charCount.put(ch, 1);
            }
        }
        return charCount;
    }
}
