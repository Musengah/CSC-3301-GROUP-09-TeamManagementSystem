// import some useful libraries
import java.util.Scanner;

public class Main {
    // this is the main method that runs when the project is opened
    public static void main(String[] args) {
        // instantiate two scanner objects, call some useful methods and close the scanners
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        login(welcome(inputOne), inputTwo);
        inputOne.close();
        inputTwo.close();
    }

    // method to welcome the user and recognize their type of privillage
    public static int welcome(Scanner input) {
        // initialize some useful variables
        boolean flag;
        int counter = 0;
        int userOption = 0;
        
        System.out.print("Hello there, Welcome!\n Choose one option to login:\n 1. Admin\n 2. Member\n 3. Help\n Whats your choice? ");
        
        // check if user has entered a valid option otherwise give them 3 attempts
        do {
            if (input.hasNextInt()) {
                userOption = input.nextInt();
                flag = true;
            } else {
                flag = false;
                counter++;

                // check if the user has reached the 3 attempts
                if (counter == 3) {
                    System.out.println("Too many attemps, Try again later!");
                    System.exit(0);
                } else {
                    System.out.print("You entered an invalid option! Try again: ");
                    input.next();
                }
            }
        } while (!(flag));
        
        // return user option
        return userOption;
    }

    // method to handle user login after knowing their privillage type from welcome()
    public static void login(int userOption, Scanner input) {
        // check the type of user trying to login and call the appropriate login method
        switch(userOption) {
            case 1:
                // initialize admin username and pin
                String[] adminUsername = {"Admin"};
                int[] adminPin = {1234};

                userLogin(input, adminUsername, adminPin);
                break;
            case 2:
                // initialize usernames and their pins (Could be improved using Polymorphism)
                String[] memberUsernames = {"Blessings", "Musengah", "Cossam", "Chela", "Mwamba"};
                int[] memberPins = {1234, 1234, 1234, 1234, 1234};

                userLogin(input, memberUsernames, memberPins);
                break;
            case 3:
                System.out.println("Help");
                break;
            default:
                System.out.println("You entered an option that does exist! Try again later...");
                System.exit(0);
        }
    }

    // Method for the user login algorithm
    public static void userLogin(Scanner input, String[] usernames, int[] passwords) {
        // initialize some useful variables
        boolean flag;
        int userOption1 = 0;
        String userOption2 = "";
        int counter = 0;
        boolean userExists = false;
        int totalUsernames = usernames.length;

        // ask the user to enter their username
        System.out.print("Enter your username: ");
        userOption2 += input.nextLine();
        
        for (int i = 0; i < totalUsernames; i++) {
            // check if the user entered a valid username, if true ask for their pin
            if (userOption2.equals(usernames[i])) {
                System.out.print("Enter your pin: ");
                
                // check if they have entered a valid pin (int) 
                do {
                    if (input.hasNextInt()) {
                        userOption1 = input.nextInt();
                        flag = true;
                    } else {
                        flag = false;
                        counter++;
                        
                        // check if the user has exhausted the 3 attempts
                        if (counter == 3) {
                            System.out.println("Too many attemps, Try again next time");
                            System.exit(0);
                        } else {
                            System.out.print("Your entered an invalid pin! Try again: ");
                            input.next();
                        }
                    }
                } while (!(flag));

                // check if the entered password matches with the one stored
                if (userOption1 == passwords[i]) {
                    System.out.printf("Welcome %s :)", usernames[i]);
                } else {
                    System.out.println("The pin you entered is incorrect! Try again later...");
                    System.exit(0);
                }

                // check user existance in database
                userExists = true;
                
            } else if (userOption2.equals("")) { 
                System.out.println("Invalid username! Try again later...");
                System.exit(0);
            } else {
                
            }
        }

        // check if user exists, otherwise exit the program
        if (!userExists) {
            System.out.println("The username you entered does not exist! Try again later...");
            System.exit(0);
        }
                
    }

}
