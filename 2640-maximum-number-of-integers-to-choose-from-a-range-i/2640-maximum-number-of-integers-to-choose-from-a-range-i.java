class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for(int ban : banned) {
            set.add(ban);
        }
        int sum = 0;
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(set.contains(i)) continue;
            else {
                sum += i;
                if(sum <= maxSum) cnt++;
                else break;
            }
        } return cnt;
    }
}