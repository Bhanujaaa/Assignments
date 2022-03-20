import java.util.*;
import java.io.*;
class InvalidOperator extends Exception{
    public InvalidOperator(String s)
    {   super(s);
    }
}
public class Calculator {
	public static double operation(String operator, int a, int b) {
	       double res=0;
	       try{
	  if (operator.equals("+"))
	    res=a + b;
	  else if (operator.equals("-"))
	    res=a - b;
	    else if(operator.equals("*"))
	    res=a*b;
	    else res= a/b;
	       }
	       catch(ArithmeticException e){
	           System.out.println("divide by zero is not valid");
	           System.exit(0);
	       }
	       return res;
	   }
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] ss=new String[3];
		String s=new String();
		s=sc.nextLine();
		
		try{
	        String[] ss1 =s.split(" ");
	        for(int i=0;i<ss1.length;i++){
	            ss[i]=ss1[i];
	        }
		   Integer.parseInt((ss[0]));
		   Integer.parseInt((ss[2]));
		   if(ss[1].equals("+") || ss[1].equals("-") || ss[1].equals("*") || ss[1].equals("/")){
		    double result= operation(ss[1],Integer.parseInt(ss[0]),Integer.parseInt(ss[2]));
		    System.out.println(result);
		   }
		   else{
		         throw new InvalidOperator("Invalid operator");
		   }
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("invalid equation");
		}
		catch(NumberFormatException e){
		    System.out.println("invalid operand");
		}
		 catch (InvalidOperator ex) {
	            System.out.println(ex.getMessage());
	        }
	catch(NullPointerException e)
	        {
	            System.out.print("NullPointerException Caught");
	        }
		}
}
