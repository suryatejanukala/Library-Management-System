package library_management_system;

public class InvalidTitleException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+" You have entered Invalid Title Please enter valid title \n JAVA SQL PYTHON";
	}
}
