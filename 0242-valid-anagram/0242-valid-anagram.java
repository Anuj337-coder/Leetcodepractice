class Solution {
    public boolean isAnagram(String s, String t) {
        int []freq=new int[256] ;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;

    }
}