class Solution {
    public int totalFruit(int[] fruits) {
        int j=0;
        int i=0;
        int maxfruit=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<fruits.length){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            maxfruit=Math.max(maxfruit,j-i+1);
            j++;
        }
        return maxfruit;
    }
}