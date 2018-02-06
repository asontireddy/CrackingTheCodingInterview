/*
Given 2 strings determine whether they are anagrams or not
*/
package crackingcodinginterview;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author asontireddy
 */
public class Anagrams
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1,s2));
    }
    static boolean isAnagram(String s1, String s2)
    {
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}
