import java.util.Scanner;
class Main 
{
  public static void left_rotate(int n, int arr[], int no_of_rotations)
  {
    int first_even_element_index = 1;
    int last_even_element_index;
    if(n%2==0)
      last_even_element_index = n-1;
    else
      last_even_element_index = n-2;
    
    for(int rot=1; rot<=no_of_rotations; rot++)
    {
      int temp = arr[first_even_element_index];
      for(int i=3; i<n; i=i+2)
        arr[i-2]=arr[i];
      arr[last_even_element_index]=temp;
    }
  }
  
  public static void right_rotate(int n, int arr[], int no_of_rotations)
  {
    int first_odd_element_index = 0;
    int last_odd_element_index;
    if(n%2==1)
      last_odd_element_index=n-1;
    else
      last_odd_element_index=n-2;
    
    for(int rot=1; rot<=no_of_rotations; rot++)
    {
      int temp = arr[last_odd_element_index];
      for(int i=(last_odd_element_index-2); i>=0; i=i-2)
      {
        arr[i+2]=arr[i];
      }
      arr[first_odd_element_index]=temp;
    }
  }
  
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }
    
    int no_of_rotations = in.nextInt();
    left_rotate(n, arr, no_of_rotations);
    right_rotate(n, arr, no_of_rotations);
    
    for(int i=0; i<n; i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
}