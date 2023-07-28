// demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.*;
public class Faculty {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="BHUJBAL LIBRARY";
		l.displayPublic();
		
		/* UserId and displayPrivate() method is private, so we can't 
		 * access into another package or class, only we can access in same class */
		
		// l.userID=1234;
		// l.displayPrivate();
	
		/* booksName and displayDefault() method is default,
		 * we can't access into another package, only we can access
		 * it within the same package */
		
		// l.booksName;
		// l.displayDefault();
	}

}
