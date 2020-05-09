import java.util.Scanner;
class Main{
  public static int greatest(int a, int b)
  {
    int grt;
    if(a>b)
    {
      grt=a;
    }
    else
    {
      grt=b;   
    }
   return grt;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int p = in.nextInt();
      int q = in.nextInt();
      int r = in.nextInt();
      int output = greatest(p,q);
      if(output>r)
        System.out.println(output);
      else
        System.out.println(r);
	}
}