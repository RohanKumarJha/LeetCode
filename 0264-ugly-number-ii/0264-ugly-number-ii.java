class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[1690];
        arr[0] = 1;
        int n2=0, n3=0, n5=0;
        int ugly = 0;
        for(int i=1; i<1690; i++) {
            arr[i] = Math.min(Math.min(arr[n2]*2, arr[n3]*3),arr[n5]*5);
            ugly = arr[i];

            if(arr[n2]*2==ugly) n2++;
            if(arr[n3]*3==ugly) n3++;
            if(arr[n5]*5==ugly) n5++;
        } return arr[n-1];
    }
}