class Solution {
    public int maxArea(int[] height) {
        int SIZE = height.length;
        int MAX_WATER = 0;
        int START=0, END=SIZE-1;
        while(START < END) {
            MAX_WATER = Math.max(MAX_WATER, Math.min(height[END],height[START])*(END-START));
            if(height[START] < height[END]) {
                START++;
            } else {
                END--;
            }
        } return MAX_WATER;
    }
}