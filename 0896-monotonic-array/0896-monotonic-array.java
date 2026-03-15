class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean x=increase(nums)|| decrease(nums);
        return x ;

        
    }
    public boolean increase(int []nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }

        }
        return true;
    }
     public boolean decrease(int []nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                return false;
            }

        }
        return true;
    }
}