package lesson4;

import java.util.ArrayList;

public class app {
    public static void main(String[] arg) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        ArrayList<Integer> newList = new ArrayList<Integer>();
        ArrayList<Integer> removeList = new ArrayList<Integer>();
        removeList.add(67);
        removeList.add(15);

        newList.add(10);
        newList.addAll(list1);
         System.out.println(newList);
        System.out.println(list1);
        list1.removeAll(removeList);
        System.out.println(list1);
    }
}
