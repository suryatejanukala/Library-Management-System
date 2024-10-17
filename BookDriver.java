package library_management_system;

import java.util.Scanner;

public class BookDriver 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice: \n 1.AddBook \n 2.Display book  \n 3.Search book based on id \n 4.Search book based on Author \n 5.Update book cost based on title \n 6.remove book based on Id \n 7.Exit");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
				{
					System.out.println("Enter the Book Title");
					String title = sc.next();
					System.out.println("Enter the Book Id");
					int id = sc.nextInt();
					System.out.println("Enter The Book Author");
					String author = sc.next();
					System.out.println("Enter the No of pages");
					int pages = sc.nextInt();
					System.out.println("Enter the cost");
					int cost = sc.nextInt();
					l.addBook(new Book(title, id, author, pages, cost));
				}
				break;
				case 2:
				{
					l.display();
				}
				break;
				case 3:
				{
					System.out.println("Enter the Id");
					int id = sc.nextInt();
					l.searchBookBasedOnId(id);
				}
				break;
				case 4:
				{
					System.out.println("Enter Author");
					String author = sc.next();
					l.searchBookBasedOnAuthor(author);
				}
				break;
				case 5:
				{
					System.out.println("Enter title");
					String title = sc.next();
					l.updateBookCostBasedOnTitle(title);
				}
				break;
				case 6:
				{
					System.out.println("Enter the id");
					int id = sc.nextInt();
					l.removeBookBasedOnId(id);
				}
				break;
				case 7:
				{
					start = false;
					System.out.println("Thank you......");
				}
				break;
				default:
				{
					System.out.println("Please Enter Valid Choice");
				}
			}
		}
	}
}
