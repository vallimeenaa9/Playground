import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for(int count=1; count<=n;)
      {
        if(num%2 == 1)
        {
          System.out.println(num);
          count+=1;
        }
        num+=1;
      }
	}
}