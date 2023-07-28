package Encapsulation;

public class EncapsulationExecuter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			BOI b=new BOI();
			b.setAccType("Saving Account");
			b.setAccountNo(8080231458L);
			b.setAtmCardNo(459502888956L);
			b.setPinNO(1245);
		
			System.out.println("Account no. is:"+b.getAccountNo());
			
			System.out.println(b); // this will call  toString() method
			
			
	}

}
