class Solution {
    public int recursion(int num, int answer) {
        if (num == 0) return answer;

        if (num % 2 == 0) {
            return recursion(num / 2, answer + 1);
        } else {
            return recursion(num - 1, answer + 1);
        }
    }

    public int numberOfSteps(int num) {
        return recursion(num, 0);
    }
}
