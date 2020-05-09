import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<size; i++)
      {
        arr[i] = in.nextInt();
      }
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      int index1 = -1;
      int index2 = -1;
      for(int i=0; i<size; i++)
      {
        if(arr[i]==search1)
          index1 = i;
        if(arr[i]==search2)
          index2 = i;
      }
      System.out.println(index1);
      System.out.println(index2);
    }
}