import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int n1 = num%10;
    int n2 = (num%100)/10;
    int n3 = num/100;
    int reverse = (n1*100)+(n2*10)+n3;
    System.out.println(reverse);
  }
}