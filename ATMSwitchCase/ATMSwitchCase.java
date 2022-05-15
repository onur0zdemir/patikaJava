import java.util.Scanner;

public class ATMSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int right = 3, balance = 1500, select, price;
        String userName, password;

        while (right > 0) {
            System.out.print("Name: ");
            userName = in.nextLine();
            System.out.println("Password: ");
            password = in.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Entered");
                System.out.println("1: Deposit\n" + "2: Withdraw\n" + "3: Balance inquiry\n" + "4: Exit");
                System.out.print("Choose: ");
                select = in.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Amount: ");
                        price = in.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.println("Amount: ");
                        price = in.nextInt();
                        if (price > balance) {
                            System.out.println("Balance is not enough!");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Balance: " + balance);
                        break;
                    case 4:
                        System.out.println("Exited");
                        break;
                }
            } else {
                right--;
                System.out.println("Wrong Info!");
                if (right == 0) {
                    System.out.println("Blocked!");
                } else {
                    System.out.println("Remaining: " + right);
                }
            }
        }
    }
}