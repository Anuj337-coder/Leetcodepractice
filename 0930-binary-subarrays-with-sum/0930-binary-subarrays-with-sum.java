class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(0,goal,nums);
    }
    public int helper(int idx,int goal,int[]nums){
        if(idx>=nums.length)return 0;
        int sum=0;
        int count=0;
        for(int i=idx;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==goal){
                count++;
            }
        }
        return count+helper(idx+1,goal,nums);
    }
}