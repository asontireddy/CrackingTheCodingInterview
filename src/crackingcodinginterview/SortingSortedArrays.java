package crackingcodinginterview;
import java.util.Scanner;

/**
 * Created by aravindkumarreddy on 22/02/18.
 */
public class SortingSortedArrays
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(); //size of the first array
    int n = sc.nextInt(); //size of second array
    int a[] = new int[m];
    int b[] = new int[n];
    int c[] = new int[m+n];
    int i=0,j=0,k=0;
    for(i=0;i<m;i++)
      a[i] = sc.nextInt();
    for( j=0;j<n;j++)
      b[j] = sc.nextInt();
    i=0;j=0;k=0;
    while(i<a.length && j<b.length)
    {
      if(a[i] <= b[j])
        c[k++] = a[i++];
      else
        c[k++] = b[j++];

    }
    while(i<a.length)
      c[k++] = a[i++];
    while(j<b.length)
      c[k++] = b[j++];
    System.out.print("The sorted Array is :");
    for(i=0;i<c.length;i++)
      System.out.print(c[i]+" ");

  }
}
