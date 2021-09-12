package com.practice.main.oops;

import java.util.*;

public class Practice {

    static {
        System.out.println("I'M ALWAYS FIRST");
    }

    Practice(){
        System.out.println("I'M ALWAYS Second");
    }

    private static void addArray(int[]arr, ArrayList<Integer> arr1, int a ){
        arr[0]=10;
        arr1.add(0,10);
        a=9;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        int[] arr = new int[10];
        arr[0] = 9;
        int a = 10;
        ArrayList<Integer> arr1 = new ArrayList<>();
        String s = new String("abcd");
        System.out.println(s.length());
        String s1 = "abcd";
        System.out.println(s1.length());
        arr1.add(0, 100);
        addArray(arr, arr1, a);
        System.out.println(arr1.get(0));
        System.out.println(arr[0]);
        System.out.println(a);
        List<Integer> tempArr = new ArrayList<>();
        tempArr.add(Integer.parseInt(Integer.toString(1)));
        tempArr.add(2);
        tempArr.add(3);
        tempArr.add(4);

        tempArr.set(0, 1000000);
        int[] arr2 = tempArr.stream().mapToInt(x -> x).toArray();
        for (int x : tempArr)
            System.out.println("L1" + x);
        for (int x : arr2) {
            System.out.println("A1" + x);
            tempArr.add(x);
        }
        List<Integer> clonedArr4 = new ArrayList<Integer>(tempArr);
        clonedArr4.remove(clonedArr4.size() - 1);
        for (int x : clonedArr4)
            System.out.println("C1" + x);

        String str = "words";
        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i) - 'a');

        Map<String, String> temp = new HashMap<>();
        temp.put("hell", "hell");
        temp.put("hell", "yell");
        if (!temp.containsKey("hell"))
            System.out.println(temp.get("hell"));
        System.out.println(temp.get("yell"));

        Set<String> hset = new HashSet<>();
        hset.add("hello");
        hset.add("hello");
        //hset.remove("hello");
        hset.remove("hello");
        if (hset.contains("hello"))
            System.out.println("Hello000000000000000000000000");

        String s12 = new String("kunal");
        List<String> wordDict = new ArrayList<>();
        wordDict.add("hello");
        wordDict.add("yelo");
        for (String s134 : wordDict)
            System.out.println(s134);

        int[][] darr = new int[1][2];
        darr[0][0] = 10;
        darr[0][1] = 100;
        System.out.println(darr.length);
        System.out.println(darr[0].length);

        //by default it is min priority queue
        PriorityQueue<Integer> minPQueue = new PriorityQueue<Integer>();

        //max priority queue
        PriorityQueue<Integer> maxPQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        while (!maxPQueue.isEmpty())
            System.out.println("jello");
        Comparator<Integer> customComparator = new Comparator<>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                return s1 >= s2 ? 1 : 0;
            }
        };

        //custom priority queue
        PriorityQueue<Integer> CustomPQueue = new PriorityQueue<>(customComparator);

        //https://leetcode.com/problems/cheapest-flights-within-k-stops/
        Queue<Integer> q
                = new LinkedList<>();
        q.isEmpty();
        //Iterate a hashmap
        for (Map.Entry<String, String> entry : temp.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        //https://leetcode.com/problems/insert-delete-getrandom-o1/
        List<Integer> lp = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 10);


        Integer[] sarr = new Integer[5];
        sarr[0] = 1;
        sarr[1] = 1;
        sarr[2] = 1;
        sarr[3] = 1;
        sarr[4] = 1;
        Arrays.sort(sarr, Collections.reverseOrder());


        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        Arrays.sort(array);

        int[] array1 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array1.length; i++)
            array1[i] = rand.nextInt(100) + 1;
        Arrays.sort(array1);
        //Collections.reverse(Arrays.asList(array1));

    }

}
