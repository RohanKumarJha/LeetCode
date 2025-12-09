class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 1;
        int pointer=digits.length-1;
        while(pointer >= 0) {
            int result = digits[pointer--] + carry;
            list.add(0,result%10);
            carry = result/10;
        }
        if(carry != 0) list.add(0,carry);

        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}