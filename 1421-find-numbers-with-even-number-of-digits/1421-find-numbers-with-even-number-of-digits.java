class Solution {
    public int isEven(int num) {
        int totalDigits = 0;
        while(num > 0) {
            totalDigits += 1;
            num /= 10;
        } return (totalDigits%2==0) ? 1 : 0;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            count += isEven(i);
        } return count;
    }
}