import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = 1;
      for(int row=1; row<=n; row++)
      {
        for(int col=1; col<=n; col++)
        {
          System.out.print(temp);            
        }
        temp = temp+1;
        System.out.print("\n");
      }
	}
}
