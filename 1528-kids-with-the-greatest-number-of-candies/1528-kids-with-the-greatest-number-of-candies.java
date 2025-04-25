class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandy = 0;
        for(int i : candies) {
            maxCandy = Math.max(i,maxCandy);
        }
        for(int i=0; i<candies.length; i++) {
            list.add(candies[i]+extraCandies >= maxCandy ? true:false);
        } return list;
    }
}