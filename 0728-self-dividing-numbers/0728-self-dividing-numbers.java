class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> newArr = new ArrayList<> ();
        for(int i=left; i<=right; i++) {
            int count = 0;
            for(int j=i; j>0; j/=10) {
                if(j%10==0) {
                    count=1;
                }
                else if(i%(j%10)!=0) {
                    count = 1;
                    break;
                }
            } if(count==0) {
                newArr.add(i);
            }
        } return newArr;
    }
}