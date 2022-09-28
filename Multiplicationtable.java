import java.util.Scanner;
public class Multiplicationtable
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter N value:\n"); 
	int n=s.nextInt();
	System.out.print("Enter M value:");
		int m=s.nextInt();
		
        for(int i=1; i <= m; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}