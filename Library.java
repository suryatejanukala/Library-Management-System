package library_management_system;

import java.util.ArrayList;
import java.util.Iterator;
public class Library 
{
	private String name;
	private int id;
	private Book b;
	
	private ArrayList<Book> book = new ArrayList<Book>();
	
	//Add Book
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book Added Successfully .....👍👍");
	}
	
	//Display Book
	public void display()
	{
		if(book.isEmpty())
		{
			System.out.println("Books Are not yet Added");
		}
		else
		{
			for(Book b:book)
			{
				b.display();
			}
		}
	}
	
	//SearchBookbasedOnId
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added...");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book Found: "+b.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound == false)
		{
			System.out.println("Book Not found, Invalid Id");
		}
	}
	
	//searchBookBasedOnAuthor
	public void searchBookBasedOnAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet Added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equalsIgnoreCase(author))
				{
					System.out.println("Book Found "+b.getAuthor());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("Book Not Found, Invalid AuthorName");
		}
	}
	
	//updateBookCostBasedOnTitle
	public void updateBookCostBasedOnTitle(String title)
	{
		boolean isUpdated=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle().equalsIgnoreCase(title))
				{
					b.setCost(1000);
					System.out.println("Book Cost Updated");
					isUpdated=true;
				}
			}
		}
		if(isUpdated==false)
		{
			System.out.println("Book is not updated, Invalid Title");
		}
	}
	
	
	//removeBookBasedOnId
	public void removeBookBasedOnId(int id)
	{
		boolean isRemoved=false;
		Iterator<Book> itr = book.iterator();
		if(book.isEmpty())
		{
			System.out.println("No Books");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b = itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Book Removed");
					isRemoved=true;
				}
			}
		}
		if(isRemoved==false)
		{
			System.out.println("Book Not yet Removed, Invalid Id");
		}
	}
	
}
