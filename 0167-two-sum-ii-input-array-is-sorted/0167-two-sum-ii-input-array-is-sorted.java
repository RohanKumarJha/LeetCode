class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int[] arr = new int[2];
        int start=0, end=size-1;
        while(start < end) {
            if(numbers[start]+numbers[end] == target) {
                arr[0] = start+1;
                arr[1] = end+1;
                break;
            } else if(numbers[start]+numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        } return arr;
    }
}