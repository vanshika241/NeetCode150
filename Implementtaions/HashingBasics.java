import java.util.*;

public class HashingBasics {
    public static void main(String[] args) {
        
        String name = "Lavi";
        int num = name.hashCode(); // using hashcode function to generate hash code - key to its value 
        System.out.println(num);

        //HashMap 

        HashMap<String , Integer> mp = new HashMap<>();
        mp.put("Kunal", 88);
        mp.put("Civo" , 78);
        mp.put("Lavi" ,  85);
        System.out.println(mp);
        System.out.println(mp.get("Lavi"));
        System.out.println(mp.size());
        System.out.println(mp.containsKey("Lavi"));
        for(HashMap.Entry<String , Integer> e : mp.entrySet()){
               System.out.println(e.getKey() + " Key value is "+e.getValue());
        }

        ArrayList<String> keys = new ArrayList<>(mp.keySet());
        ArrayList<Integer> values = new ArrayList<>(mp.values());
        System.out.println(keys);
        System.out.println(values);

        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(4));
        for(int curr : set){
               System.out.println(curr);
        }

    }
}
