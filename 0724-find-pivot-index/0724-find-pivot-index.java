class Solution {
    public int pivotIndex(int[] nums) {
    int []left=new int[nums.length];
        int []right=new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];
        for(int i =1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        for(int j=nums.length-2;j>=0;j--){
            right[j]=right[j+1]+nums[j];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}