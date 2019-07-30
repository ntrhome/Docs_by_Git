package dog;

//import java.util.Date;
import java.util.*;

public class Animals {
	private String name;
	private Date birthday;
	private int lifespan;
	private boolean warmBlood;
	
	
	
	public Animals()
	{
		thisInit("", new Date(0), 0, true);
	}
	public Animals(String nick, Date birtdayDate, int years, boolean isWarmBlood)
	{
		thisInit(nick, birtdayDate, years, isWarmBlood);
	}

	private void thisInit(String nick, Date birtdayDate, int years, boolean isWarmBlood)
	{
		setName(nick);
		birthday = new Date();
		
		setWarmBlood(isWarmBlood);
		setLifespan(years);
		
		//SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	}
	
	public String getName()	{ 
		return name; 
	}
	public void setName(String nick) { 
		if(nick.length()>=0 && nick.length()<43) name = nick; 
	}
	
	public int getLifespan() { 
		return lifespan; 
	}
	public void setLifespan(int years) {
		if(years >=0 && years <1001) lifespan = years; 
	}
		
	public boolean getWarmBlood() {
		return warmBlood; 
	}
	public void setWarmBlood(boolean isWarmBlood) { 
		warmBlood = isWarmBlood; 
	}
	
	public String toString()
	{
		String s = "";
		s += "name=" + name;
		s += "birtday=" + birtday
		s += ", lifespan=" + lifespan;
		s += ", warmBlood=" + (warmBlood ? "true" : "false");
		return s; 
	}
}
