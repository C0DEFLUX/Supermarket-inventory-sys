import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private ArrayList<Product> inventory;
    private Scanner scanner;
    //Init the arrayList and scanner
    public Main()
    {
        inventory = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    //Main method to start the core functionality of the program
    public static void main(String[] args)
    {
        Main system = new Main();
        system.start();
    }

    public void start()
    {
        int choice;
        do
        {
            System.out.println("\nSupermarket Inventory Management System");
            System.out.println("1. Add Perishable Product");
            System.out.println("2. Add Non-Perishable Product");
            System.out.println("3. Display Product Information");
            System.out.println("4. Restock Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 -> addPerishableProduct();
                case 2 -> addNonPerishableProduct();
                case 3 -> displayProductInfo();
                case 4 -> restockProduct();
                case 5 -> System.out.println("Exiting");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
    //Method to add perishable product via the terminal
    private void addPerishableProduct()
    {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String expiryDate = scanner.nextLine();

        Product perishable = new PerishableProduct(productId, name, price, quantity, expiryDate);

        inventory.add(perishable);
        System.out.println("Perishable product added successfully.");
    }
    //Method to add non-perishable product via the terminal
    private void addNonPerishableProduct()
    {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Warranty Period: ");
        String warrantyPeriod = scanner.nextLine();

        Product nonPerishable = new NonPerishableProduct(productId, name, price, quantity, warrantyPeriod);
        inventory.add(nonPerishable);
        System.out.println("Non-perishable product added successfully.");
    }
    //Method to display the product info
    private void displayProductInfo()
    {
        if (inventory.isEmpty())
        {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\nProduct Information:");
        for (Product product : inventory)
        {
            System.out.println(product.getProductInfo());
        }
    }
    //Method to restock the product
    private void restockProduct()
    {
        System.out.print("Enter Product ID to restock: ");
        String productId = scanner.nextLine();
        Product product = findProductById(productId);

        if (product != null)
        {
            System.out.print("Enter quantity to add: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            product.restock(quantity);
            System.out.println("Product restocked successfully. New quantity: " + product.getQuantity());
        } else
        {
            System.out.println("Product not found.");
        }
    }
    //Method to find a product by the id
    private Product findProductById(String productId)
    {
        for (Product product : inventory)
        {
            if (product.getProductId().equalsIgnoreCase(productId))
            {
                return product;
            }
        }
        return null;
    }
}