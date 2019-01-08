package AndetSemester;

import java.util.*;
class MyComparator{

}
public class ListDemo_14 {
    public static void main(String[] args) {
        //2. gang med dette eksempel
        //List er Mutable
        List values = new ArrayList();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        //Comparator via anonymous class - det er en funk interface derfor
        //lambda udtryk!
        Comparator <Integer> c = (i, j) -> i%10 > j%10 ? 1:-1;

        //Sort by their last number
        Collections.sort(values, c);
        //Sorting teknikker handler om swapping the elements
        //Sorting based on, when to sort and when not to sort
        //1 betyder swap, -1 betyder swap ikke!
        //
        for (Object obj: values) {
            System.out.println(obj);
        }
        //values.add(2,2);
        //Collections.sort(values);
        //Collections.reverse(values);
        //Collections.shuffle(values);
/*
        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }*/
    }
}
