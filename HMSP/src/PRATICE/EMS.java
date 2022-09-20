package PRATICE;

public class EMS 
{
	public static void main(String[] args)
	{
		EMS E1=new EMS();
		EMS E2=E1;
		System.out.println(E1.equals(E2));
		EMS E3=new EMS();
		EMS E4=new EMS();
		System.out.println(E3.equals(E4));
	}
}
