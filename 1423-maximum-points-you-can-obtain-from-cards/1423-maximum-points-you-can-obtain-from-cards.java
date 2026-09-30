class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length;
        for(int i:cardPoints){
            sum=sum+i;
        }
        if(cardPoints.length==k){
            return sum;
        }
        int maxsum=0;
        int right=n-1;
        int leftsum=0;
        int rightsum=0;

        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
        } 
        maxsum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[right];
            right--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        
        return maxsum;
               
    }
}