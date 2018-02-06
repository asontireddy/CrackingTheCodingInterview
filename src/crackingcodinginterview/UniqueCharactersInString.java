/*
 * Algorithm To Determine If as String has All unique Characters or Not
 */
package crackingcodinginterview;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author asontireddy
 */
public class UniqueCharactersInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(allUniqueCharacters(a));
    }
    static boolean allUniqueCharacters(String a)
    {
        HashMap<Character,Integer> h  = new HashMap<Character,Integer>();
        if(a.length()>128)
            return false;
        else
        {
            for(int i=0;i<a.length();i++)
            {
                if(!h.containsKey(a.charAt(i)))
                {
                    h.put(a.charAt(i),1);
                }
                else
                {
                    return false;
                }
                    
            }
        }
        return true;
        
    }
}
