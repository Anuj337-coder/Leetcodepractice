class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long res=0;
        for(int i=0;i<n;i++){
            int  small=nums[i];
            int large=nums[i];
            for(int j=i+1;j<n;j++){
                small=Math.min(nums[j],small);
                large=Math.max(nums[j],large);
                res=res+large-small;
            }
        }
        return res;
    }
}