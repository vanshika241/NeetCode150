package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char currArr[] = strs[i].toCharArray();
            Arrays.sort(currArr);
            String newStr = new String(currArr);
            if(mp.containsKey(newStr)){
                mp.get(newStr).add(strs[i]);
            }
            else{
                mp.put(newStr , new ArrayList<>());
                mp.get(newStr).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>(mp.values());
        return ans;
    }
}
