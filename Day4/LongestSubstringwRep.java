package Day4;

import java.util.ArrayList;

public class LongestSubstringwRep {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        ArrayList<Character> arr = new ArrayList<>();

        while (i < s.length()) {
            char currentChar = s.charAt(i);

            if (arr.contains(currentChar)) {
                arr.remove(0);
            } else {
                arr.add(currentChar);
                i++;
                max = Math.max(max, arr.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
