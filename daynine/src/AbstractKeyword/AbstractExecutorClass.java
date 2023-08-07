package AbstractKeyword;
// driver class
// program to demostrate
public class AbstractExecutorClass {

	public static void main(String[] args) {
		// we cant create obj for abstract class
		// Sandwich s=new Sandwich();
		CheeseCornSandwich s=new CheeseCornSandwich();
		s.prepare();
		s.showReceipe();

	}

}
