package subject;

import observer.NotificationObserver;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

/***
 @author: Pratiksha Kulkarni
 date: 3/13/2023
 */
public class IphoneStockSubject implements StockObservable {

    List<NotificationObserver> observers;
    long stockCount;

    public IphoneStockSubject() {
        observers = new ArrayList<>();
        stockCount = 0;
    }

    @Override
    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(NotificationObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void addStock(int newStockCount) {
        if (stockCount == 0)
            notifyAllObservers();

        stockCount += newStockCount;
    }

    @Override
    public void notifyAllObservers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }
}
