package day20_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        // Declaration
        ArrayList arrayList = new ArrayList<>();
//        List list = new ArrayList<>();
//        ArrayList<Integer> mylist1 = new ArrayList<>();
//        List<Integer> mylist2 = new ArrayList<>();
//
//        Add data to array-list
        arrayList.add(100);
        arrayList.add(100.23);
        arrayList.add('A');
        arrayList.add("sid");
        arrayList.add(true);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);

//        size of aaaylist
        arrayList.size();

//        print array-list
        System.out.println(arrayList.size());

//        print arraylist
        System.out.println(arrayList);

//        after removing, print arraylist
        arrayList.remove(0);
        System.out.println(arrayList);

//        insert element
        arrayList.add(1,"insert");
        System.out.println(arrayList);

//        modify /replace
        arrayList.set(1,"replace");
        System.out.println(arrayList);

//        access specific element
        System.out.println(arrayList.get(2));

//        read all elements from arraylist
//        1. using for loop
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

//        2. using for each loop
        for(Object x:arrayList){
            System.out.println(x);
        }

//        3. using iterator
        Iterator iterator = arrayList.iterator(); // if list contains heterogeneous data
//        Iterator<String> iterator = arrayList.iterator(); // if list contains only string data
//        iterator.next() // return first value in arraylist

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        checking arraylist is empty or not
        arrayList.isEmpty();  // true/false

//        remove random elements from array-list
        ArrayList arrayList2 = new ArrayList<>();
        arrayList2.add("sid");
        arrayList2.add(true);

        arrayList.removeAll(arrayList2);

//        clear/empty arraylist
        arrayList.clear();






    }

}
