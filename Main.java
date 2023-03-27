// make some imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(welcome());
    }

    public static int welcome() {
        // instantiate the scanner object and intialize some useful varibales
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

        return userOption;
    }

    public void login() {
        
    }
}
