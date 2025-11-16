
package SlidingWindow;
import java.util.HashMap;
public class LongestRepeatingChReplacement{
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i =0;
        int j = 0;
        int maxFreq = 0;
        int len = 0;
        HashMap<Character , Integer> mp = new HashMap<>();
        while(j<n){
            mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j) , 0)+1);
            maxFreq = Math.max(maxFreq , mp.get(s.charAt(j)));
            while((j-i+1) - maxFreq >k){
                mp.put(s.charAt(i) , mp.get(s.charAt(i))-1);
                i++;
            }
            len = Math.max(len , j-i+1);
            j++;
        }
        return len;
    }
}