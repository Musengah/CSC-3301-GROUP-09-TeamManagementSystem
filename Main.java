
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        welcome();
    }

    //Just the base of the project.  

    //method that has the login information
    
    public static void welcome() {
       
        Scanner input = new Scanner(System.in);
        boolean flag;
        int counter = 0;
        int userOption = 0;
        
        System.out.println("Hello there, Welcome!\n Choose one option\n 1. Admin\n 2. Member\n 3. Help");
        
        do{
            if(input.hasNextInt()){
                userOption = input.nextInt();
                flag = true;
            }else{
                System.out.print("I do not understand you \n Try again:  ");
                flag = false;
                input.next();
                counter++;
                if(counter == 2){
                    System.out.println("Too many attemps, Try again next time");
                    System.exit(0);
                }
            }
        }while(!(flag));
         switch(userOption){
            case 1:
            admin();
            break;
            case 2:
            member();
            break;
            case 3:
            System.out.println("Help");
            break;
            default:
            System.out.println("You entered an option that does exist ");
            System.out.println();
            System.out.println("Bye");
            System.exit(0);
        }
        
    }
    // Method that has the log in details for the member
    public static void admin() {
        Scanner input = new Scanner(System.in);
        String username = "admin";
        int password = 1234;
        boolean flag;
        int userOption1 = 0;
        String userOption2 = "";
        int counter = 0;

        System.out.print("Enter your username: ");
        userOption2 = input.nextLine().toLowerCase();
        
        switch(userOption2){
            case "admin":
            System.out.print("Enter your pin: ");
            do{
                if(input.hasNextInt()){
                    userOption1 = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    counter++;
                if(counter == 3){
                    System.out.println("Too many attemps, Try again next time");
                    System.exit(0);
                }
                }
            }while(!(flag));
            if(userOption1 == 1234){
                System.out.println("Welcome ADMIN\n Some code is coming here :)");
                //
            }else{
                System.out.println("Pin was incorrect\n Try again next time");
                System.exit(0);
            }
            break;
            case "":
            System.out.println("Password is incorrect\n Password is incorrect");
            System.exit(0);
            break;
            default:
            System.out.println(" incorrect username\n Try again next time ");
            System.exit(0);
            
        }
                
    }
    public static void close() {
        System.out.println();
    }

    public static void member() {
        Scanner input  = new Scanner(System.in);
        boolean flag;
        int counter = 0;
        //member usernames
        String member = "Member";
        String member1 = "Member1";
        String member2 = "Member2";
        String member3 = "Member3";
        String member4 = "Member4";
        String member5 = "Member5";
        String userInput = "";
        //member pins
        int pin = 0000;
        int pin1 = 1111;
        int pin2= 2222;
        int pin3 = 3333;
        int pin4 = 4444;
        int pin5 = 5555;
        int password = 0;


        System.out.print("Enter your user name: ");
        userInput = input.nextLine().toLowerCase();

        switch(userInput){
            case "member":
            System.out.print("Enter your pin member: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin){
                System.out.println("Welcome Member");
            }else{
                System.out.println("Incorrect pin\n Try again next time");
                System.exit(0);
            }
            break;
            case "member1":
            System.out.print("Enter your pin member: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin1){
                System.out.println("Welcome Member");
            }else{
                System.out.println("Incorrect pin\n Try again next time");
                System.exit(0);
            }
            break;
            case "member2":
            System.out.print("Enter your pin member2: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin2){
                System.out.println("Welcome Member2");
            }else{
                System.out.println("Incorrect pin\n Try again next time");
                System.exit(0);
            }
            break;
            case "member3":
            System.out.print("Enter your pin member3: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin3){
                System.out.println("Welcome Member3");
            }else{
                System.out.println("Incorrect pin\n Start again");
                System.exit(0);
            }
            break;
            case "member4":
            System.out.print("Enter your pin member4: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin4){
                System.out.println("Welcome Member4");
            }else{
                System.out.println("Incorrect pin\n Start again");
                System.exit(0);
            }
            break;
            case "member5":
            System.out.print("Enter your pin member5: ");
            do{
                if(input.hasNextInt()){
                    password = input.nextInt();
                    flag = true;
                }else{
                    System.out.print("I do not understand you \n Try again:  ");
                    flag = false;
                    input.next();
                    if(counter == 3){
                        System.out.println("Too many attemps, Try again next time");
                        System.exit(0);
                    }
                }
            }while(!(flag));
            if(password == pin5){
                System.out.println("Welcome Member5");
            }else{
                System.out.println("Incorrect pin\n Start again");
                System.exit(0);
            }
            break;
            default:
            System.out.println("Username does not exist\n try again");
            System.exit(0);
        }

    }

}
