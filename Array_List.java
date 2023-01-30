package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<String>();

        arr.add( "Item 0");
        arr.add( "Item 1");
        arr.add( "Item 2");
        arr.add( "Item 3");
        arr.add( "Item 4");
        arr.add( "Item 6");
        arr.set(0, "Sell");
        arr.forEach(null);

        Collections.sort(arr);

        System.out.println("Size of array is " + arr.size());
        System.out.println("Add item 5 " ); arr.add(5, "item 5");
        System.out.println("Added array >> " + arr);
        System.out.println("Remove item 6"); arr.remove("Item 6"); 
        System.out.println("Removed array >> " + arr);

        for(String i:arr)
        {
            System.out.println(i);
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
    }
    
}