import java.util.Scanner;

public class Problem {
    /*
     * wap to create a class bank account having instance variable balance,
     * implement a method deposit,taking parameter amount, which recieves amount to
     * be
     * deposited to the current balance.
     * implement another method witdraw which ask the user to enter the amount and
     * update the current balance an return the balance.
     * invoke both the method in test bank account
     */
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        int amt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        amt = sc.nextInt();
        b1.deposit(amt);

        System.out.print("Enter amount to withdraw: ");
        amt = sc.nextInt();
        int newBalance = b1.withdraw(amt);
        if (newBalance != -1)
            System.out.println("New balance:" + newBalance);
        else
            System.out.println("Invalid amount");

        sc.close();
    }

    static class BankAccount {
        int balance;

        // methods

        void deposit(int amt) {
            this.balance += amt;
        }

        int withdraw(int amt) {
            if (amt > 0 && amt <= this.balance) {
                this.balance -= amt;
                return this.balance;
            } else {
                System.out.println("Invalid amount");
                return -1;
            }
        }

    }
}
