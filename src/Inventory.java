import java.util.ArrayList;

public class Inventory <T extends Vehicle > {
    private ArrayList<T> inventory;

    public Inventory(String model, String vin, int horsepower, ArrayList<T> inventory) {
        super();
        this.inventory = inventory;
    }

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public Inventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public Inventory() {
        super();
    }

    public void addToInventory(T Vehicle) {
    Inventory.add(Vehicle);
    }

    private static <T> void add(T vehicle) {
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                '}';
    }
}
