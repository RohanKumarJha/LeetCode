class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int start=0, end=len-1;
        int result=0, answer=0;
        while(start < end) {
            answer = Math.min(height[start],height[end])*(end-start);
            result = Math.max(answer,result);
            if(height[start] < height[end]) start++;
            else end--;
        } return result;
    }
}