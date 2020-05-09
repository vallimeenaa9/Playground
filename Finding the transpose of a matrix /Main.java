import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int matrix[][] = new int[row][col];
    int transpose[][] = new int[row][col]; 
    for(int i=0; i<row; i++)
    {
      for(int j=0; j<col; j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }
    for(int i=0; i<matrix.length; i++)
    {
      for(int j=0; j<matrix[i].length; j++)
      {
        transpose[j][i] = matrix[i][j];
      }
    }
    display(transpose);
  }
  
  public static void display(int matrix[][])
  {
    for(int i=0; i<matrix.length; i++)
    {
      for(int j=0; j<matrix[i].length; j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}