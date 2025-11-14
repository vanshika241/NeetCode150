package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    
    public String encode(List<String> strs) {
          StringBuilder s = new StringBuilder("");
          for(int i=0;i<strs.size();i++){
             s.append(strs.get(i));
             s.append("]");
          }
          return s.toString();
    }

    public List<String> decode(String str) {
           List<String> ans = new ArrayList<>();
           StringBuilder s = new StringBuilder("");
           for(int i=0;i<str.length();i++){
             if(str.charAt(i) != ']'){
                s.append(str.charAt(i));
             }
             else{
                ans.add(s.toString());
                s = new StringBuilder("");
             }
           }
           return ans;
    }
}
