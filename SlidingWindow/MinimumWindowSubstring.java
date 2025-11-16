
package SlidingWindow;
import java.util.*;
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1<n2)return "";
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0;i<n2;i++)mp.put(t.charAt(i) , mp.getOrDefault(t.charAt(i) , 0)+1);
        int len = Integer.MAX_VALUE;
        int cnt = mp.size();
        int i=0;
        int j=0;
        int start = 0;
        while(j<n1){
            mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j) ,0)-1);
            if(mp.get(s.charAt(j)) == 0)cnt--;
           
           while(cnt == 0){
            if(j-i+1<len){
                len = j-i+1;
                start = i;
            }
            mp.put(s.charAt(i) , mp.get(s.charAt(i))+1);
            if(mp.get(s.charAt(i)) > 0)cnt++;
            i++;
           }

            if(cnt == 0){
              len = Math.min(len , j-i+1);
            }
            j++;
        }
        return  len == Integer.MAX_VALUE? "" :  s.substring(start,start+len);
    }
}