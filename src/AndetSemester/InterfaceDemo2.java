package AndetSemester;

//Typer af interfacer
// 1. Normal
// 2. Single abstract method - (fra java 8) Functional interface - Lamda Expressions - Scala
// 3. Marker interface

@FunctionalInterface
interface ABC2 {
    void show();
}

public class InterfaceDemo2 {

    public static void main(String[] args) {
        //Lambda udtryk for implementering af interfacen
        ABC2 obj = () -> System.out.println("I am the best");

        obj.show();
    }

}
