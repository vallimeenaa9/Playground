import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int matrix1[][] = new int[row_size][col_size];
    for(int i=0; i<row_size; i++)
    {
      for(int j=0; j<col_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][col_size];
    for(int i=0; i<row_size; i++)
    {
      for(int j=0; j<col_size; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    int diff[][] = new int[row_size][col_size];
    difference(matrix1, matrix2, diff);
    display(diff);
  }
  
  public static void difference(int matrix1[][], int matrix2[][], int diff[][])
  {
    for(int i=0; i<diff.length; i++)
    {
      for(int j=0; j<diff[i].length; j++)
      {
        diff[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
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