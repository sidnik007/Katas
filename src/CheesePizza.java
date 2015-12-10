public class CheesePizza implements Pizza {
    @Override
    public void makeBase() {
        System.out.println("Make base for cheese pizza");
    }

    @Override
    public void addTopping() {
        System.out.println("Add toppings for cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake 20 min cheese pizza");
    }
}
