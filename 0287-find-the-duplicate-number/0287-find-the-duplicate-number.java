class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) {
            if(hs.contains(i)) return i;
            else hs.add(i);
        } return 0;
    }
}