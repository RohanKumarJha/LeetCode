class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i=0; i<fruits.length; i++) {
            Boolean flag = false;
            for(int j=0; j<baskets.length; j++) {
                if(fruits[i] <= baskets[j]) {
                    baskets[j] = Integer.MIN_VALUE;
                    flag = true;
                    break;
                }
            } if(!flag) count++;
        } return count;
    }
}