class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(len == 1) {
            if(flowerbed[0]==0) n--;
        }
        if(len >= 2) {
            for(int i=0; i<len; i++) {
                if(flowerbed[i]==0) {
                    if(i==0) {
                        if(flowerbed[i+1]==0) {
                            flowerbed[i]=1;
                            n--;
                        }
                    } else if(i==len-1) {
                        if(flowerbed[i-1]==0) {
                            flowerbed[i-1]=1;
                            n--;
                        }
                    } else {
                        if(flowerbed[i-1]==0 & flowerbed[i+1]==0) {
                            flowerbed[i]=1;
                            n--;
                        }
                    }
                }
            } 
        } return n<=0;
    }
}