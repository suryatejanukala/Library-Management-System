package library_management_system;

public class InvalidCostException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+"You have entered invalid cost please enter the cost in between the given range 200 to 2000";
	}
}
