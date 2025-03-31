class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for(int i : candies) {
            greatestCandies = (greatestCandies > i) ? greatestCandies : i;
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= greatestCandies) list.add(true);
            else list.add(false);
        } return list;
    }
}