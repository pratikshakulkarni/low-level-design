package factory;

import phone.IPhone;
import phone.Mobile;
import phone.OnePlus;

/***
 @author: Pratiksha Kulkarni
 date: 3/14/2023
 */
public class MobileFactory {

    public Mobile createMobile(String phone){
        switch (phone){
            case "IPhone": {
                return new IPhone();
            }
            case "OnePlus": {
                return new OnePlus();
            }
            default: return null;
        }
    }
}
