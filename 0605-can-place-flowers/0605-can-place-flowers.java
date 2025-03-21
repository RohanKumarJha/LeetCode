class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n == 0) return true;
        if(len==1) return (flowerbed[0]==0 && n==1) ? true : false;
        if(len==2) return (flowerbed[0]==0 && flowerbed[1]==0 && n==1) ? true : false;
        for(int i=0; i<len; i++) {
            if(flowerbed[i]==0) {
                if(i==0) {
                    if(flowerbed[i+1]==0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if(i==len-1) {
                    if(flowerbed[i-1]==0) n--;
                } else {
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
        } return (n <= 0) ? true : false;
    }
}