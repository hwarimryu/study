// https://leetcode.com/problems/asteroid-collision/

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        if(asteroids.length==0){
            return asteroids;
        }
        Stack<Integer> left= new Stack<Integer>();

        int top,tmp,size;
        for(int i=0;i<asteroids.length;i++){
            
            if(!left.isEmpty()){
                top=left.peek();
            }else{
                left.push(asteroids[i]);
                continue;
            }
            
            tmp=asteroids[i];
            if(tmp>0||top<0){//go right인 경우 || //top이 go left
                left.push(tmp);
            }else{//go left인 경우
                if(top<(tmp*-1)){//절대값으로..
                    left.pop();
                    i--;
                }
                else if(top==(tmp*-1)){
                    left.pop();
                }
            }
        }
    
        size=left.size();

        int[] answer= new int[size];
        for(int i=1;i<=size;i++){
            answer[size-i] = left.pop();
        }
        
        return answer;
        
    
    }
}