package Collection;

import java.util.ArrayList;

public class Array_Obj {
    public static void main(String[] args) {
        ArrayList <Movie> arr = new ArrayList<Movie>();

        Movie s;

        s = new Movie("Susume","2022","Yuumiya");
        arr.add(s);
        s = new Movie("Tori","2022","Yuumi");
        arr.add(s);
        s = new Movie("Sennen no genken","2022","Caty");
        arr.add(s);
        s = new Movie("Kana","2022","Cati");
        arr.add(s);

        for(Movie i:arr)
        {
            i.display();
        }
    }
}
