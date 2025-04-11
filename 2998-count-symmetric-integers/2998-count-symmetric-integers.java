class Solution {
    public boolean isSymmetric(int num) {
        String str = Integer.toString(num);
        int start=0, end=str.length()-1;
        int ans1=0, ans2=0;
        while(start < end) {
            ans1 = ans1 + (int)str.charAt(start);
            ans2  =ans2 + (int)str.charAt(end);
            start++; end--;
        } return (ans1 == ans2);
    }

    public boolean isEven(int num) {
        int count=0;
        while(num != 0) {
            count++;
            num /= 10;
        } return (count%2==0);
    }

    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for(int i=low; i<=high; i++) {
            if(isEven(i)) {
                if(isSymmetric(i)) result++;
            }
        } return result;
    } 
}