package decoratorPattern;

class ExtraCheese extends ToppingDecorator {
   
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    int cost() {
        return basePizza.cost() + 200;
    }
}
