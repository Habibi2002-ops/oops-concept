import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    protected double mileage; 
    protected double price;   

    public Vehicle(double mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Vehicle Mileage: " + mileage + " km/l");
        System.out.println("Vehicle Price: " + price + " currency units");
    }
}

class Car extends Vehicle {
    protected double ownershipCost; 
    protected int warranty;          
    protected int seatingCapacity;  
    protected String fuelType;       

    public Car(double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ownership Cost: " + ownershipCost + " currency units");
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity + " seats");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Maruthi extends Car {
    private String modelType; 

    public Maruthi(double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model Type: " + modelType);
    }
}

public class Cars{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Maruthi> maruthiCars = new ArrayList<>();

        System.out.print("Enter the number of Maruthi cars: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for Maruthi car " + (i + 1) + ":");
            System.out.print("Enter mileage (km/l): ");
            double mileage = scanner.nextDouble();
            System.out.print("Enter price (currency units): ");
            double price = scanner.nextDouble();
            System.out.print("Enter ownership cost (currency units): ");
            double ownershipCost = scanner.nextDouble();
            System.out.print("Enter warranty (years): ");
            int warranty = scanner.nextInt();
            System.out.print("Enter seating capacity: ");
            int seatingCapacity = scanner.nextInt();
            System.out.print("Enter fuel type (diesel/petrol): ");
            String fuelType = scanner.next();
            System.out.print("Enter model type: ");
            String modelType = scanner.next();

            Maruthi car = new Maruthi(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType, modelType);
            maruthiCars.add(car);
        }

        System.out.println("\nDetails of Maruthi Cars:");
        for (Maruthi car : maruthiCars) {
            System.out.println("\nCar Details:");
            car.displayInfo();
        }

        scanner.close();
    }
}