

class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        boolean[] checked= new boolean[intervals.length];
        
        for(int i=0;i<intervals.length-1;i++){
            if(checked[i]) continue;
            for(int j=i+1;j<intervals.length;j++){
                if(checked[j]) continue;
                if(intervals[j][1]<=intervals[i][1]){
                    checked[j] =true;
                }else if(intervals[j][0]==intervals[i][0])
                    checked[i] = true;
            }
        }
        int answer = 0;
      
        for(boolean c :checked){
            if(!c) answer++;
        }
        return answer;
    }
}
