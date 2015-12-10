public class PizzaOrderDemo {
    public static void main(String[] args) {
        PizzaOrderingSystem pizzaDelivery = new PizzaOrderingSystem();
        Pizza pizza;
        pizza = pizzaDelivery.getPizza(PizzaType.CHEESE);
        pizza.addTopping();
        pizza = pizzaDelivery.getPizza(PizzaType.SPICY);
        pizza.addTopping();
    }
}
