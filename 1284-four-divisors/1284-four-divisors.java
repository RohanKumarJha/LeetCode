class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += findDivisor(nums[i]);
        }
        return sum;
    }

    public int findDivisor(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) { 
                    sum += i;
                    count++;
                } else { 
                    sum += i + n / i;
                    count += 2;
                }
            }
            if (count > 4) { 
                return 0;
            }
        }
        return count == 4 ? sum : 0;
    }
}