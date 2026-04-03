class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int longest=0;
        for(int i:ans){
            if(!ans.contains(i-1)){
                int current=i;
                int count=1;

                while(ans.contains(current+1)){
                    current++;
                    count++;

                }
                 longest=Math.max(longest,count);
               
            }
            
        }
        return longest;
    }
}