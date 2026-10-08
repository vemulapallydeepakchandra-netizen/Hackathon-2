import java.util.Scanner;
public class Bank {
String accountNumber;
String accountHolderName;
 double balance;
Bank(String accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolderName = accHolder;
        balance = bal;
    }
void deposit (double amount) {
balance += amount;
        System.out.println("Deposited: " + amount);
    }
void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
}
double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}

 class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initBalance = sc.nextDouble();

        // Create account object
        Bank account = new Bank(accNum, accHolder, initBalance);

        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final details
        account.displayAccount();

        sc.close();
}




}