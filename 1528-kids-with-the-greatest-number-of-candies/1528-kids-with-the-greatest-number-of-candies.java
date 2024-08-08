class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> newArr = new ArrayList<> ();
        int maxElem = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            maxElem = Math.max(candies[i], maxElem);
        }
        for(int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= maxElem) {
                newArr.add(true);
            } else {
                newArr.add(false);
            }
        } return newArr;
    }
}