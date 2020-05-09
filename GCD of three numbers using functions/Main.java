import java.util.Scanner;
class Main
{
  public static int gcd(int p, int q)
  {
    int min; 
    int gcd=0;
    if(p<q)
      min=p;
    else
      min=q;
    while(min>=1)
    {
      if(p%min==0 && q%min==0)
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int output = gcd(a,b);
      int result = gcd(output,c);
      System.out.println(result);
	}
}