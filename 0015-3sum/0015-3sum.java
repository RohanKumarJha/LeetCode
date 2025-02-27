class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<len-2; i++) {
            int secondIndex=i+1, lastIndex=len-1;
            while(secondIndex < lastIndex) {
                if(nums[i]+nums[secondIndex]+nums[lastIndex] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[secondIndex]);
                    list.add(nums[lastIndex]);
                    result.add(list);
                    secondIndex++; lastIndex--;
                } else if(nums[i]+nums[secondIndex]+nums[lastIndex] < 0) {
                    secondIndex++;
                } else {
                    lastIndex--;
                }
            }  
        } return new ArrayList<>(result);
    }
}