class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            int count = 0;
            int j = i;
            while(j>0) {
                if(j%10==0) {
                    count++;
                }
                else if((i%(j%10))!=0 || (j%10==0)) { 
                    count++;
                    break;
                }
                j /= 10;
            } if(count == 0) ans.add(i);
        } return ans;
    }
}