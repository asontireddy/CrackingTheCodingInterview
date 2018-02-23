package crackingcodinginterview;
import java.util.Scanner;
/**
 * Created by aravindkumarreddy on 22/02/18.
 */
public class MissingElementInArray
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//have number oif elemnets in array
    int a[]= new int[n];
    for(int i=0;i<n-1;i++)
      a[i] = sc.nextInt();
    int actualsum = (n*(n+1))/2;
    int sum =0;
    for(int i=0;i<n;i++)
      sum = sum + a[i];
    System.out.println("Missing Number  is " + (actualsum-sum));
  }
}
