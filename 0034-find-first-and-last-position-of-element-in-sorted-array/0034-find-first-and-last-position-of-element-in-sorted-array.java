class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []result=new int[2];
        result[0]=findfirst(nums,target);
        result[1]=findlast(nums,target);
        return result;
    }

    public int findfirst(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }

    public int findlast(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}