/*
 * Replace All Spaces In a string with %20
 */
package crackingcodinginterview;
import java.util.Scanner;
/**
 *
 * @author asontireddy
 */
public class ReplaceAllSpacesInString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(replaceAllSpaces(in));
    }
    static String replaceAllSpaces(String s)
    {
        int spaces = 0;
        char a [] = s.toCharArray();
        for(int i=0;i<a.length;i++)
            if(a[i]==' ')
                spaces++;
        char b[] = new char[a.length+spaces*3];
        int i=0;
        for(char k : a)
        {
            if(k==' ')
            {
                b[i++] = '%';
                b[i++] = '2';
                b[i++] = '0';
            }
            else
                b[i++] = k;
        }
       return String.valueOf(b);
    }
}
