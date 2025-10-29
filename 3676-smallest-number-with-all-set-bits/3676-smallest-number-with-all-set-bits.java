class Solution {
    public int smallestNumber(int n) {
        int temp = n;
        int no_of_bits = 0;
        
        while(temp > 0) {
            no_of_bits++;
            temp >>= 1; // more efficient than temp /= 2
        }
        
        return (1 << no_of_bits) - 1; // all bits set to 1
    }
}
