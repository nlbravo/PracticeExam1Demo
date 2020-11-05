import java.util.ArrayList;

/**
 * 
 */

/**
 * @author ninib
 *
 */
public class BaseBallDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrayLists to hold the playeres for each league
		ArrayList<TeeBallPlayer> TBPlayers = new ArrayList<TeeBallPlayer>();
		ArrayList<LittleLeaguePlayer> LLPlayers = new ArrayList<LittleLeaguePlayer>();
		ArrayList<JuniorVarsityPlayer> JVPlayers = new ArrayList<JuniorVarsityPlayer>();
		
		String name, age, position = null, jerseyNumber = null, repeat = "";

		do
		{
			//prompt
			System.out.print("Name: " );
			name = keyboard.nextLine();
			
			try
			{
				
			}
			catch(AgeException e) //catch the Age Exception
			{
				System.out.println(e.getMessage());
			}
			
			System.out.print("Would you like to enter another player? (Y/N): ");
			repeat = keyboard.nextLine();
			
		}while(repeat.equalsIgnoreCase("y"));
	}

	public static boolean validAge(String age) throws AgeException
	{
		//check for the conditions and throw an exception
		if(Integer.parseInt(age) < 5 || Integer.parseInt(age) > 15)
		{
			throw new AgeException("Age must be between 5 and 15 years old");
		}
		return true;
	}
	
	public static boolean validJersey(String jerseyNumber) throws JerseyNumberException
	{
		if(Integer.parseInt(jerseyNumber) < 0 || Integer.parseInt(jerseyNumber) > 99)
		{
			throw new JerseyNumberException("Jersey Number is invalid");
		}
		return true;
	}
	
	public static boolean validPosition(String position, String age) throws PositionException
	{
		if(position.length() < 1 || position.length() > 2)
		{
			throw new PositionException("Invalid Position");
		}
		
		//check age parameter
		if(Integer.parseInt(age) < 8)
		{
			//tee ball can play any position except for pitcher
			if(!position.equalsIgnoreCase("1B") &&
					!position.equalsIgnoreCase("2B") &&
					!position.equalsIgnoreCase("3B") &&
					!position.equalsIgnoreCase("C") &&
					!position.equalsIgnoreCase("LF") &&
					!position.equalsIgnoreCase("CF") &&
					!position.equalsIgnoreCase("RF") &&
					!position.equalsIgnoreCase("SS")) {
				throw new PositionException("Not a valid position for Tee-Ball");
			}
		}
		return true;
	}
	
}
