package observer;

import subject.StockObservable;

/***
 @author: Pratiksha Kulkarni
 date: 3/13/2023
 */
public class MessageNotificationObserver implements NotificationObserver{

 private String phoneNumber;
 private StockObservable stockObservable;

 public MessageNotificationObserver(String phoneNumber, StockObservable stockObservable) {
  this.phoneNumber = phoneNumber;
  this.stockObservable = stockObservable;
 }

 @Override
 public void update() {
   sendMessage(phoneNumber,"New Iphone Stock added ");
 }

 private void sendMessage(String phoneNumber, String new_iphone_stock_added_) {
  System.out.println("Message sent to " + phoneNumber);
 }
}
