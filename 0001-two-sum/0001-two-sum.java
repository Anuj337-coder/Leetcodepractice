class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            int require=target-nums[i];
            if(hs.containsKey(target-nums[i])){
                return new int[]{hs.get(require),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}