public class Dish {
    private String name;
    private List<String> ingredients;
    private double price;

    public Dish(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}

public class Restaurant {
    private List<Dish> dishes;

    public Restaurant() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Dish dish : dishes) {
            totalCost += dish.getPrice();
        }
        return totalCost;
    }
}
