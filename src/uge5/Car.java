package uge5;

public class Car {

    private String color;
    private String licenseplate;
    private String brand;
    //private boolean equalsBoolean = false;

    public Car(String brand, String licenseplate, String color)
    {
        this.color = color;
        this.licenseplate = licenseplate;
        this.brand = brand;
    }

    public String toString()
    {
        return "["+ licenseplate +"] " + color + " " + brand ;
    }

    public boolean equals(Car otherCar){
        return licenseplate.equals(otherCar.licenseplate);
    }

    public boolean alike(Car otherCar){
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
