import java.util.*;
class Holidays {
private String name;
private int day;
private String month;
Holidays(String name,int day, String month){
    this.name=name;
    this.day=day;
    this.month=month;
}
public boolean inSameMonth(Holidays h2){
    if((h2.month==month)){
        return true;
    }
    else{
        return false;
    }
}
public static float avgDate(Holidays[] hday){
    int n=hday.length;
    float s=0;
    for(int i=0;i<n;i++){
        s=s+hday[i].day;
    }
    float avg=(s/n);
    return avg;
}
}
public class Holiday {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Holidays h1=new Holidays("repub",26,"jan");
	Holidays h2=new Holidays("inde",15,"aug");
	
	System.out.println(h1.inSameMonth(h2));
	
	Holidays[] hp = new Holidays[3];
    hp[0] = new Holidays("republic",26,"jan");
    hp[1] = new Holidays("independence",15,"aug");
    hp[2] = new Holidays("Good Friday",15,"april");
    System.out.println(Holidays.avgDate(hp));
    Holidays hnew=new Holidays("indep",4,"july");

}
}
