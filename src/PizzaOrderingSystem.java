enum PizzaType {
    CHEESE {
        @Override
        Pizza returnPizza() {
            return new CheesePizza();
        }
    }, SPICY {
        @Override
        Pizza returnPizza() {
            return new SpicyPineapple();
        }
    };
    abstract Pizza returnPizza();
}


public class PizzaOrderingSystem {
    public Pizza getPizza(PizzaType type){
        return type.returnPizza();
    }
}