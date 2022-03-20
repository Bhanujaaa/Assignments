import java.util.*;
import java.io.*;
public class arraylist {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);	
	ArrayList<Integer>ar=new ArrayList<Integer>();
		System.out.println("enter number of elements in the list");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ar.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i+=2) {
		try {int temp;
		temp=ar.get(i);
			ar.set(i, ar.get(i+1));
			ar.set(i+1,temp);
			}
		catch(Exception e) {}
		}
		System.out.println(ar);
		
}
}
