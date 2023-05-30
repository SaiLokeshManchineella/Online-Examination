import java.util.Scanner;

public class MCQTest {
    private static String username = "nihith";
    private static String password = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;
        int option;

        do {
            System.out.println("Welcome to MCQ Test System!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter your username: ");
                    String inputUsername = sc.next();
                    System.out.print("Enter your password: ");
                    String inputPassword = sc.next();

                    if (inputUsername.equals(username) && inputPassword.equals(password)) {
                        System.out.println("Login successful!");
                        loggedIn = true;

                        int choice;
                        do {
                            System.out.println("1. Update Profile and Password");
                            System.out.println("2. Selecting answers for MCQs");
                            System.out.println("3. Timer and auto submit");
                            System.out.println("4. Closing session and Logout");
                            System.out.print("Enter your choice: ");
                            choice = sc.nextInt();

                            switch (choice) {
                                case 1:
                                    System.out.print("Enter your new username: ");
                                    username = sc.next();
                                    System.out.print("Enter your new password: ");
                                    password = sc.next();
                                    System.out.println("Profile and password updated successfully!");
                                    break;
                                case 2:
                                    System.out.println("Selecting answers for MCQs...");
                                    break;
                                case 3:
                                    System.out.println("Timer and auto submit...");
                                    break;
                                case 4:
                                    loggedIn = false;
                                    System.out.println("Session closed and logged out successfully!");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Try again!");
                            }
                        } while (loggedIn);
                    } else {
                        System.out.println("Incorrect username or password. Try again!");
                    }
                    break;
                case 2:
                    System.out.println("Exiting MCQ Test System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        } while (option != 2);
    }
}
