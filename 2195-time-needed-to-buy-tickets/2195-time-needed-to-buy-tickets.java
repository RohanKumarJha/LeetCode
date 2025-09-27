class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int size = tickets.length;
        if(k > size) return 0;
        int count = 0;
        while(tickets[k] != 0) {
            for(int i=0; i<size; i++) {
                if(tickets[i] != 0) {
                    count++;
                    tickets[i]--;
                }
                if(tickets[k] == 0) return count;
            }
        } return count;
    }
}