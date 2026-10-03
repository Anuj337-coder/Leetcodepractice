class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         int i=0;
        int j=0;
        int odd=0;
        int count=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]%2==1){
                odd++;
                count=0;
            }
            while(odd==k){
                if(nums[i]%2==1){
                    odd--;
                    
                }
                count++;
                    i++;
                
               
            }
            ans=ans+count;
            j++;
           

        } 
        return ans;
        
    }
}