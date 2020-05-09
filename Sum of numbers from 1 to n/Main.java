import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      for(int temp = 1; temp<=n; temp++)
      {
        sum = sum + temp;
      }
      System.out.println(sum);
	}
}