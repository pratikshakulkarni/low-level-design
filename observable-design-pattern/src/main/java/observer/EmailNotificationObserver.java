package observer;

import subject.StockObservable;

/***
 @author: Pratiksha Kulkarni
 date: 3/13/2023
 */
public class EmailNotificationObserver implements NotificationObserver {

    private String emailId;
    private StockObservable stockObservable;

    public EmailNotificationObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "New Iphone stack added");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Sending email notification " + emailId);
    }
}
