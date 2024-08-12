class Solution {
    public int findKthPositive(int[] arr, int k) {
        int val = k, num=0;
        for(int i=1; i<=arr[arr.length-1]; i++) {
            if(i != arr[num])  {
                val--;
                if(val == 0) return i;
            } else num++;
        } return arr[arr.length-1]+val;
    }
}