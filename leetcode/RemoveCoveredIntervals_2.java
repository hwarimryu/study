class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
                if(a[0]==b[0])
                    return b[1]-a[1];
                else return a[0]-b[0];
            });
        int answer = 1;
        int max=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(max<intervals[i][1]){
                answer++;
                max = intervals[i][1];
            }
        }
      
       
        return answer;
    }
}
