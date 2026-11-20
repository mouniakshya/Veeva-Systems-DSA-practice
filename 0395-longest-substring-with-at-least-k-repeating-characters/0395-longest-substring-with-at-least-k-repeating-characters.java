class Solution {
    public int longestSubstring(String s, int k) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);

                boolean valid = true;
                for (int count : map.values()) {
                    if (count < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}