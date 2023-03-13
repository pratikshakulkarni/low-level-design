package subject;

import observer.NotificationObserver;

import java.util.Observer;

/***
 @author: Pratiksha Kulkarni
 date: 3/13/2023
 */
public interface StockObservable {

 void registerObserver(NotificationObserver observer);

 void deleteObserver(NotificationObserver observer);

 void addStock(int newStockCOunt);

 void notifyAllObservers();
}
