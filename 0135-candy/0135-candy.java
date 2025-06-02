class Solution {
    public int candy(int[] ratings) {
        if(ratings.length == 1)  return 1;
        int result = ratings.length;
        for(int i=0; i<ratings.length; i++) {
            if(i==0) {
                if(i > i+1) result++;
            } else if(i==ratings.length-1) {
                if(i > i-1) result++;
            } else {

            }
        }
    }
}