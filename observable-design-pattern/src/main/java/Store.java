import observer.EmailNotificationObserver;
import observer.MessageNotificationObserver;
import observer.NotificationObserver;
import subject.IphoneStockSubject;
import subject.StockObservable;

/***
 @author: Pratiksha Kulkarni
 date: 3/13/2023
 */
public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockSubject = new IphoneStockSubject();

        NotificationObserver notificationObserver1 = new EmailNotificationObserver("psk.gmail.com", iphoneStockSubject);
        NotificationObserver notificationObserver2 = new EmailNotificationObserver("jsk.gmail.com", iphoneStockSubject);
        NotificationObserver notificationObserver3 = new EmailNotificationObserver("svk.gmail.com", iphoneStockSubject);
        NotificationObserver notificationObserver4 = new MessageNotificationObserver("789652014", iphoneStockSubject);

        iphoneStockSubject.registerObserver(notificationObserver1);
        iphoneStockSubject.registerObserver(notificationObserver2);
        iphoneStockSubject.registerObserver(notificationObserver3);
        iphoneStockSubject.registerObserver(notificationObserver4);

        iphoneStockSubject.addStock(20);
        iphoneStockSubject.addStock(0);
        iphoneStockSubject.addStock(20);
    }
}
