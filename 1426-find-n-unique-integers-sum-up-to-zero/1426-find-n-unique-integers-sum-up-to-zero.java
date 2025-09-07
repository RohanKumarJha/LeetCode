class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int pos = 0;
        for(int i=1; i<=n/2; i++) {
            arr[pos++] = i;
            arr[pos++] = -i;
        }
        if(n % 2 != 0) arr[pos]=0;
        return arr;
    }
}