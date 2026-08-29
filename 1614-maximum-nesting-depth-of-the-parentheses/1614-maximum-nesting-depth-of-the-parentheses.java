class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                maxcount=Math.max(count,maxcount);

            }

            if(ch==')'){
                count--;
                 maxcount=Math.max(count,maxcount);

                

            }
        }
        return maxcount;
    }
}