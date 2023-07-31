package InstanceOf;

class RBI
{
	protected String ifscCode;
	
}
class SBI extends RBI
{
	public SBI() 
	{
		super.ifscCode="RBISONGPA01";
		String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		/* if parent child class and child class having same variable name ,
		 *  in such case,use super.variablename to access  variable of parent class inside the child class
		*/
		System.out.println(super.ifscCode);
	}
	
}
public class InstanceOfDemo 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
	}
}
