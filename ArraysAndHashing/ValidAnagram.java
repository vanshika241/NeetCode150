package ArraysAndHashing;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)return false;
        // HashMap<Character , Integer> hmap1 = new HashMap<>();
        // HashMap<Character , Integer> hmap2 = new HashMap<>();
        // for(int i=0;i<n1;i++){
        //     hmap1.put(s.charAt(i) , hmap1.getOrDefault(s.charAt(i) , 0)+1); 
        // }

        // for(int i=0;i<n1;i++){
        //     hmap2.put(t.charAt(i) , hmap2.getOrDefault(t.charAt(i) , 0)+1); 
        // }

        // return hmap1.equals(hmap2);

        int freq[] = new int[26];
        for(int i=0;i<n1;i++){
            freq[s.charAt(i)-'a']++;
        }
         for(int i=0;i<n1;i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0)return false;
        }

        return true;


    }
}
