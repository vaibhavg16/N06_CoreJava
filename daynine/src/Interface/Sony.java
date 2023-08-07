package Interface;
// prog to demonstarte interface
public interface Sony 
{
	/* by default all the variables inside an interface is public static final
     */
	int noOfChannels = 6;
	 // this is abst. mthd
	void display();
	// java 8 provides a static and default method inside an interface
	//static method
	static void accept()
	{
		System.out.println("Static method");
	}
	// default method
	default void show()
	{
		System.out.println("Default method");
	}
	
}
