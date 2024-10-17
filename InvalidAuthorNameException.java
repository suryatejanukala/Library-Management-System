package library_management_system;

public class InvalidAuthorNameException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" You have entered Invalid Author name please enter valid Author name \n  james EFCodd Richie";
	}
}
