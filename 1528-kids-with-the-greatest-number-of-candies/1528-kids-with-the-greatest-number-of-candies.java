class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int maxVal = Integer.MIN_VALUE;
        for(int i : candies) {
            maxVal = Math.max(maxVal,i);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i : candies) {
            if(i+extraCandies >= maxVal) {
                list.add(true);
            } else {
                list.add(false);
            }
        } return list;
    }
}