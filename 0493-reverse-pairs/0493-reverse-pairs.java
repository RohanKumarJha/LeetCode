class Solution {
    private int count = 0;

    public void conquor(int arr[],int low,int mid,int high){
        List<Integer>list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid &&right<=high){
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        
    }

    public void countreverse(int arr[],int low,int mid,int high){
        int right=mid+1;
        for(int i=low;i<=mid;i++){ 
            while(right<=high &&arr[i]>2L*arr[right]){ 
                right++;
            }
            count+=right-(mid+1);
        }
    }

    private void divide(int[] nums,int start,int end) {
        if(start == end) return ;
        int mid = start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        countreverse(nums,start,mid,end);
        conquor(nums,start,mid,end);
    }

    public int reversePairs(int[] nums) {
        divide(nums,0,nums.length-1);
        return count;
    }
}