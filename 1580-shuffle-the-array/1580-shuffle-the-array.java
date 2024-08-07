class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] newArr = new int[len];
        int val1 = 0;
        int val2 = 0;
        for(int i=0; i<len; i++) {
            if(i%2==0) {
                newArr[i] = nums[val1];
                val1++;
            } else {
                newArr[i] = nums[val2+n];
                val2++;
            }
        } return newArr;
    }
}