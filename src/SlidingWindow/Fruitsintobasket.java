package SlidingWindow;

import java.util.HashMap;

public class Fruitsintobasket {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstr(s, k));
    }

    public static int longestKSubstr(String s, int k) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int low = 0;
        int res = -1;

        for (int high = 0; high < s.length(); high++) {

            char c = s.charAt(high);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

            while (hashMap.size() > k) {

                char leftChar = s.charAt(low);
                hashMap.put(leftChar, hashMap.get(leftChar) - 1);

                if (hashMap.get(leftChar) == 0) {
                    hashMap.remove(leftChar);
                }

                low++;
            }

            if (hashMap.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }

        return res;
    }
}