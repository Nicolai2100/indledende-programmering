package AndetSemester;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo_13 {

    public static void main(String[] args) {
        int value = 5;
        //Ikke type safe
        List values = new ArrayList();

        values.add(7);
        values.add("navin");

        //type safe. Generics = <Integer>, fjerner fejl fra run-time til compile-time
        List <Integer> values2 = new ArrayList<Integer>();

        values2.add(7);
        values2.add(4);

        Container<?> obj = new Container<>();


        Container<Integer> obj2 = new Container<Integer>();
        obj2.value=9;
        obj2.show();

        obj2.demo(new ArrayList<Integer>());
    }
}
//E - is element, T - Type,
class Container<T extends Number>{
    //Makes sure that only T's will be used
    T value;
    public void demo(ArrayList<? super T> obj){

    }

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
