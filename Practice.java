import java.util.Scanner;
class Group9
{
  public static void main(String[] args) 
  {
    l
  }
  void login() 
  {
    System.out.println("Welcome user");
    System.out.println();
    System.out.println();
    System.out.println("For admin login press 1");
    System.out.println("For normal member login press 2");
    System.out.println("For help press 3");
    System.out.println("For signing up press 4");
  }
  public void input()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many members do you want to input in the team ");
    int a = scan.nextInt();
    int s[] = new int[a];
  }
  public void member()
  {
    Scanner scan = new Scanner(System.in);
    String password = "Wsegg35%j8";
    System.out.println("What is your username ");
    String user = scan.nextLine();
    System.out.println("What is your password ");
    String s = scan.nextLine();
    int i = 3;
    while (i>0)
    {
      if(s==password)
      {
        System.out.println("Welcome team member "+user);
        i=-i;
      }
      

    }
  }
}