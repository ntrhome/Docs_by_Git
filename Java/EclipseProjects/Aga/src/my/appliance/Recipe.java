package my.appliance;

import java.util.Arrays;

public class Recipe {
	private String name;
	private Ingredient ingredients[];
	
	public Recipe(String name, int ingredientsNumber) {
		super();
		
		this.name = name;
		ingredients = (ingredientsNumber < 0) ? null : (new Ingredient[ingredientsNumber]);
	}
	
	public int ingredientsNumber() {
		return (ingredients == null) ? 0 : ingredients.length;
	}
	
	public void setIngredient(int id, String name, int value, String measure ) {
		ingredients[id] = new Ingredient(name, value, measure);
	}

	@Override
	public String toString() {
		String s = "Recipe [name=" + name + ", ingredients=" + ingredients.length + "]";
		s += "\n";
		String eos = "";
		for(Ingredient e : ingredients) {
			s += eos + "    " + ((e == null)?"Ingredient [null]":e.toString());
			eos = "\n";
		}
		return s;
	}
}
