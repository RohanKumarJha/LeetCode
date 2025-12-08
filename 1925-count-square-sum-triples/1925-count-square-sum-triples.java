class Solution {
    public int countTriples(int n) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j!=i) {
                    for(int k=1; k<=n; k++) {
                        if(i!=j && i!=k) {
                            long left = i*i+j*j;
                            long right = k*k;
                            if(left == right) result++;
                        }
                    }
                }
            }
        } 
        return result;
    }
}