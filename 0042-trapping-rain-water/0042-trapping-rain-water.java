class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        for(int i=0; i<left.length; i++) {
            if(i == 0) left[i]=Math.max(0, height[i]);
            else left[i] = Math.max(left[i-1],height[i]);
        }
        for(int i=right.length-1; i>=0; i--) {
            if(i == right.length-1) right[i]=Math.max(0,height[i]);
            else right[i] = Math.max(right[i+1],height[i]);
        }

        int result = 0;
        for(int i=0; i<height.length; i++) {
            result += (Math.min(left[i],right[i])-height[i]);
        } return result;
    }
}