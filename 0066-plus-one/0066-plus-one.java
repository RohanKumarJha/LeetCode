class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--) {
            int sum = digits[i]+carry;
            result.add(0,sum%10);
            carry = sum/10;
        }
        if(carry != 0) result.add(0,carry);

        int[] arr = new int[result.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}