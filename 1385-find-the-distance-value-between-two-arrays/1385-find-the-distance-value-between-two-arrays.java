class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int n2=arr2.length;
        int a=0;
        for(int i=0;i<n1;i++){
            int x=0;
            for(int j=0;j<n2;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d)
                x=1;
            }
            if(x==0)
            a++;
        }
        return a;
    }
}