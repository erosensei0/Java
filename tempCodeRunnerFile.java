import java.util.Scanner;

public class resturent {
    public static void main(String[] args) {
        System.out.println("Welcome to Brampton Hamburgers!");

        for (int i = 0; i < 5; i++) {
            double bill = 0;
            System.out.println("\nMenu:");
            System.out.println("1. Veggie Burger\t\t$5.95");
            System.out.println("2. Deluxe Veggie Burger\t$7.95");
            System.out.println("3. Chicken Burger\t\t$6.45");
            System.out.println("4. Cheese Chicken Burger\t$8.50");
            System.out.println("5. Cheese Bacon Burger\t$9.25");
            System.out.println("6. Deluxe Bacon Burger\t$10.95");
            System.out.println("7. Healthy Organic Burger\t$12.45");
            System.out.println("8. Quit");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("\nPlease select an item (1-8): ");
                int selection = scanner.nextInt();
                if (selection == 8) {
                    break;
                } else if (selection < 1 || selection > 7) {
                    throw new IllegalArgumentException("Invalid selection. Please choose a number between 1 and 8.");
                }

                double price = 0;
                switch (selection) {
                    case 1:
                        price = 5.95;
                        break;
                    case 2:
                        price = 7.95;
                        break;
                    case 3:
                        price = 6.45;
                        break;
                    case 4:
                        price = 8.50;
                        break;
                    case 5:
                        price = 9.25;
                        break;
                    case 6:
                        price = 10.95;
                        break;
                    case 7:
                        price = 12.45;
                        break;
                }

                System.out.print("Please enter the quantity: ");
                int quantity = scanner.nextInt();
                bill += price * quantity;
            }

            bill += bill * 0.13;
            if (bill > 50) {
                bill -= bill * 0.05;
            }
            if (bill > 100) {
                bill -= bill * 0.1;
            }
            System.out.printf("Your bill is $%.2f\n", bill);
        }
    }
}