package decoratorPattern;

class Main {
    public static void main(String[] args) {
        
        BasePizza pizza = new Mushroom(new ExtraCheese(new FarmHousePizza()));
        System.out.println(pizza.cost());
    }
}
