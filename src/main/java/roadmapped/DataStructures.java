package roadmapped;

import java.util.*;

public class DataStructures {
    public int[] array = new int[10];
    public int[][] twoDimArray = new int[10][10];

    public List<Integer> arrayList = new ArrayList<>();
    public List<Integer> linkedList = new LinkedList<>();
    public Vector<Integer> vector = new Vector<>();
    public Vector<Integer> stack = new Stack<>();      // stack
    public Queue<Integer> queue = new LinkedList<>();  // queue
    // dequeue                                  - for two-direction queue
    // priorityDeque                            - for sorted
    public Set<Integer> set = new HashSet<>();
    // linkedHashSet                            - for adding in order
    // sortedSet
    // navigableSet                             - with simple finding
    public Set<Integer> treeSet = new TreeSet<>();     // navigable & sorted, RB tree
    public HashMap<String, Integer> map = new HashMap<>(); // unique keys, values'll be overwritten [add -> put]
    public HashMap<String, ArrayList<Integer>> multimap = new HashMap<>();


    public <T> void runTroughList(List<T> list) {
        //iterator
        for (T t : list) {
            System.out.println(t);
        }
    }

    public void fillWithRand(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}
