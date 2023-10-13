public class CoffeeShop {
    public static void main(String[] args) {
        Coffee simpleCoffee = new Espresso();
        System.out.println("Order: " + simpleCoffee.getDescription());
        System.out.println("Cost: $" + simpleCoffee.cost());

        Coffee latteWithSugar = new SugarDecorator(new Latte());
        System.out.println("Order: " + latteWithSugar.getDescription());
        System.out.println("Cost: $" + latteWithSugar.cost());
    }
}
