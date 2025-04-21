class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxElm = Integer.MIN_VALUE;
        for(int i : candies) {
            maxElm = Math.max(maxElm,i);
        }
        for(int i=0; i<candies.length; i++) {
            list.add((candies[i]+extraCandies >= maxElm) ? true : false);
        } return list;
    }
}