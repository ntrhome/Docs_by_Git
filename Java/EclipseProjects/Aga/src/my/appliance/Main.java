package my.appliance;

public class Main {
	private static Recipe recipes[]; 
	
	public static void main(String[] args) {
		System.out.println(recipesInit() + " recipes are initialized.");
		
	}

	private static int recipesInit() {
		final int RECIPESBOOK = 3;
		recipes = new Recipe[RECIPESBOOK];
		//0
		recipes[0] = new Recipe("Espresso", 5);
		recipes[0].setIngredient(0, "Cap", 1, "piece");
		recipes[0].setIngredient(1, "Stick", 1, "piece");
		recipes[0].setIngredient(2, "Water", 30, "gram");
		recipes[0].setIngredient(3, "Coffee", 7, "gram");
		recipes[0].setIngredient(4, "Sugar", 10, "gram");
		//1
		recipes[1] = new Recipe("Americano", 5);
		recipes[1].setIngredient(0, "Cap", 1, "piece");
		recipes[1].setIngredient(1, "Stick", 1, "piece");
		recipes[1].setIngredient(2, "Water", 60, "gram");
		recipes[1].setIngredient(3, "Coffee", 7, "gram");
		recipes[1].setIngredient(4, "Sugar", 10, "gram");
		//2
		recipes[2] = new Recipe("Cappuccino", 6);
		recipes[2].setIngredient(0, "Cap", 1, "piece");
		recipes[2].setIngredient(1, "Stick", 1, "piece");
		recipes[2].setIngredient(2, "Water", 60, "gram");
		recipes[2].setIngredient(3, "Coffee", 7, "gram");
		recipes[2].setIngredient(4, "Sugar", 10, "gram");
		recipes[2].setIngredient(5, "Milk", 20, "gram");
		
		System.out.println(recipes[0].toString());
		System.out.println(recipes[1].toString());
		System.out.println(recipes[2].toString());
				
		return RECIPESBOOK;
	}

}
