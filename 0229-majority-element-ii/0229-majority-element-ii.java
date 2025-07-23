class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        if(size == 1) {
            list.add(nums[0]);
            return list;
        }

        Arrays.sort(nums);
        int count = 1;
        for(int i=1; i<size; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                if(count > size/3) {
                    list.add(nums[i-1]);
                }
                count = 1;
            }
        } 
        if(count > size/3) {
            list.add(nums[size-1]);
            count = 1;
        }
        return list;
    }
}