// Program to demonstrate on default and parameterised constructor.
package OOPs_concepts;
//class decl
public class Library 
{
public long NoOfBooks;
public String authorName;
public String BookName;
public double Price;


public Library() 
{
System.out.println("this is default contructor");
}
// Parameterized Constructor:
public Library(long noOfBooks, String authorName, String bookName, double price) 
{
	super();
	this.NoOfBooks = noOfBooks;
	this.authorName = authorName;
	this.BookName = bookName;
	this.Price = price;
	System.out.println("this is Parameterized Constructor:");	
}
@Override
public String toString() 
{
	return "Library [NoOfBooks=" + NoOfBooks + ", authorName=" + authorName + ", BookName=" + BookName + ", Price=" + Price + "]";
}
}
