import java.util.Scanner;
class Main{
  public static int power(int base, int exponent)
  {
    int answer = 1;
    for(int x=1; x<=exponent; x++)
    {
      answer=answer*base;
    }
    return answer;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      int output = power(b,e);
      System.out.println(output);
	}
}
