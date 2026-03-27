class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}