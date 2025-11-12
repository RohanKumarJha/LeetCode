class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int i : nums) {
            list.add(i);
        }
        int count=0, result=0;
        for(int i=0; i<nums.length; i++) {
            if(list.contains(nums[i])) {
                int val = nums[i];
                while(list.contains(val)) {
                    list.remove(val);
                    count++;
                    val++;
                }
                val = nums[i]-1;
                while(list.contains(val)) {
                    list.remove(val);
                    count++;
                    val--;
                }
            } 
            result = Math.max(result,count);
            count = 0;
        } return result;
    }
}