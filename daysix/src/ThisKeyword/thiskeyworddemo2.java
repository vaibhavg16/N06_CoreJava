package ThisKeyword;
class Bank
{
	long accno;
	
	Bank(long accno)
	{
		accno=accno;
		System.out.println(accno);
	}
	void display()
	{
		System.out.println(accno);
	}
}
public class thiskeyworddemo2 {

	public static void main(String[] args) {
		Bank b=new Bank(64613163);
		b.display();

	}

}
