// make some imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize arrays to store user data
        String[] admins = new String[1];
        String[] members = new String[5];

        login(welcome());
    }

    // method to welcome the user and to know what type of user they are.
    public static int welcome() {
        // instantiate the scanner object and intialize some useful varibales.
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int userOption = 0;
        
        // get what the user wants to do
        while (flag) {
            System.out.println("Hello there, Welcome!");
            System.out.println("Press 1, 2, 3, 4 for admin, member, sign up or help respectively:");
            userOption = input.nextInt();

            if (userOption != 0) {
                flag = false;
            }
        }

        // close objects to avaoid resource leak
        input.close();

        // return the user option
        return userOption;
    }

    // method to login the user
    public static void login(int userOption) {
        // login algorithm (initialize scanner and some useful variables)
        Scanner input = new Scanner(System.in);
        System.out.println("What is your username?");;
        String username = input.nextLine();
        System.out.println("What is your password? ");
        String password = input.nextLine();

        switch (userOption) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:

                break;
        }
    }
}
