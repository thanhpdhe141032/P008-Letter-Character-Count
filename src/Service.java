import java.util.HashMap;
import java.util.Map;

public class Service {
    private final String content;

    public Service(String content) {
        this.content = content;
    }

    public Map<Character, Integer> characterCounter() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : content.toCharArray()) {
            if (Character.isSpaceChar(c)) continue;
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        return charCount;
    }

    public Map<String, Integer> letterCounter() {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : content.trim().split(" ")) {
            if (wordCount.containsKey(s)) {
                wordCount.put(s, wordCount.get(s) + 1);
            } else {
                wordCount.put(s, 1);
            }
        }
        return wordCount;
    }
}
