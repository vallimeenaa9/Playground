import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    
    int max_idx;
    if(arr[0]>arr[1])
      max_idx = 0;
    else
      max_idx = 1;
    
    for(int i=0;i<n;i++)
    {
      if(arr[i]>arr[max_idx])
        max_idx = i;
    }
    System.out.println(max_idx);
  }
}