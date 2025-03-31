class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for(int i : candies) {
            greatestCandies = Math.max(greatestCandies,i);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            list.add((candies[i]+extraCandies >= greatestCandies)? true : false);
        } return list;
    }
}