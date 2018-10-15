package uge6;

public class Car2 {
    private static int counter = 1;
    private int regNo = 0;
    private static int nextRegno;
    private String color;
    private String licenseplate;
    private String brand;


    public Car2(String brand, String licenseplate, String color)
    {
        this.color = color;
        this.licenseplate = licenseplate;
        this.brand = brand;
        this.regNo = getNextRegno();
        counter++;
    }

    public int getRegno(){
        return regNo;
    }
    public static int getNextRegno(){

        nextRegno = counter;
        return nextRegno;
    }

    public String toString()
    {
        return "["+ licenseplate +"] " + color + " " + brand ;
    }

    public boolean equals(Car2 otherCar){
        return licenseplate.equals(otherCar.licenseplate);
    }

    public boolean alike(Car2 otherCar){
        return brand.equals(otherCar.brand) && color.equals(otherCar.color);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getLicenseplate() {
        return licenseplate;
    }
    public void setLicenseplate(String licensPlate) {
        this.licenseplate = licensPlate;
    }


    /*Klassen fra opgaven i sidste uge skal revideres, således at hver bil i registret
     desuden har et unikt og fortløbende serienummer f.eks. 17. Fælles for alle biler i registret er
    en tæller, der angiver det senest udleverede serienummer. Fælles for hele registret
    er, at man kan få oplyst det næste ledige serienummer.

Lav en klasse Car2, der repræsenterer bilens oplysninger og har metoder til
at udføre operationer, som angivet i sidste uge og ovenfor. Klassen skal have en
 konstruktør med samme signatur som i opgave 20, (men kroppen skal modificeres). Desuden skal implementeres*/
    /*getRegno() getNextRegno()*/
}
