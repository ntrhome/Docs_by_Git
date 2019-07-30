package my.unit;

import java.util.Date;

public class Unit {
	private int owner;
	private int cost;
	private int speed;
	private int vision;
	private int power;
	private int armor;
	private long lifespan; //in milliseconds
	private long birthday; //in milliseconds
	
	private boolean thisInit(int owner, int cost, int speed, int vision, int power, int armor , long lifespan) {
		//birthday = new
		java.time.Instant.now(). //http://qaru.site/questions/16594/how-to-get-the-current-datetime-in-java
		return setOwner(owner) | setBirthday(birthday) | setCost(cost) | setSpeed(speed) | setVision(vision) | setPower(power) | setArmor(armor);
	}
	
	private boolean setOwner(int owner) {
		this.owner = owner;
		return false;
	}
	
	private boolean setBirthday(Date birthday) {
		//if(birthday == null) System.err.println("birthday == null");
		this.birthday = (Date)birthday.clone();
		return false;
	}
	
	private boolean setCost(int cost) {
		this.cost = cost;
		return false;
	}
	
	private boolean setSpeed(int speed) {
		this.speed = speed;
		return false;
	}
	
	private boolean setVision(int vision) {
		this.vision = vision;
		return false;
	}
	
	private boolean setPower(int power) {
		this.power = power;
		return false;
	}
	
	private boolean setArmor(int armor) {
		this.armor = armor;
		return false;
	}
	
	public Unit(){
		thisInit(0, new Date(), 0, 0, 0, 0, 0);
	}
	
	public Unit(int owner) {
		thisInit(owner, new Date(), 0, 0, 0, 0, 0);
	}
	
	public Unit(int owner, Date birthday) {
		thisInit(owner, birthday, 0, 0, 0, 0, 0);
	}
	
	public Unit(int owner, Date birthday, int cost, int speed, int vision, int power, int armor) {
		thisInit(owner, birthday, cost, speed, vision, power, armor);
	}
	
	@Override
	public String toString() { 
		return    "owner=" + owner + 				//"id=" + id + 
				", birthday=" + birthday.getTime() +
				", cost=" + cost +
				", speed=" + speed +
				", vision=" + vision +
				", power=" + power +
				", armor=" + armor;
	}
	
}

//https://wowwiki.fandom.com/wiki/Warcraft_II_units
//Peasant / Peon 
//Footman / Grunt
//Elven Archer / Troll Axethrower 
//Knight / Ogre
//Ballista / Catapult 
//Dwarven Demolition Squad / Goblin Sappers



