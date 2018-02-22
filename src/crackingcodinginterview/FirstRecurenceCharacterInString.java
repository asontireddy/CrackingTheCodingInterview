package crackingcodinginterview;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by aravindkumarreddy on 22/02/18.
 */
public class FirstRecurenceCharacterInString
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean flag= false;
    Map<Character,Integer> map = new HashMap<>();
    for(int i=0;i<str.length();i++)
    {
      if(!map.containsKey(str.charAt(i)))
        map.put(str.charAt(i),1);
      else
      {
        flag = true;
        break;
      }
    }
    if(flag)
      System.out.println("Recurent Character Exists");
    else
      System.out.println("Recurent Character Doesn't Exists");
  }
}
