class Solution {
    public int findMinArrowShots(int[][] points) {
        int length=points.length;
        if(length ==0||length==1) return length;
        
        Arrays.sort(points,new Comparator<int[]>(){
            @Override
            public int compare(int[] arr1, int[] arr2){
                if(arr1[0]-arr2[0]==0){
                    return arr1[1]-arr2[1];
                }
                return arr1[0]-arr2[0];
            }
        } );
        
        int answer=1;
        int end=points[0][1];
        for(int i=1; i<length;i++){
            int pEnd=points[i][1];
            int pStart=points[i][0];
            
            if(pStart>end){
                answer++;
            }else if(pEnd>=end) continue;

            end=pEnd;
        }
        return answer;
    }
}
