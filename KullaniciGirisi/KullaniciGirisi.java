import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        int resetPassword;
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("User Name: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Logged in");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Wrong Password!");
            System.out.println("Would you like to reset your password?\n1: Yes\n2: No");

            resetPassword = input.nextInt();

            switch (resetPassword) {
                case 1:
                    System.out.print("Enter new password: " + input.nextLine());
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.println("It can't be the same as the old password!");
                        break;
                    } else {
                        System.out.println("Password has changed.");
                        break;
                    }
                case 2:
                    System.out.println("Password not reset!");
                    break;

            }
        } else {
            System.out.println("Wrong Info!");
        }

    }
}
