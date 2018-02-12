import java.util.Scanner;

public class StringCompression 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb= new StringBuilder("");
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			count++;
			if(i+1 >= s.length()||s.charAt(i)!=s.charAt(i+1))
			{
				sb.append(s.charAt(i));
				sb.append(count);
				count=0;
			}	
		}
		if(sb.toString().length()<s.length())
			System.out.println(sb.toString());
		else
			System.out.println(s);
	}
}
