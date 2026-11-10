class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int o=s2.length();
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        if(n>o)
        return false;
        for(int i=0;i<=o-n;i++){
            String s=s2.substring(i,i+n);
            char[] arr2=s.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr,arr2))
            return true;
        }
        return false;
    }
}