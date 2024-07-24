class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for(int i =1;i<arr.length;i++){
            arr[i] = arr[i-1]^arr[i];
        }
        int [] xor = new int [queries.length];

        for(int i =0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries [i][1];
            if(l>0){
                xor[i] = arr[r]^arr[l-1];
            }
            else{
                xor[i] = arr[r];
            }
        }
        return xor;
    }
}