import java.util.Scanner;
public class ProductMar18 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	int array[]=new int[n];
	for(int i=0;i<n;i++) {
		 array[i]=sc.nextInt();
	}
	int Product;
	int count=0;
	Product=sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			int res=array[i]*array[j];
			if(res==Product) {
				count++;
			}
		}
	
	}
	System.out.println(count);
}
}
