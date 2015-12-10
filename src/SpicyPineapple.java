public class SpicyPineapple implements Pizza{
    @Override
    public void makeBase() {
        System.out.println("Make base for spicy pineapple pizza");
    }

    @Override
    public void addTopping() {
        System.out.println("Add toppings for spicy pineapple pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake 20 min spicy pineapple pizza");
    }
}
