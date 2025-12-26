class Solution {
    public int tribonacci(int n) {
        int first=0, second=1, third=1;
        if(n == 0) return first;
        if(n == 1) return second;
        if(n == 2) return third;
        int total = 0;
        for(int i=4; i<=n+1; i++) {
            total = first + second + third;
            first = second;
            second = third;
            third = total;
        } 
        return total;
    }
}