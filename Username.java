import java.util.Scanner;
public class username 
{
    public static void main(String args[])
    {
        String username1 , username2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username1 = s.nextLine();
        System.out.print("Reneter username:");
        username2 = s.nextLine();
        if(username1.equals(username2))
        {
            System.out.println("Username Is Valid");
        }
        else
        {
            System.out.println("Username Is InValid");
        }
    }
}
