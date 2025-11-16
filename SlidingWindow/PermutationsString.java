package SlidingWindow;

import java.util.Arrays;

public class PermutationsString {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int n1 = s1.length();
        int n2 = s2.length();
        for(int k=0;k<n1;k++)freq1[s1.charAt(k)-'a']++;
        if(n1 >n2)return false;
        int i=0;
        int j = 0;
        while(j<n2){
            freq2[s2.charAt(j)-'a']++;
            if(j-i+1>n1){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
            j++;
        }
return false;


    } 
}
