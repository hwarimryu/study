// https://leetcode.com/problems/map-sum-pairs/
import java.util.HashMap;

class MapSum {

    HashMap<String, Integer> keyValue;

    public MapSum() {
         keyValue=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        if(keyValue.containsKey(key))
            keyValue.replace(key,val);
        else{
            keyValue.put(key,val);
        }        
    }
    
    public int sum(String prefix) {
        int answer=0;
        for(String str:keyValue.keySet()){
            if(str.startsWith(prefix))
                answer+=keyValue.get(str);
        }
        return answer;
    }
}