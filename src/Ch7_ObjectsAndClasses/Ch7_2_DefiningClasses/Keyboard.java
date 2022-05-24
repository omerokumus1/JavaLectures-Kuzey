package Ch7_ObjectsAndClasses.Ch7_2_DefiningClasses;

public class Keyboard {
    // Properties - Data field
    String brand = "unknown";
    String model;
    String color;
    double price;

    // Constructor
    public Keyboard() {
        brand = "Unknown";
        model = "Unknown";
        color = "Unknown";
        price = -1;
    }

    public Keyboard(String kbBrand, String kbModel, String kbColor, double kbPrice) {
        brand = kbBrand;
        model = kbModel;
        color = kbColor;
        price = kbPrice;
    }

    public Keyboard(String brand, String model) {
        this.brand = brand;

    }


    // Methods
    public void discount(double percentage) {
        price = price - price * percentage;
    }

    public void discount(int amount) {
        price -= amount;
    }



}
