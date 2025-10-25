class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int row = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<row; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(map.containsKey(nums[i][j])) {
                    map.put(nums[i][j],map.get(nums[i][j])+1);
                } else {
                    map.put(nums[i][j],1);
                }
                if(map.get(nums[i][j]) == row) {
                    list.add(nums[i][j]);
                }
            }
        } Collections.sort(list);
        return list;
    }
}