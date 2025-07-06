package decoratorPattern.decorator;

import decoratorPattern.base.BasePizza;

public class ExtraCheese extends ToppingDecorator {
   
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    public int cost() {
        return basePizza.cost() + 200;
    }
}