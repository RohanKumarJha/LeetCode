class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandies = candies[0];
        for(int i=0; i<candies.length; i++) {
            if(candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        } return list;
    }
}