import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int temp = 1; temp<=n; temp++)
    {
      System.out.print("*");
      System.out.print("\n");
    }
    
  }
}