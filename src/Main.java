import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory<>();
        Car car1 = new Car("Honda","123",78);
        Truck truck1 = new Truck("BMW","345",900);
        inventory.addToInventory(car1);
        inventory.addToInventory(truck1);
        System.out.println(inventory.getInventory());
        }

    }
