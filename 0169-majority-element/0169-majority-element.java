class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int values:map.keySet()){
            if(map.get(values)>nums.length/2){
                return values;
            }
        }
        return -1;
    }
}