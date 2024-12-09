package com.design.pattern.observer;

public class EmailAlertObserver implements NotificationAlertObserver{
    StockObservable stockObservable;
     String emailId;

    public EmailAlertObserver( StockObservable stockObservable,String emailId) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(stockObservable,emailId);
    }

    private void sendEmail(StockObservable stockObservable, String emailId) {
        System.out.println("Email Sent");
    }
}
