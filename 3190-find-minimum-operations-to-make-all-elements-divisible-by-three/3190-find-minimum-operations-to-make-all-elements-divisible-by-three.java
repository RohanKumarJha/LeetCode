class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for(int i : nums) {
            if(i%3==1 || i%3==2) {
                result += 1;
            }
        } return result;
    }
}