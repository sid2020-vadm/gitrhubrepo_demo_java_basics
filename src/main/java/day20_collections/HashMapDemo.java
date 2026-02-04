package day20_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args){
    //    decalration
    HashMap hm = new HashMap<>();
    Map map =new HashMap<>();

    HashMap<Integer,String> hashMap = new HashMap<>();

//    add key,value to hashmap
    hashMap.put(123,"sid");
    hashMap.put(456,"sid");
    hashMap.put(123,"abc");
    hashMap.put(444,"xyz");

    System.out.println(hashMap);

//    size
    hashMap.size();

//    remove pair
    hashMap.remove(444);

//    access value of a key
    hashMap.get(123);

//    get all keys
    hashMap.keySet();

//    get all values
    hashMap.values();

//    get all key and values
    hashMap.entrySet();

//    read data from hashmap
//    1
    for(int key:hashMap.keySet()){
        System.out.println(hashMap.get(key));
    }

//    2
    Iterator<Map.Entry<Integer,String>> it=hm.entrySet().iterator();
    while (it.hasNext()){
        Map.Entry<Integer,String> entry =it.next();
        System.out.println(entry.getKey()+" "+entry.getValue());
    }


}
}
