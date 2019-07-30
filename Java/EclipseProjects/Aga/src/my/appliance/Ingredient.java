package my.appliance;

public class Ingredient {
	private String name;
	private int value;
	private String measure;
	
	public Ingredient(String name, int value, String measure) {
		super();
		
		this.name = name;
		this.value = value;
		this.measure = measure;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", value=" + value + ", measure=" + measure + "]";
	}
}
