class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length-2; i++) {
            List<Integer> answer = new ArrayList<>();
            int left=i+1, right=nums.length-1;
            boolean flag = false;
            while(left < right) {
                answer = new ArrayList<>();
                if(nums[i]+nums[left]+nums[right] == 0) {
                    answer.add(nums[i]);
                    answer.add(nums[left]);
                    answer.add(nums[right]);
                    result.add(answer);
                    left++;
                    right--;
                    flag = true;
                } else if(nums[i]+nums[left]+nums[right] < 0) left+=1;
                else right-=1;
            } 
        } return new ArrayList<>(result);
    }
}