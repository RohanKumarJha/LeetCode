class Solution {
    private Set<Integer> set = new HashSet<>();

    private boolean happy(int n) {
        if(n == 1) return true;
        if(set.contains(n)) return false;
        int sum = 0;
        set.add(n);
        while(n != 0) {
            sum += ((n%10)*(n%10));
            n /= 10;
        }
        return happy(sum);
    }
    
    public boolean isHappy(int n) {
        if(n < 0) return false;
        return happy(n);
    }
}