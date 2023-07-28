package org.example.lste;

import java.util.*;

public class DemoList {


    public static void main(String[] args) {

        //demo pour vector
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : "+vector);

        //methode pour vector
        System.out.println("1. taille du vector : "+vector.size());
        System.out.println("2. Element a l'index 1 "+vector.get(1));
        System.out.println("3. Est ce que l'element est present "+vector.contains("Banana")); //true


        //demo pour SortedSet
        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("JavaScript");
        sortedSet.add("Java"); // non ajouter car doublon

        System.out.println("SortedSet : "+sortedSet);


        //methode pour sortedSet
        System.out.println("1. premier element : "+sortedSet.first());
        System.out.println("2. dernier element : "+sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("3. Sous ensemble avant \"Python\" : "+headSet);

        //demo pour LinkedList
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.71);
        linkedList.add(1.1234);
        System.out.println("LinkedList : "+linkedList);

        //methode pour linkedList
        System.out.println("1. premier element : "+linkedList.getFirst());
        System.out.println("2. dernier element : "+linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression du premier : "+linkedList);

        //demo pour SortedMap
        SortedMap<String,Integer> sortedMap = new TreeMap<String,Integer>();
        sortedMap.put("Java",20);
        sortedMap.put("Python",10);
        sortedMap.put("C++",30);
        System.out.println("SortedMap : "+sortedMap);

        //methode pour SortedMap
        System.out.println("1. Cles de sortesMap : "+sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : "+sortedMap.values());
        sortedMap.remove("Java");
        System.out.println("SortedMap : "+sortedMap);


        //demo pour hachMap
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("Python",10);
        hashMap.put("C++",30);
        System.out.println("HashMap : "+hashMap);

        String csharp="C#";
        int valueCSarp = 40;

        hashMap.put(csharp,valueCSarp);
        System.out.println(csharp.hashCode());


        // methode pour hashMap
        System.out.println("1. Taille du HashMap : " + hashMap.size());
        System.out.println("2. valeur associé a la clé 'java' : " + hashMap.get("java"));
        System.out.println("3. verification si clé presente : " + hashMap.containsKey("banana"));
        hashMap.remove("python");
        //System.out.println(" hasMap : " + hashMap);
        System.out.println("4.suppression de l'entrér avec la clé python");
        System.out.println(" hasMap : " + hashMap);
        System.out.println("###################################");


    }
}
