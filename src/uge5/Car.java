package uge5;

public class Car {

    private String color;
    private String licensPlate;
    private String brand;
    //private boolean equalsBoolean = false;

    public Car(String color, String licensPlate, String brand)
    {
        this.color = color;
        this.licensPlate = licensPlate;
        this.brand = brand;
    }

    public String toString()
    {
        return "["+ licensPlate +"]" + color + brand;
    }
    public boolean equals(Car otherCar)
    {   if (licensPlate.contentEquals(otherCar.licensPlate)) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean alike(Car otherCar){
        if (color.contentEquals(otherCar.color)){
            return true;
        }
        else {
            return false;
        }
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

    public String getLicensPlate() {
        return licensPlate;
    }

    public void setLicensPlate(String licensPlate) {
        this.licensPlate = licensPlate;
    }

    /*    Hver bil i et register har følgende data:
            1. mærke, f.eks. ‘Citroën’
            2. nummerplade, f.eks. ‘SV 27698’
            3. farve, f.eks. ‘rød’
    Hvis man har en bil i registret, skal kan man kunne:
            1. Formatere oplysningerne som en tegnstreng. (Lav en toString() metode.)
            2. Undersøge om den er af samme mærke og farve som en anden given bil.
            3. Undersøge om bilen er den samme som en anden bil.
    Spm. 1: Lav en klasse Car, der repræsenterer oplysninger om en bil og har metoder til ovenstående.
    Klassen skal have navnet Car og metoderne:
    toString(): Returnerer en String på formen: "[SV 27698] rød Citroën"

    equals(Car otherCar): Returnerer en boolean der er true hvis nummerpladen er den samme - ellers false

    alike(Car otherCar): Returnerer en boolean der er true hvis mærket og farven er den samme - ellers false

    Desuden skal implementeres getters og setters til alle 3 attributter - get/set brand, licenseplate, color.*/
}
