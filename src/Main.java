import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Inventory inventory = new Inventory<>();
        //Inventory<Car> inventory=new Inventory<>();
        Inventory<Vehicle> inventory=new Inventory<>();
        Car car1 = new Car("Mustang","123",78);
        Truck truck1 = new Truck("Ford Truck","345",900);
//        inventory.addToInventory(car1);
//        inventory.addToInventory(truck1);
        System.out.println(car1);
        System.out.println(truck1);

        inventory.removefrominventory("345");


        }

    }
