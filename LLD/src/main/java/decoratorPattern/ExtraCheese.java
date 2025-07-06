class ExtraCheese extends ToppingDecorator {
   
    BasePizza basePizza;
    public Mashroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    int cost() {
        return basePizza.cost() + 200;
    }
}