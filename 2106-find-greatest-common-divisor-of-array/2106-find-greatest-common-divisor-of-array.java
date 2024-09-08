import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
       for(int i=0; i<nums.length; i++) {
        minValue = Math.min(minValue, nums[i]);
        maxValue = Math.max(maxValue, nums[i]);
       } 
       for(int i=minValue; i>1; i--) {
        if((minValue%i==0) & (maxValue%i==0)) return i;
       } return 1;
    } 
}