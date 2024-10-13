class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    arr.add(i);
                    arr.add(j);
                    break;
                }
            }
        } 
        int[] arr1 = new int[2];
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        return arr1;
    }
}