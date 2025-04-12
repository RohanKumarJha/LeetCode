class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1;
        int maxWater=0, water=0;
        while(start < end) {
            water = Math.min(height[start],height[end])*(end-start);
            maxWater = Math.max(maxWater,water);
            water = 0;
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        } return maxWater;
    }
}