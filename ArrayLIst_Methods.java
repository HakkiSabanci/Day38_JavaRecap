package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIst_Methods {
    //remove,size,get,set,equals,contains,clear
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infinity","Tesla","WV","Lamborghini","Lexus","Tesla","Tesla","Mazda"
        ,"Nissan","Mitsubishi"));
        //                          0       1           2        3      4         5         6
        //cars.remove(3);
        //cars.remove("Tesla"); //it removes only one
        //System.out.println(cars);

        //cars.removeAll(Arrays.asList("Tesla"));
        //System.out.println(cars);

        //cars.removeIf(p->p.toLowerCase().contains("m"));
        //System.out.println(cars);

        //cars.retainAll(Arrays.asList("Tesla"));
        //System.out.println(cars);
        System.out.println("=====================================================================================");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Pepper","Paper Towels","Toilet Paper","Mango",
                "Orange","Avocado","Pepsi","Dragon Fruit","Apple","Water","Beef"));
        boolean r1 = groceryList.contains("Coke");
        System.out.println(groceryList);
        System.out.println(r1);

        //Eggs,Milk,Orange,Chicken
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Milk","Orange","Chicken"));
        System.out.println(r2);

        //Eggs,Milk,Orange
        boolean r3 = groceryList.containsAll(Arrays.asList("Eggs","Milk","Orange"));
        System.out.println(r3);

        System.out.println("Total items in Shopping List: "+groceryList.size());
        System.out.println(groceryList);
        groceryList.set(groceryList.indexOf("Dragon Fruit"),"Apple");
        System.out.println(groceryList);
        groceryList.set(groceryList.size()-1,"Fish");
        System.out.println(groceryList);
        groceryList.set(groceryList.indexOf("Paper Towels"),"Dish Washer");
        System.out.println(groceryList);

        groceryList.clone();
        System.out.println(groceryList);
        groceryList.clear();
        System.out.println(groceryList);

    }
}
