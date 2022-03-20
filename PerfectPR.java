import java.util.*;

public class PerfectPR {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String Input = sc.next();
		int perfect = 1;
		char Input_ch[] = Input.toCharArray();
		try {
			for (int i = 0; i < Input_ch.length; i++) {
				if ((Input_ch[i] != ('P') && (Input_ch[i] != ('R')))||(Input_ch[i] == Input_ch[i + 1])) {
					perfect = 0;
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		if (perfect == 1) {
			System.out.println("perfect");
		} else {
			System.out.println("imperfect");
		}
	}
}
