package test1;
public class ValidateMar22 {
	String ipad;
	ValidateMar22(){
		
	}
	public boolean ValidateIpv4Address(String ip){
		String IP[]=ip.split("[.]",0);
		try {
		if(Integer.parseInt(IP[3])==255 || Integer.parseInt(IP[3])==0)
			return false;
		else 
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
