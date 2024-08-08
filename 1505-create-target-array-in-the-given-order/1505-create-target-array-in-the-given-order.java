class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> newArr = new ArrayList<> ();
        for(int i=0; i<index.length; i++) {
            newArr.add(index[i],nums[i]);
        }
        int[] arr = new int[index.length];
        for(int i=0; i<index.length; i++) {
            arr[i] = newArr.get(i);
        } return arr;
    }
}