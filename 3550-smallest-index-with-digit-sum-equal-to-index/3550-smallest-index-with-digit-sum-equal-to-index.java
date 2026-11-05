import java.util.*;
class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n!=0){
                sum=sum+n%10;
                n=n/10;
            }
            if(min>sum &&sum==i)
           { min=sum;
               x=1;
           }
        }
        if(x==0)
        return -1;

        return min;
        
    }
}