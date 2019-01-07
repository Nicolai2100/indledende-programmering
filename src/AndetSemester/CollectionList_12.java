package AndetSemester;

import java.util.ArrayList;
import java.util.List;

public class CollectionList_12 {

    public static void main(String[] args) {

        //List of objects - kan indeholde alle typer objekter

        List values = new ArrayList();
        //Dette er ikke int 4, men Integer v = new Integer(4);
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2,2);
        values.add("Snipsak");

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        for (Object obj: values) {
            System.out.println(obj);
        }


    }
}
