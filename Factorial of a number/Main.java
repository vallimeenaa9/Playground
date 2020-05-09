import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int factorial = 1;
      for(int temp=1;temp<=n;temp++)
      {
        factorial = factorial*temp;
      }
      System.out.println(factorial);
	}
}