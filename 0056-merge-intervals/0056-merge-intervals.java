import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

      
        for (int i = 1; i < arr.length; i++) {
            int currentStart = arr[i][0];
            int currentEnd = arr[i][1];

            
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            } else {
                
                result.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

       
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}