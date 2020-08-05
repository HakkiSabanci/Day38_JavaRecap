package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    /*
    Collections Class:
        Collections.sort()
        Collections.swap()
        Collections.frequency()

        Collections.max()
        Collections.min()
        Collections.replaceAll()

     */
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','A','C','B'));

        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);
        System.out.println("===================================================================================");
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Aslan", "Cristina", "Zeliha", "Iman", "Fatima", "Mohammad", "Nesibe", "Hakki"));
//        ArrayList<String> students = new ArrayList<>();
//        students.addAll(Arrays.asList("Aslan","Cristina","Zeliha","Iman","Fatima","Mohammad","Nesibe","Hakki"));

        System.out.println(students);
        Collections.swap(students,students.indexOf("Cristina"),students.indexOf("Fatima"));
        System.out.println(students);
        Collections.swap(students,6,7);
        System.out.println(students);
        Collections.swap(students,6,7);
        System.out.println(students);
        System.out.println("=====================================================================================");
        ArrayList<String> items = new ArrayList<>(Arrays.asList("Coffee","Coffee","Egg","Battery","Battery","Battery","Battery"));
        System.out.println(items);
        int count = Collections.frequency(items,"Battery");
        System.out.println("Frequency of Battery is :"+count);
        ArrayList<String> unique = new ArrayList<>();
        for (String each:items){
            if (Collections.frequency(items,each)==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
        ArrayList<String> unique2 = new ArrayList<>(items);
        System.out.println(unique2);
        unique2.removeIf(p->Collections.frequency(unique2,p)>1);
        System.out.println(unique2);

        System.out.println("===============================================================================");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,89,1000,2000,30,40,-50,1000,1000,1000));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println(list);
        Collections.replaceAll(list,1000,2000);
        System.out.println(list);







    }
}
