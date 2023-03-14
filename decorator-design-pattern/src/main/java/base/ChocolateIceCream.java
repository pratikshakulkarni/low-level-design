package base;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */

public class ChocolateIceCream extends IceCream {
    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public int cost() {
        return 70;
    }
}
