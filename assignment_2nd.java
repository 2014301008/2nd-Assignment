import java.util.*;
public class assignment_2nd {

	public static void main(String[] args) {
	
		String str,del,mod;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Give me a sentence : " );
		str = sc.nextLine();
		System.out.print("Give me a characters to delete : " );
		del = sc.nextLine();
		System.out.println("Original sentence : " + str );
		mod = str;
		for(int i=0;i<del.length();i++)
		{
		   mod = mod.replace(""+del.charAt(i), "");
		}
		
		System.out.println("Modified sentence : " + mod);
		
		

	}

}
