class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int[] result = new int[2];
        int pointer = 0;
        for(int i : nums) {
            if(arr[i] == 1) {
                result[pointer++] = i;
                if(pointer == 2) return result;
            } else {
                arr[i]++;
            }
        } return result;
    }
}