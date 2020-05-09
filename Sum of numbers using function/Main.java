import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int sum=0;
    for(int temp=1; temp<=m; temp++)
    {
      sum=sum+temp;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int output = sum(n);
      System.out.println(output);
	}
}