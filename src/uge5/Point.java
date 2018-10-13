package uge5;

public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
    //public boolean equals(Point p)
    {
        //getX().
        /*return true;

        return false;*/
    }
    public void move(int dx, int dy)
    {
        //Flytter punkterne

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    /*
    Lav en klasse Point, der repræsenterer punkter i et koordinatsystem (x,y).
    Klassen skal have en konstruktør med følgende signatur: Point(int, int)samt følgende metoder:

String toString() // returnerer en streng-repræsentation af punktet
boolean equals(Point p) // undersøger om to punkter er ens
public void move(int dx, int dy) // flytter punktet med dx, dy

*/
}
