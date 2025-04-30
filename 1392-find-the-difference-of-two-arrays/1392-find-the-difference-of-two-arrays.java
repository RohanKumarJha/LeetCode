class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        for(int i : set1)  {
            if(!set2.contains(i)) {
                list1.add(i);
            }
        } 

        List<Integer> list2 = new ArrayList<>();
        for(int i : set2)  {
            if(!set1.contains(i)) {
                list2.add(i);
            }
        } 

        return Arrays.asList(list1, list2);
    }
}