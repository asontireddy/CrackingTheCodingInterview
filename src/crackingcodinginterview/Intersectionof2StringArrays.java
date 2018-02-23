package crackingcodinginterview;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by aravindkumarreddy on 22/02/18.
 */
public class Intersectionof2StringArrays
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    Map<String,Integer> map = new HashMap<>();
    String arr1[] = str1.split(" ");
    String arr2[] = str2.split(" ");
    for(String s1:arr1)
      map.put(s1,1);
    for(String s1:arr2)
      if(map.containsKey(s1))
        System.out.println(s1);


  }
}
