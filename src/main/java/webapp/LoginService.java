package webapp;

public class LoginService {

	public boolean isValid(String user, String password)
	{
		//Test usernames we would find from database
		String dummyUserName = "alex";
		String dummyPassword = "conner";
		
		if(user.equals(dummyUserName) && password.equals(dummyPassword))
		{
			return true;
		}
		return false;
	}
}
