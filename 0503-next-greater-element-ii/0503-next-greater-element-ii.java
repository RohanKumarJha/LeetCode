class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int arr[] = new int[size];
        for(int i=0; i<nums.length; i++) {
            int count = (i+1)%size;
            boolean flag = false;
            while(count!=i) {
                if(nums[i] < nums[count]) {
                    arr[i] = nums[count];
                    flag = true;
                    break;
                }
                count++;
                count = count%size;
            }
            if(!flag) {
                arr[i] = -1;
            }
        } return arr;
    }
}