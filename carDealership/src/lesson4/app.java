package lesson4;
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
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
        list1.removeAll(removeList);
        HashSet<Employee> hasheset= new HashSet<Employee>();
        hasheset.add(new Employee("Mike",3500, "Accounting"));
        hasheset.add(new Employee("Paul", 6000, "Admin"));
        hasheset.add(new Employee("Peter", 3000, "IT"));
        hasheset.add(new Employee("Angel", 4000, "Maint"));
        hasheset.add(new Employee("John", 2000, "Benefits"));

        ArrayList<Employee> myList= new ArrayList<Employee>(hasheset);
        Collections.sort(myList);
        
        System.out.println(myList);
       }
}


