import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year = in.nextInt();
      int year1=year%4;
      int year2=year%100;
      int year3=year%400;
      if(year1==0 && year2==0 && year3==0)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}