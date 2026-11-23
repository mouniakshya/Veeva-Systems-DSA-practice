class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')
            c++;
        }
        String st=s.substring(c,n);
        if(!st.contains("a"))
        return true;
        else
        return false;

    }
}