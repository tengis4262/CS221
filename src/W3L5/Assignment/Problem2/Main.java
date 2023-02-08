package W3L5.Assignment.Problem2;

import java.util.Hashtable;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Item it1 = new Item("iPhone",599.99,3,"123");
        Item it2 = new Item("iPad",699.99,2,"122");
        Item it3 = new Item("iPod",199.99,4,"121");
        Item it4 = new Item("iMac",1099.99,1,"124");
        Item it5 = new Item("AirPods",99.99,5,"119");

        Item_Id id1 = new Item_Id(it1.getId());
        Item_Id id2 = new Item_Id(it2.getId());
        Item_Id id3 = new Item_Id(it3.getId());


        Hashtable<Item_Id,Item> tab = new Hashtable<>();

        tab.put(id2,it1);
        tab.put(id1,it3);

        Iterator<Item_Id> itr = tab.keySet().iterator();
        while (itr.hasNext()){
            Item i = tab.get(itr.next());
            System.out.println(i);
        }

        System.out.println(tab.contains(it1));
        tab.replace(id1,it3,it2);

//        tab.replace(id1,it3,it2);
        System.out.println("After replacing value with replace method");

        Iterator<Item_Id> itr1 = tab.keySet().iterator();
        while (itr1.hasNext()){
            Item i = tab.get(itr1.next());
            System.out.println(i);
        }

        tab.put(id1,it3);
        System.out.println("After replacing value with put method");

        Iterator<Item_Id> itr2 = tab.keySet().iterator();
        while (itr2.hasNext()){
            Item i = tab.get(itr2.next());
            System.out.println(i);
        }








    }
}
