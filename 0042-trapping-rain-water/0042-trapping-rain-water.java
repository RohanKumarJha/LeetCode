class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        for(int i=0; i<height.length; i++) {
            if(i == 0) {
                prefix[i] = height[i];
            } else {
                prefix[i] = Math.max(prefix[i-1], height[i]);
            }
        }
        for(int i=height.length-1; i>=0; i--) {
            if(i == height.length-1) {
                suffix[i] = height[i];
            } else {
                suffix[i] = Math.max(suffix[i+1], height[i]);
            }
        }

        int totalWater = 0;
        for(int i=0; i<height.length; i++) {
            totalWater += (Math.min(prefix[i], suffix[i]) - height[i]);
        } return totalWater;
    }
}