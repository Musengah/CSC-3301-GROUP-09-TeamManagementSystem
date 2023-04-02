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
        
        System.out.print("************ Hello there, Welcome to Team Manager ************\n Choose one option to login:\n 1. Manager\n 2. Member\n 3. Help\n Whats your choice? ");
        
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
        // initialize usernames and their pins (Could be improved using Polymorphism)
        String[] memberUsernames = {"Manager", "Blessings", "Musengah", "Cossam", "Chela", "Mwamba"};
        String[] tasks = new String[5];
        int[] memberPins = {1234, 1234, 1234, 1234, 1234, 1234};

        // check the type of user trying to login and call the appropriate login method
        switch (userOption) {
            case 1:
                userLogin(input, memberUsernames, memberPins, tasks);
                break;
            case 2:
                userLogin(input, memberUsernames, memberPins, tasks);
                break;
            case 3:
                help();
                break;
            default:
                System.out.println("You entered an option that does exist! Try again later...");
                System.exit(0);
        }
    }

    // Method for the user login algorithm
    public static void userLogin(Scanner input, String[] usernames, int[] passwords, String[] tasks) {
        // initialize some useful variables
        boolean flag = false;
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
                        
                        // give the user three pin attempts
                        if (userOption1 == passwords[i]) {
                            flag = true;
                        } else {
                            // increase counter to keep track of attempts
                            counter++;
                        
                            // check if the user has exhausted the 3 attempts
                            if (counter == 3) {
                                System.out.println("Too many attemps, Try again next time");
                                System.exit(0);
                            } else {
                                System.out.print("Your entered an invalid pin! Try again: ");
                            }
                        }

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
                    System.out.printf("\n************ Welcome %s ************", usernames[i]);

                    // instantiate scanner object and call appropriate methods for post user login functionality
                    Scanner inputThree = new Scanner(System.in);
                    String currentUser = usernames[i];
                    postLogin(userMenu(inputThree, currentUser), usernames, currentUser, tasks);
                    inputThree.close();
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

    // method for functionality after user is signed in
    public static void postLogin(int userOption, String[] usernames, String currentUser, String[] tasks) {
        // instatiate Scanner and initialize variables
        Scanner inputFour = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        String proceed = "n";
        String askForTask = "y";
        
        switch (userOption) {
            case 1:
                // check if current user is a Manager or ordinary team member
                if (currentUser == "Manager") {
                    System.out.println("\n************ Assign Members Tasks ************");

                    while (flag) {
                        // ask manager to assign members tasks they can pick from (Max = 5)
                        if (count != 5) {
                            System.out.print("What task do you want to assign your team? ");
                            String task = inputFour.nextLine();
                            tasks[count] = task;

                            // check if user has reached 5 tasks and terminate loop
                            if (count == 4) askForTask = "n";
                            
                        } else {
                            flag = false;
                        }

                        // check if user has reached 5 tasks
                        if (askForTask != "n") {
                            System.out.print("\nAdd another task? (y/n): ");
                            proceed = inputFour.nextLine();
                        }

                        // check if user does not want to add tasks
                        if (!proceed.equals("y")) {
                            flag = false;
                        }

                        // increase count to limit manager to only 5 tasks
                        count++;
                    }

                } else {
                    // output tasks for team members so that they can pick what they can do
                    System.out.println("\n************ Pick One Task From The List ************");

                    if (tasks[0] == null) {
                        System.out.println("There are no tasks to do yet, check back later!");
                    } else {
                        for (String task: tasks) {
                            System.out.println(task);
                        }
                    }

                }

                break;
            case 2:
                // check if the current user is a team manager or not and customize output accondingly
                if (currentUser == "Admin") {
                    System.out.println("\nHere is your team to manage: ");
                } else {
                    System.out.println("\nHere are your teammates: ");
                }

                // output team members and skip session user and Manager
                for (String username : usernames) {
                    if (username.equals(currentUser) || username.equals("Manager")) {
                        continue;
                    }
                    System.out.println(username);
                }

                break;
            case 3:
                System.out.println("You have succefully been logged out, see you soon!");
                System.exit(0);
            default:
                System.out.println("You entered an option that does exist! you have been logged ou, try again later...");
                System.exit(0);
        }

        // close Scanner to avoid resource leak
        inputFour.close();
    }

    // method for post login user menu
    public static int userMenu(Scanner input, String currentUser) {        
        // initialize some useful variables
        boolean flag = false;
        int userOption = 0;

        // view team members, view tasks, logout and menu customization based on user privillage
        if (currentUser.equals("Manager")) {
            System.out.print("\nHere is your menu:\n 1. Assign your team some tasks\n 2. View your team\n 3. logout\n Whats your choice? ");            
        } else {
            System.out.print("\nHere is your menu:\n 1. View assigned tasks\n 2. View teammates\n 3. logout\n Whats your choice? ");
        }

        // check if user has entered a valid option
        do {
            if (input.hasNextInt()) {
                userOption = input.nextInt();
                
                // check if the option is on the menu
                if (userOption == 1 || userOption == 2 || userOption == 3) {
                    flag = true;
                } else {
                    System.out.print("You entered an invalid option! Try again: ");
                }

            } else {
                flag = false;
                System.out.print("You entered an invalid option! Try again: ");
                input.next();
            }
        } while (!(flag));
        
        // return user option
        return userOption;
    }

    // method for the help menu
    public static void help() {
        // tackle some FAQ's, more can be added of course
        System.out.println("\n************ Welcome to the help Menu ************");
        System.out.println("Here are some of the frequently asked questions (FAQ's): ");
        System.out.println("What is this program used for? ");
        System.out.println("Team Manager is a program used to manage small teams, usually 5, and enable them to work efficiently.");
    }

}
