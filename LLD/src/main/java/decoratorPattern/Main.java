package decoratorPattern;

import decoratorPattern.base.BasePizza;
import decoratorPattern.base.FarmHousePizza;
import decoratorPattern.decorator.ExtraCheese;
import decoratorPattern.decorator.Mushroom;

class Main {
    public static void main(String[] args) {
        
        BasePizza pizza = new Mushroom(new ExtraCheese(new FarmHousePizza()));
        System.out.println(pizza.cost());
    }
}