import factory.MobileFactory;
import phone.Mobile;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */
public class MobileShop {

 public static void main(String[] args) {
  MobileFactory mobileFactory = new MobileFactory();
  Mobile mobile = mobileFactory.createMobile("IPhone");
  mobile.createMobile();
 }
}
