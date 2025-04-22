class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0 && n<=1) return true;
        if(n==0) return true;
        for(int i=1; i<flowerbed.length; i++) {
            if(i==1 && flowerbed[i]==0 && flowerbed[i-1]==0) {
                n--;
            } else if(i==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0) {
                n--;
            } else {
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            if(n==0) return true;
        } return false;
    }
}