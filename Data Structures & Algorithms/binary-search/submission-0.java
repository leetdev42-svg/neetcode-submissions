class Solution {
    public int search(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
              int min_idx = i;
              for(int j=i+1;j<nums.length;j++){
                    if(nums[min_idx]>nums[j]){
                         min_idx=j;
                    }
              }
              int temp = nums[min_idx];
              nums[min_idx]=nums[i];
              nums[i]=temp;
         }
         int start=0,end=nums.length-1;
         while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid]==target){
                     return mid;
                }
                else if(nums[mid]>target){
                        end=mid-1;
                }
                else{
                        start=mid+1;
                }
         }
         return -1;
    }
}
