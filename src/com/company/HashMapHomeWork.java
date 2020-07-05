package com.company;

import java.util.HashMap;
import java.util.Set;

public class HashMapHomeWork {
    public static void main(String[] args) {


        // 13. Write a Java program to associate the specified value with the specified key in a HashMap.

        System.out.println("----- Get the value with key -----");
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Ken");
        hashMap.put(2, "Mary");
        hashMap.put(3, "Nick");

        System.out.println(hashMap.get(1));


        // 14. Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("----- Count the number of key-value pairs -----");

        System.out.println("The size of hashmap is " + hashMap.size());

        // 15. Write a Java program to copy all of the mappings from the specified map to another map.

        System.out.println("----- Copy hashmap to another one -----");

        HashMap<Integer, String> copiedMap = new HashMap<>();

        copiedMap.putAll(hashMap);

        System.out.println("Copied map is " + copiedMap);


        // 16. Write a Java program to remove all of the mappings from a map.

        System.out.println("----- Removing all elements from map -----");

        copiedMap.clear();

        //17. Write a Java program to check whether a map contains key-value mappings (empty) or not.

        System.out.println("----- Checking if map is empty or not -----");

        System.out.println(hashMap.isEmpty());

        // 18. Write a Java program to get a shallow copy of a HashMap instance.

        System.out.println("----- Get the shallow copy of a map -----");

        HashMap<Integer, String> clonedMap;
        clonedMap = (HashMap) hashMap.clone();

        System.out.println("Cloned map is " + clonedMap);


        // 19. Write a Java program to test if a map contains a mapping for the specified key.

        System.out.println("---- Check for mappings of specified key -----");

        System.out.println(hashMap.containsKey(1));


        // 20. Write a Java program to test if a map contains a mapping for the specified value.

        System.out.println("---- Check for mappings of specified value -----");

        System.out.println(hashMap.containsValue("Nick"));

        // 21. Write a Java program to create a set of the mappings contained in a map.
        //( hint: myHashmap.entrySet() )

        System.out.println("------ Create a set of the mappings contained in a map -----");

        Set set = hashMap.entrySet();

        System.out.println("Set values are: " + set);

        // 22. Write a Java program to get the value of a specified key in a map.

        System.out.println("---- Get the value by its key -----");

        System.out.println("The value of 1 is " + hashMap.get(1));

        // 23. Write a Java program to get a set of the keys contained in this map.
        //(hint: google it)

        System.out.println("----- Get the key set contained in a map -----");

        Set keysSet = hashMap.keySet();
        System.out.println("The keys set is: " + keysSet);

        // 24. Write a Java program to get a collection view of the values contained in this map.

        System.out.println("---- Get the collection view of values -----");

        System.out.println("The collection view is: " + hashMap.values());
    }
}
