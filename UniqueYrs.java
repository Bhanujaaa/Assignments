import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class UniqueYrs {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String Paragraph=new String();
	Paragraph=sc.nextLine();
	HashSet<String> Year=new HashSet<String>();
	String strPattern = "\\d{2}-\\d{2}-\\d{4}";
	Pattern pattern = Pattern.compile(strPattern);
    Matcher matcher = pattern.matcher(Paragraph);
    while( matcher.find() ) {
      String s2= matcher.group();
     Year.add(s2.substring(6,10));
    }
    System.out.println(Year.size());
	
}
}
