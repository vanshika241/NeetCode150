import java.util.*;

public class ArrayListTypes{
    public static void main(String[] args) {
        //1D ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(0,0);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        arr.set(1, 10);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("Sorted List " + arr);


        //2D ArrayList
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        System.out.println(list.get(0));
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add("Str"+i+" "+j);
            }
        }
        System.out.println(list.size());
        System.out.println(list.get(0).size());
        System.out.println(list.get(0).get(2));
        System.out.println(list);

        //List Interface 
        List<Integer> list2 = new ArrayList<>();
        list2.add(19);
        list2.add(3);
         System.out.println(list2.size());
        System.out.println(list2.get(1));
        list2.set(1, 10);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("Sorted List " + list2);
        
    }
}