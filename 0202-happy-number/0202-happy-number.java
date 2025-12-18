class Solution {   
    private int square(int n) {
        int sum = 0;
        while(n != 0) {
            sum += ((n%10)*(n%10));
            n /= 10;
        } 
        return sum;
    } 

    public boolean isHappy(int n) {
        if(n < 0) return false;
        int slow = n;
        int fast = n;
        do {
            if(fast == 1) return true;
            slow = square(slow);
            fast = square(fast);
            if(fast == 1) return true;
            fast = square(fast);
        } while(slow != fast);
        return false;
    }
}