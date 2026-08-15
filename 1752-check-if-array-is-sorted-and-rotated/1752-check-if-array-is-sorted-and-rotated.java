class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count++;
            }

        }
        if(count==0)return true;
        if(count==1&&nums[n]<=nums[0])return true;
        return false;
        
    }
}