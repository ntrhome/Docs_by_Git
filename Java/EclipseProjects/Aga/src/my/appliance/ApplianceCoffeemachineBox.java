package my.appliance;

public class ApplianceCoffeemachineBox {
	private String name;
	//private int slotsNumber;
	private Ingredient slots[];
	
	public ApplianceCoffeemachineBox(String name, int slots) {
		super();
		
		this.name = name;
		this.slots = new Ingredient[slots];
	}
	
		
}
