package Interface;

public class Human implements ColdDrinks,AlcoholDrinks 
{
	@Override
	public void showDrink() 
	{
		System.out.println(colddrinkName+"\n"+AlcoholType+"\n"+Brand);	
	}
}
