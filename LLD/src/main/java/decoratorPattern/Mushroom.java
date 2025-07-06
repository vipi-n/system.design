package decoratorPattern;

class Mushroom extends ToppingDecorator {

    BasePizza basePizza;
    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    int cost() {
        return basePizza.cost() + 100;
    }
}
