import java.util.*;
//import java.io.*;
public class Permutate
{static int factorial(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        return fact;
    }
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=new String();
		input=sc.next();
		int i=0,j=0;
		int n=input.length();
		char[] strArray = input.toCharArray();
		int[] charFreq = new int[256];
		while(i < input.length())
		{
			charFreq[input.charAt(i)]++;
			i++;
		}
		int res;
        int fact=1;
		while(j < 256) {
			if(charFreq[j] != 0) {
				res=factorial(charFreq[j]);	
				fact=fact*res;
			}
			j++;
		}
		int permutations;
         int num=factorial(n);
         permutations=num/fact;
     System.out.println(permutations);
	}
}

// 		HashMap<Character, Integer> charCount= new HashMap<Character, Integer>();
//             for (char c : strArray) {
//             if (charCount.containsKey(c)) {
//                 charCount.put(c, charCount.get(c) + 1);
//             }
//             else {
//                 charCount.put(c, 1);
//             }
//         }
//         int res;
//         int fact=1;
//         for (Map.Entry entry : charCount.entrySet()) {
//             int ie = (Integer) entry.getValue();
//              res=factorial(ie);
//              fact=fact*res;
             
//         }
//         int permutations;
//         int num=factorial(n);
//         permutations=num/fact;
//         System.out.println(permutations);
//     }
// }

