package decoratorPattern.decorator;

import decoratorPattern.base.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;
    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    public int cost() {
        return basePizza.cost() + 100;
    }
}