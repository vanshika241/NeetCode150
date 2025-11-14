public class MyHashMap<K,V> {
    
     private class Entry<K,V>{
        private K key ; // variable name key 
        private V value ; // variable name value with type V
        private Entry<K,V> next;

        public Entry(K key , V value){
            this.key = key;
            this.value = value;
        }

        public  K getKey(){
            return this.key;
        }

        public V getValue(){
            return this.value;
        }

        public void setValue(V value){
            this.value = value;
        }

     }
 

     private final int size = 5 ;
     private Entry<K,V> table[]; // Array of these enteries 

     public MyHashMap(){
        this.table = new Entry[size];
     }

     public void put(K key , V value){
        int hash = key.hashCode() % size; // key to hashcode - reduce to 0 to 4 
        Entry<K,V> e = table[hash];
        if(e == null){
            table[hash] = new Entry<K,V>(key, value);
        }
        else{
            //already list here - add in the end 
            //if key exist 
            while (e.next != null) {
                if (e.getKey() == key) {
                    e.setValue(value); 
                    return;
                }
                e = e.next;
            }
            // if not exixt
            e.next = new Entry<K,V>(key, value);
        }
     }


     public V get(K key){
        int hash = key.hashCode() % size;
        Entry<K,V> e = table[hash];
        if (e == null) {
            return null;
        }
        else{
            while (e != null) {
                if (e.getKey() == key) {
                    return e.getValue();
                }
                e = e.next;
            }
        }
        return null;
     }

     public boolean containsKey(K key){
        int hash = key.hashCode();
        Entry<K,V> e = table[hash];
        while (e != null) {
            if (e.getKey() == key) {
                return true;
            }
            e = e.next;
        }
        return false;
     }

     public Entry<K,V> remove(K key){
         int hash = key.hashCode() % size;
        Entry<K,V> e = table[hash];
        if (e == null) {
            return null;
        }
        if(e.getKey() == key){ // head remove
            table[hash] = e.next;
            e.next = null;
            return e;
        }
        Entry<K,V> prev = null;
        while (e != null) {
            if (e.getKey() == key) {
                Entry<K,V> removed = e;
                prev.next = e.next;
                 return removed;
            }
            prev = e;
            e = e.next;
        }
        return null;
     }





    public static void main(String[] args) {
        MyHashMap<String , String > hmap = new MyHashMap<>();
        hmap.put("A", "B");
        hmap.put("C", "D");
        hmap.put("E", "F");
        hmap.put("G", "H");
        hmap.put("I", "J");
        hmap.put("K", "L");
        hmap.put("M", "N");
        System.out.println(hmap.get("M"));
    }
}
