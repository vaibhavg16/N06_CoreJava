package Interface;
public class InterfaceExecutor 
{
	public static void main(String[] args) 
	{
		// we cant instantiate an interface
		//Sony s=new Sony();
		
		SonyTV s1=new SonyTV();
		
		s1.display();
		s1.show();
		Sony.accept();
		
		ISRO i=new ISRO();
		
		i.status();
		
		Human h=new Human();
		h.showDrink();
	}

}
