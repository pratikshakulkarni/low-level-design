import base.ChocolateIceCream;
import base.IceCream;
import decorator.ChocoChipsDecorator;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */
public class IceCreamShop {
    public static void main(String[] args) {
        IceCream chocolateIceCream = new ChocolateIceCream();

        chocolateIceCream = new ChocoChipsDecorator(chocolateIceCream);

        System.out.println("Description " + chocolateIceCream.getDescription());
        System.out.println("Cost " + chocolateIceCream.cost());
    }
}
