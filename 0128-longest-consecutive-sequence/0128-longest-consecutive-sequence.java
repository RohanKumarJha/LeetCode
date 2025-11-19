class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Map<Integer,Boolean>  map = new HashMap<>();
        for(int i : nums) {
            map.put(i, false);
        }

        int sum = 0;
        for(int i : nums) {
            int value = i;
            if(map.get(i) == false) {
                int answer = 1;
                map.put(i,true);
                while(map.containsKey(value+1)) {
                    map.put(value+1,true);
                    answer++;
                    value++;
                }
                value = i;
                while(map.containsKey(value-1)) {
                    map.put(value-1,true);
                    answer++;
                    value--;
                }
                result = Math.max(result,answer);
            } 
        } return result;        
    }
}