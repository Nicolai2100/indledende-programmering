package AndetSemester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 3 typer collection:
* 1. interface
* 2. klasser
* 3. concepts
* he root interface in the collection hierarchy. A collection represents
 * a group of objects, known as its elements. Some collections allow
 * duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations
 * of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically
 * used to pass collections around
* and manipulate them where maximum generality is desired.*/
public class IteratorInterface_11 {
    public static void main(String[] args) {
        //Collection er et interface/ API - skal bare bruges
        //Collection interfacet understøtter ikke index numre!
        Collection values = new ArrayList();
        //Tilføj
        ((ArrayList) values).add(4);
        values.add(6);
        values.add(9);
        System.out.println(values);

        //Iterator - fetcher værdier
        Iterator it = values.iterator();
        System.out.println(it.hasNext());

        while(it.hasNext()){
            System.out.println(it.next());

        }

    }



}
