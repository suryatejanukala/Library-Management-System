package library_management_system;

import java.util.Random;

public class Book 
{
	private String title; //java, sql, python
	private int id; 
	private String author; // james, Efcodd, richie
	private int noOfPages; // 200 to 1500
	private int cost; // 200 to 2000
	Random r = new Random();
	public Book(String title, int id, String author, int noOfPages, int cost) 
	{
//		this.title = title
//		this.id = id;
//		this.author = author;
//		this.noOfPages = noOfPages;
//		this.cost = cost;
		if(validateTitle(title))
		{
			this.title = title;
		}
		else
		{
			throw new InvalidTitleException();
		}
		this.id = r.nextInt(123);//Random Id
		if(validateAuthorName(author))
		{
			this.author=author;
		}
		else
		{
			throw new InvalidAuthorNameException();
		}
		if(validatenoOfPages(noOfPages))
		{
			this.noOfPages = noOfPages;
		}
		else
		{
			throw new InvalidNoOfPages();
		}
		if(validateCost(cost))
		{
			this.cost = cost;
		}
		else
		{
			throw new InvalidCostException();
		}
	}
	
	public boolean validateTitle(String title)
	{
		if(title.equalsIgnoreCase("java") || title.equalsIgnoreCase("SQL") || title.equalsIgnoreCase("Python"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validateAuthorName(String author)
	{
		if(author.equalsIgnoreCase("James") || author.equalsIgnoreCase("EFCodd") || author.equalsIgnoreCase("Richie"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validatenoOfPages(int noOfPages)
	{
		if(noOfPages>=200 && noOfPages<=1500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean validateCost(int cost)
	{
		if(cost>=200 && cost<=2000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display()
	{
		System.out.println("Title of the book : "+getTitle());
		System.out.println("Id of the book : "+getId());
		System.out.println("Author of the book : "+getAuthor());
		System.out.println("No of pages : "+getNoOfPages());
		System.out.println("cost of the book : "+getCost());
	}

	@Override
	public String toString() 
	{
		return "Book [title=" + title + "\n id=" + id + "\n author=" + author + "\n noOfPages=" + noOfPages + "\n cost="
				+ cost + "\n------------------------";
	}
	
	
}
