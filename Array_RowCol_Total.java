//This Program was Created for only display the sum of row & columns of the 2D Array
import java.util.Scanner;
class Array_RowCol_Total{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row Size : ");
    int row = sc.nextInt();
    System.out.print("Enter Column Size : ");
    int col = sc.nextInt();
    int Array[][] = new int[row][col];
    int i,j;
    System.out.print("Enter "+row+"x"+col+" Elements ");
    for (i=0;i<row;i++)
      for(j=0;j<col;j++)
        Array[i][j]=sc.nextInt();
    for(i=0;i<row;i++){
      int sum = 0;
       for(j=0;j<col;j++){
         System.out.print(Array[i][j]+"\t");
         sum = sum + Array[i][j];
       }
      System.out.print("="+sum);
    }
    System.out.println("==================================\n");
    for(i=0;i<row;i++){
      int sum = 0;
      for(j=0;j<col;j++){
        sum = sum+Array[j][i];
      }
      System.out.print(sum+"\t");
    }
  }
}
        
