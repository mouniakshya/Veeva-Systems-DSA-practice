class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store character order in HashMap
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {

            String w1 = words[i];
            String w2 = words[i + 1];

            int j = 0;

            while (j < w1.length() && j < w2.length()) {

                if (w1.charAt(j) != w2.charAt(j)) {

                    if (map.get(w1.charAt(j)) > map.get(w2.charAt(j))) {
                        return false;
                    }

                    break;
                }

                j++;
            }

            // Longer word should not come first
            if (j == w2.length() && w1.length() > w2.length()) {
                return false;
            }
        }

        return true;
    }
}