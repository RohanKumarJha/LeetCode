class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int start=0, end=len-1;
        int result=0;
        while(start < end) {
            result = Math.max(Math.min(height[start],height[end])*(end-start),result);
            if(height[start] < height[end]) start++;
            else end--;
        } return result;
    }
}