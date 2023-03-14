package base;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */
public class VanillaIceCream extends IceCream{
 @Override
 public String getDescription() {
  return "Plain Vanilla Ice cream";
 }

 @Override
 public int cost() {
  return 40;
 }
}
