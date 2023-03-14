package decorator;

import base.IceCream;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */
public class RainbowSprinklerDecorator extends IceCreamDecorator {
    private IceCream iceCream;

    public RainbowSprinklerDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with rainbow sprinklers";
    }

    @Override
    public int cost() {
        return iceCream.cost()+10;
    }
}
