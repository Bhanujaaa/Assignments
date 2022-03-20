import java.util.Scanner;
public class PalindromeMarch18 {
	public static boolean Palindrome(String Input) {
		int p1=0;
		int p2=Input.length()-1;
		if(Input.length()==1) {
			return true;
		}
		while(p1<=p2) {
		if(Input.charAt(p1)!=Input.charAt(p2)) {
			return false;
		}
		p2-=1;
		p1+=1;
		
		}
		return true;
		
}
	static int NoOfAppends(String s)
	{
	    if (Palindrome(s))
	        return 0;
	    s=s.substring(1);
	 return 1 + NoOfAppends(s);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String Input=sc.nextLine();
		if(!Palindrome(Input)) {
			String st=Input.substring(0,NoOfAppends(Input));
			StringBuilder sb=new StringBuilder(st);
			System.out.println(Input+sb.reverse());
		}
	}
}