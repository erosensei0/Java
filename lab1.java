import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Brampton Hamburgers");
            System.out.println("Type of Burger\tPrice");
            System.out.println("1. Veggie Burger\t$5.95");
            System.out.println("2. Deluxe Veggie Burger\t$7.95");
            System.out.println("3. Chicken Burger\t$6.45");
            System.out.println("4. Cheese Chicken Burger\t$8.50");
            System.out.println("5. Cheese Bacon Burger\t$9.25");
            System.out.println("6. Deluxe Bacon Burger\t$10.95");
            System.out.println("7. Healthy Organic Burger\t$12.45");
            System.out.println("8. Quit\n");

            double veggieBurger = 5.95;
            double deluxeVeggieBurger = 7.95;
            double chickenBurger = 6.45;
            double cheeseChickenBurger = 8.50;
            double cheeseBaconBurger = 9.25;
            double deluxeBaconBurger = 10.95;
            double healthyOrganicBurger = 12.45;

            for (int i = 1; i <= 5; i++) {
                System.out.println("Order for customer " + i + ":");
                double totalBill = 0;
                while (true) {
                    System.out.print("Select item from menu (1-8): ");
                    int item = input.nextInt();
                    if (item == 8) {
                        break;
                    } else if (item < 1 || item > 7) {
                        throw new IllegalArgumentException("Invalid selection. Please choose a valid option (1-8)");
                    }

                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    double totalPrice = 0;
                    switch (item) {
                        case 1:
                            totalPrice = veggieBurger * quantity;
                            break;
                        case 2:
                            totalPrice = deluxeVeggieBurger * quantity;
                            break;
                        case 3:
                            totalPrice = chickenBurger * quantity;
                            break;
                        case 4:
                            totalPrice = cheeseChickenBurger * quantity;
                            break;
                        case 5:
                            totalPrice = cheeseBaconBurger * quantity;
                            break;
                        case 6:
                            totalPrice = deluxeBaconBurger * quantity;
                            break;
                        case 7:
                            totalPrice = healthyOrganicBurger * quantity;
                            break;
                    }

                    totalBill += totalPrice;
                }

                totalBill = totalBill + (totalBill * 0.13);

                if (totalBill > 50) {
                    totalBill = totalBill - (totalBill * 0.05);
                }

                if (totalBill > 100) {
                    totalBill = totalBill - (totalBill * 0.10);
                }

                System.out.println("Total bill for customer " + i + ": $" + totalBill);
            }
        }
    }
}
