import java.util.Objects;
import java.util.Scanner;
class GroupNine
{
    public static void main(String[] args)

    {
        login();
        member();
    }
    public static void login()
    {
        System.out.println("Welcome user");
        System.out.println();
        System.out.println();
        System.out.println("For admin login press 1");
        System.out.println("For normal member login press 2");
        System.out.println("For help press 3");
        System.out.println("For signing up press 4");
        Scanner scan = new Scanner(System.in);
        int user_option = scan.nextInt();
        switch (user_option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("If you enter 1 you'll login as an admin " +
                        "If you enter 2 you'll login as a normal member");
        }
        String password = "1234";
        System.out.println("What is your username ");
        String user = scan.nextLine();
        System.out.println("What is your password ");
        String s = scan.next();
        int i = 3;
        while (i>0)
        {
            if (Objects.equals(s, password))
            {
                System.out.println("Welcome team member "+s);
                i =-i;
            }
            else
            {
                System.out.println("Try again");
                i =-1;
            }
        }
    }
    public static void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many members do you want to input in the team ");
        int a = scan.nextInt();
        int s[] = new int[a];
    }
    public static void member()
    {
    }
}
