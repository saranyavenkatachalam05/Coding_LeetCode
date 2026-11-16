
import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if (s1.length() > s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq1[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            freq2[ch - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        for (int i = 0; i < s2.length() - k; i++) {
            freq2[s2.charAt(i) - 'a']--;
            freq2[s2.charAt(k + i) - 'a']++;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}
