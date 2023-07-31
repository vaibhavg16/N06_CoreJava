// program to demonstrate on: 
// this keyword is used to refer current instance of the class
package ThisKeyword;

class account
{
	long accno;
	
	void setdata(long accno)
	{
		this.accno=accno;
	}
	void display()
	{
		System.out.println(accno);
	}
}
// driver class
public class ThisKeywordDemo1 
{
	public static void main(String[] args) 
	{
		account a=new account();
		a.setdata(65264653L);
		a.display();

	}

}
