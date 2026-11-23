class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            int n = s.length(); // Update n inside the while loop
            String next = "";   // Use a regular String to build the next round
            
            for (int i = 0; i < n; i = i + k) {
                // Use Math.min so the last chunk doesn't go out of bounds
                String st = s.substring(i, Math.min(i + k, n));
                
                // Calculate the sum of digits in st
                int sum = 0;
                for (int j = 0; j < st.length(); j++) {
                    sum += st.charAt(j) - '0';
                }
                
                // Concatenate the sum to our String
                next += sum; 
            }
            
            s = next; // Update s for the next while loop check
        }
        
        return s;
    }
}
