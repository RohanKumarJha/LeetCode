class Solution {
    public int findLucky(int[] nums) {
        Arrays.sort(nums);
          int count =1;
        for(int i = nums.length-1; i>0; i--){
          if(nums[i] == nums[i-1]){
            count++;
          }else {
            if(nums[i] == count){
                return count;
            } else {
                count = 1;
            }
          }
        } 
        return (nums[0] == count)? count:-1;
    }
}