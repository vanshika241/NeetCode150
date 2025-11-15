package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithNonRepeatingCh {
    
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        int i=0;
        int j = 0;
        int maxlen = 0;
        while(j<n){
            mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j),0)+1);
            while(j-i+1>mp.size()){
                mp.put(s.charAt(i) , mp.getOrDefault(s.charAt(i),0)-1);
                if(mp.get(s.charAt(i)) == 0)mp.remove(s.charAt(i));
                i++;
            }
            maxlen = Math.max(maxlen , j-i+1);
            j++;
        }
        return maxlen;
    }
}
