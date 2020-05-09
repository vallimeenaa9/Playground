import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      for(int temp = n; temp>0; temp=temp/10)
      {
        int last = temp%10;
        sum = sum + (last*last*last);
      }
      if(sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}