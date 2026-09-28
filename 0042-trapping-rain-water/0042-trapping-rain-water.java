class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []leftmax=new int[n];
        int []rightmax=new int[n];
         leftmax[0]=height[0];
         rightmax[n-1]=height[n-1];
         for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
         }
         for(int j=n-2;j>=0;j--){
               rightmax[j]=Math.max(rightmax[j+1],height[j]) ;
         }
         int count=0;
         for(int i=0;i<n;i++){
            count=count+Math.min(leftmax[i],rightmax[i])-height[i];

         }
         return count;

    }
}