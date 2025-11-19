class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int result1=0, count1=0;
        int result2=0, count2=0;
        
        for (int num : nums) {
            if (result1 == num) {
                count1++;
            } else if (result2 == num) {
                count2++;
            } else if (count1 == 0) {
                result1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                result2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i : nums) {
            if(i == result1) count1++;
            else if(i == result2) count2++;
        }

        List<Integer> list = new ArrayList<>();
        if(count1 > nums.length/3) list.add(result1);
        if(count2 > nums.length/3) list.add(result2);
        return list;
    }
}