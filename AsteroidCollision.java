// https://leetcode.com/problems/asteroid-collision/

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        
        Stack<Integer> left= new Stack<Integer>();
        left.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            int tmp=asteroids[i];

            if(left.isEmpty()){
                left.push(tmp);
                continue;
            }
            
            if(tmp>0){
                //go right인 경우
                left.push(tmp);
            }else{
                //go left인 경우
                if(left.peek()<0){
                    //top도 go left
                    left.push(tmp);
                }
                else if(left.peek()==(tmp*-1)){
                    //절대값 같으면 둘다 사라짐
                    left.pop();
                }
                else if(left.peek()<(tmp*-1)){
                    //절대값으로..
                    left.pop();
                    i--;
                }
            }
        }
    
        int size=left.size();

        int[] answer= new int[size];
        for(int i=1;i<=size;i++){
            answer[size-i] = left.pop();
        }
        
        return answer;
        
    
    }
}