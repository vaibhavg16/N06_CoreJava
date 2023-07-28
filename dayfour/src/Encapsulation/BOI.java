// program to demonstrate on encapsulation

/* encapsulation achieves a data hiding using private access specifier*/

package Encapsulation;
public class BOI 
{
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinNO;
	
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNO() {
		return pinNO;
	}
	public void setPinNO(int pinNO) {
		this.pinNO = pinNO;
	}
	
	@Override
	public String toString() {
		return "BOI [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNO=" + pinNO
				+ "]";
	}
	
}
