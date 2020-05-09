import java.util.Scanner;
class Main{
  public static int square(int m)
  {
    int result = m*m;
    return result;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int output = square(n);
      System.out.println(output);
	}
}