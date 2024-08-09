class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> li = new LinkedList<> ();
        int k = 1;
        for(int i=digits.length-1; i>=0; i--) {
            li.add(0, (digits[i]+k)%10);
            k= (digits[i] +k) / 10;
        }
        while (k > 0) {
            li.add(0, k % 10);
            k /= 10;
        }
        int[] newArr = new int[li.size()];
        for(int i=0; i<li.size(); i++) {
            newArr[i] = li.get(i);
        } return newArr;
    }
}