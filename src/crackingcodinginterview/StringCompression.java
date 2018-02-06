/*
 *Program to implement Strinbg Compression 
 * ex :aabcccccaaa--->a2b1c5a3
 * if compressed string length > original return original 
 * else return compressed
 */
package crackingcodinginterview;
import java.util.*;

/**
 *
 * @author asontireddy
 */
public class StringCompression 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compressedString(s));
    }
    private static String compressedString(String s)
    {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        StringBuilder sb = new StringBuilder("");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
        Map.Entry pair = (Map.Entry)it.next();
        sb.append(pair.getKey());
        sb.append(pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
        }  
        if(sb.toString().length()>=s.length())
            return s;
        else
            return sb.toString();
        
    }
}
