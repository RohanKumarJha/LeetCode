class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i : nums) {
            if(!result.containsKey(i)) {
                result.put(i,1);
            } else {
                result.put(i,result.get(i)+1);
            }
        }
        for(var answer : result.keySet()) {
            if(result.get(answer) > nums.length/2) return answer;
        } return 0;
    }
}