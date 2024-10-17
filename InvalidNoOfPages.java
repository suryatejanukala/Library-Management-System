package library_management_system;

public class InvalidNoOfPages extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" You have entered invalid no of pages please enter valid no of pages between 200 to 1500";
	}
}
