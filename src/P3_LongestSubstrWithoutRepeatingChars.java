import java.util.HashSet;

public class P3_LongestSubstrWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> repeats = new HashSet<>();

        int longest = 0;
        int length = 0;
        for (char c : s.toCharArray()) {
            if (repeats.contains(c)) {
                if (length > longest)
                    longest = length;
                repeats.clear();
                length = 0;
            }
            repeats.add(c);
            length++;
        }

        return longest;
    }

}
