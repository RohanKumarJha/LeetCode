class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        Map<Integer,Integer> map = new HashMap<>();
        if(size1 < size2) {
            for(int i=0; i<size2; i++) {
                if(map.containsKey(nums2[i])) {
                    map.put(nums2[i],map.get(nums2[i])+1);
                } else {
                    map.put(nums2[i],1);
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size1; i++) {
                if(map.containsKey(nums1[i]) && map.get(nums1[i])!=0) {
                    list.add(nums1[i]);
                    map.put(nums1[i],map.get(nums1[i])-1);
                } 
            }
            int[] arr = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                arr[i] = list.get(i);
            } return arr;
        } else {
            for(int i=0; i<size1; i++) {
                if(map.containsKey(nums1[i])) {
                    map.put(nums1[i],map.get(nums1[i])+1);
                } else {
                    map.put(nums1[i],1);
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size2; i++) {
                if(map.containsKey(nums2[i]) && map.get(nums2[i])!=0) {
                    list.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i])-1);
                } 
            }
            int[] arr = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                arr[i] = list.get(i);
            } return arr;
        }
    }
}