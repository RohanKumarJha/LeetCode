class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles >= numExchange) {
            int answer = numBottles/numExchange;
            int rem = numBottles%numExchange;
            result += answer;
            numBottles = answer+rem;
        } return result;
    }
}