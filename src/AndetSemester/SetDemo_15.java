package AndetSemester;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo_15 {

    public static void main(String[] args) {
        Set <Integer> values = new TreeSet<>();
        //HashSet - klasse der implementerer Set
        //Set does not support dublicate values
        //HashSet - Giver dig ikke values in sequence, da det tager
        //den værdi der er hurtigst at finde først
        //TreeSet - giver dig data i ascending order
        System.out.println(values.add(5));
        System.out.println(values.add(6));
        System.out.println(values.add(9));
        System.out.println(values.add(6));

        for (int i :values) {
            System.out.println(i);
        }
    }
}
