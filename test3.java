import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your family's annual income: ");
        double annualIncome = input.nextDouble();
        if (annualIncome < 80000) {
            System.out.println("You are not eligible to get the loan from RPG Loan Providers.");
            System.exit(0);
        }

        System.out.println("RPG LOAN PROVIDERS");
        System.out.println("Loan Type\tInterest Rate");
        System.out.println("1. Home Loan\t4.2%");
        System.out.println("2. Car Loan\t3.9%");
        System.out.println("3. Gold Loan\t5.2%");
        System.out.println("4. Study Loan\t2.8%");
        System.out.println("5. Business Loan\t5.8%");
        System.out.println("6. Exit");

        int[] loans = new int[2];
        double[] loanAmounts = new double[2];
        double[] interestRates = {4.2, 3.9, 5.2, 2.8, 5.8};

        System.out.print("Select at least 2 loans: ");
        for (int i = 0; i < 2; i++) {
            loans[i] = input.nextInt();
            if (loans[i] < 1 || loans[i] > 5) {
                System.out.println("Invalid loan selection. Please choose from the menu.");
                System.exit(0);
            }
        }

        System.out.print("Enter the number of monthly installments (6-60): ");
        int months = input.nextInt();
        if (months < 6 || months > 60) {
            System.out.println("Invalid number of monthly installments. Please enter a value between 6 and 60.");
            System.exit(0);
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the loan amount for loan " + loans[i] + ": ");
            loanAmounts[i] = input.nextDouble();
        }

        double totalLoanAmount = loanAmounts[0] + loanAmounts[1];
        if (totalLoanAmount > 500000) {
            for (int i = 0; i < 2; i++) {
                interestRates[loans[i]-1] -= 0.1;
            }
        }

        double totalInterest = 0;
        for (int i = 0; i < 2; i++) {
            totalInterest += loanAmounts[i] * (interestRates[loans[i]-1] / 100);
        }

        double totalAmountToPay = totalLoanAmount + totalInterest;
        System.out.println("Total loan amount to pay: $" + totalAmountToPay);

        double monthlyInstallment = totalAmountToPay / months;
        System.out.println("Monthly installment amount: $" + monthlyInstallment);
    }
}
