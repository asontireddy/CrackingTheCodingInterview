package crackingcodinginterview;
import java.util.Scanner;
/**
 * Created by aravindkumarreddy on 22/02/18.
 */
public class SortingBinaryNumbers
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(); //Length of array
    int a[] = new int[2];
    for(int i=0;i<m;i++)
    {
      int b = sc.nextInt();
      a[b] = a[b]+1;
    }
    for(int i=0;i<a[0];i++)
    {
      System.out.print("0");
    }
    for(int i=0;i<a[1];i++)
    {
      System.out.print("1");
    }


  }
}
