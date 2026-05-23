class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int first_index=0, last_index=size-1;
        int max_water = 0;

        while(first_index < last_index) {
            max_water = Math.max(max_water,Math.min(height[first_index],height[last_index])*(last_index-first_index));
            if(height[last_index] > height[first_index]) first_index++;
            else last_index--;
        }
        return max_water;
    }
}