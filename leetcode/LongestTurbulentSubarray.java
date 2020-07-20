// 978. Longest Turbulent Subarray
// https://leetcode.com/problems/longest-turbulent-subarray/submissions/

class Solution {
    public int maxTurbulenceSize(int[] A) {
        int length = A.length;
        
//      배열 길이가 0,1 이면 길이 그대로 return
        if(length<2) return length;
        
        int answer = Integer.MIN_VALUE;
        
//      이전 비교 결과가 '<' 이면 isBigger =true : false
        boolean isBigger=false;

//      처음 시작위치 찾기 1,1,1,1,...로 계속 같으면 시작 
        int start =0;
        for(int i=0;i<length-1;i++){          
            if(A[i]<A[i+1]) {
                isBigger= true;
                start = i;
                break;
            }else if(A[i]>A[i+1]){
                isBigger= false;
                start = i;
                break;
            }
        }
        
        int cnt=1;

        for(int i=start+1;i<length-1;i++){          
            if(!isBigger&&A[i-1]<A[i]){            
                cnt++;
                isBigger=true;
            }else if(isBigger&&A[i]<A[i-1]){
                cnt++;
                isBigger=false;
            }else {
                answer= Math.max(cnt,answer);
                if(A[i]==A[i-1]) {
                    isBigger = (A[i]<A[i+1]);
                    cnt=1;
                }
                else cnt=2;
            }
        }
        
        
        if((!isBigger&&A[length-2]<A[length-1])||(isBigger&&A[length-1]<A[length-2])){
            cnt++;
        }      
        answer= Math.max(cnt,answer);

        return answer;
    }
}
