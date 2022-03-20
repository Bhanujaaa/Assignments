import java.util.*;

public class Anagram {
	static int count = 0;
	static int cou;

	public static int anagram(String b, String snew) {
		if (b.length() != snew.length()) {
			count = count + 0;
			return count;
		} else {
			char[] c1 = b.toCharArray();
			char[] c2 = snew.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean res = Arrays.equals(c1, c2);
			int r;
			if (res) {
				r = 1;
			} else {
				r = 0;
			}
			count = count + r;
			return count;
		}
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string");
		String b = s1.nextLine();
		System.out.println("enter number of test cases and the cases that is needed to be checked");
		int n = s1.nextInt();
		String[] st = new String[n];
		for (int i = 0; i < n; i++) {
			String s = s1.next();
			st[i] = s;
		}
		for(int j=0;j<n;j++){
		    cou=anagram(b,st[j]);
		   
		}
		 System.out.println(cou);
	}
	}


