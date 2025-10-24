class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int start=0, end=height.length-1;
        while(start < end) {
            result = Math.max(Math.min(height[end],height[start])*(end-start),result);
            if(height[start] < height[end]) start++;
            else end--;
        } return result;
    }
}