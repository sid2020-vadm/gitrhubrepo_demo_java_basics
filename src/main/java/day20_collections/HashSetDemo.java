package day20_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
//        declaration
        HashSet hashSet = new HashSet<>();
        Set myset = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();

//        add elements to set
        myset.add(100);
        myset.add("sid");
        myset.add('A');
        myset.add(true);
        myset.add(100);
        myset.add(null);
        myset.add(null);

//        remove elemnet
        hashSet1.remove(100);

//        size of hashset
        hashSet1.size();

//        convert hash set to arraylist
        ArrayList<Object> arrayList = new ArrayList<>(hashSet1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));


// Read all elements from set
//        1
        for(Object x: hashSet1){
            System.out.println(x);
        }

//          2
        Iterator it = hashSet1.iterator();
        while ((it.hasNext())){
            System.out.println(it.next());
        }

//        empty hastset
        hashSet1.clear();
        System.out.println(hashSet1.isEmpty());



    }
}
