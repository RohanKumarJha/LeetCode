class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0, costSum=0;
        for(int i=0; i<gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(gasSum < costSum) return -1;
        int rem=0, result=0;
        for(int i=0; i<gas.length; i++) {
            rem += (gas[i]-cost[i]);
            if(rem < 0) {
                rem = 0;
                result = i+1;
            }
        } return result;
    }
}