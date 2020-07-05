package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetHomeWork {
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> friends = new HashSet<>();

        friends.add("Rachel");
        friends.add("Ross");
        friends.add("Monica");
        friends.add("Joey");

        System.out.println("Friends are: " + friends);



        // 2. Write a Java program to iterate through all elements in a hash set.

        System.out.println("----- Iteration over all elements in hash set -----");
        friends.forEach(friend -> {
            System.out.println(friend);
        });

        // 3. Write a Java program to get the number of elements in a hash set.

        System.out.println("----- The number of elements in hash set -----");
        System.out.println(friends.size());

        // 4. Write a Java program to empty a hash set.

        System.out.println("----- Emptying the hash set -----");
        friends.clear();

        // 5. Write a Java program to test if a hash set is empty or not.

        System.out.println("----- Checking if hash set is empty or not -----");
        System.out.println(friends.isEmpty());


        // 6. Write a Java program to clone a hash set to another hash set.

        System.out.println("----- Cloning the hash set -----");
        HashSet<String> friendsForCloning = new HashSet<>();

        friendsForCloning.add("Rachel");
        friendsForCloning.add("Ross");
        friendsForCloning.add("Monica");
        friendsForCloning.add("Joey");

        HashSet clonedSet;
        clonedSet = (HashSet) friendsForCloning.clone();

        System.out.println("The initial set is: " + friendsForCloning);
        System.out.println("The cloned set is: " + clonedSet);


        // 7. Write a Java program to convert a hash set to an array.

        System.out.println("----- Converting hash set to array -----");
        System.out.println("Original hash set is: " + friendsForCloning);

        String [] hashSetToArray = new String[friendsForCloning.size()];
        friendsForCloning.toArray(hashSetToArray);

        System.out.println("Converted to array hash set: " );
        for(String element : hashSetToArray){
            System.out.println(element);
        }


        // 8. Write a Java program to convert a hash set to a tree set.

        System.out.println("----- Converting hash set to tree set -----");

        HashSet<String> setOfStrings = new HashSet<>();

        setOfStrings.add("hello");
        setOfStrings.add("ola");
        setOfStrings.add("hallo");
        setOfStrings.add("hey");
        setOfStrings.add("hi");

        System.out.println("HashSet: " + setOfStrings);

        TreeSet<String> hashSetToTreeSet  = new TreeSet<>(setOfStrings);
        System.out.println("Converted to tree set hash set: " + hashSetToTreeSet);


        // 9. Write a Java program to convert a hash set to a List/ArrayList.

        System.out.println("----- Converting hash set to List/ArrayList -----");

        HashSet<String> setToList = new HashSet<>();

        setToList.add("one");
        setToList.add("two");
        setToList.add("three");
        setToList.add("four");
        setToList.add("five");

        System.out.println("HashSet: " + setToList);

        List<String> listFromHashSet = new ArrayList<>(setToList);
        System.out.println("The converted to array hash set: " + listFromHashSet);


        // 10. Write a Java program to compare two hash sets.

        System.out.println("---- Comparing two hashsets -----");

        HashSet<String> setOne =  new HashSet<>();

        setOne.add("hello");
        setOne.add("world");

        HashSet<String> setTwo =  new HashSet<>();

        setTwo.add("hallo");
        setTwo.add("welt");

        System.out.println("Are the sets equal? ");
        System.out.println(setOne.equals(setTwo));

        // 11. Write a Java program to compare two sets and retain elements which are the same on both sets.

        System.out.println("----- Comparing two hash sets and retaining same elements ------");
        HashSet<Integer> setToCompareOne = new HashSet<>();

        setToCompareOne.add(1);
        setToCompareOne.add(2);
        setToCompareOne.add(3);
        setToCompareOne.add(4);
        setToCompareOne.add(5);

        System.out.println("First hash set: " + setToCompareOne);

        HashSet<Integer> setToCompareTwo = new HashSet<>();

        setToCompareTwo.add(4);
        setToCompareTwo.add(5);
        setToCompareTwo.add(6);
        setToCompareTwo.add(7);
        setToCompareTwo.add(8);

        System.out.println("Second hash set: " + setToCompareTwo);

        setToCompareOne.retainAll(setToCompareTwo);
        System.out.println("Retained elements are: " + setToCompareOne);

        // 12. Write a Java program to remove all of the elements from a hash set.

        System.out.println("----- Removing all elements from hash set -----");
        setToCompareTwo.removeAll(setToCompareTwo);
        System.out.println(setToCompareOne);
    }

}
