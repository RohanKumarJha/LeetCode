class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int tot = 0;
        int i=0, j=n-1;
        while(i < j) {
           tot = Math.max(tot,(Math.min(height[i],height[j])*(j-i)));
           if(height[i] < height[j]) {
            i++;
           }else {
            j--;
           }
        }  return tot;     
    }
}