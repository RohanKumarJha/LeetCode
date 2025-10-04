class Solution {

    public void conquor(int[] nums,int start,int mid,int end) {
        int size1 = mid-start+1;
        int size2 = end-mid;
        int[] left = new int[size1];
        int[] right = new int[size2];
        for(int i=0; i<size1; i++) left[i]=nums[i+start];
        for(int i=0; i<size2; i++) right[i]=nums[mid+1+i];

        int i=0, j=0, k=start;
        while(i!=size1 && j!=size2) {
            if(left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while(i != size1) nums[k++] = left[i++];
        while(j != size2) nums[k++] = right[j++];
    }

    public void divide(int[] nums,int start,int end) {
        if(start == end) return ;
        int mid = start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquor(nums,start,mid,end);
    }

    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}