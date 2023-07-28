// demonstrate on access specifier
package in.bkcmet.library;

public class Library 
{
	//different acces specifiers
	public String libraryName;
	private long userID;
	String booksName;
	
	public void displayPublic()
	{
		System.out.println("Library Name: "+libraryName);
	}
	public void displayPrivate()
	{
		System.out.println("User ID is: "+userID);
	}
	public void displayDefault()
	{
		System.out.println("Books Name"+booksName);
	}
	
}
