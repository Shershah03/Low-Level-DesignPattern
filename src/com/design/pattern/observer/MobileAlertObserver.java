package com.design.pattern.observer;

public class MobileAlertObserver implements NotificationAlertObserver {

   StockObservable stockObservable;
   String username;

    public MobileAlertObserver(StockObservable stockObservable, String username) {
        this.stockObservable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
            sendMobileAlert(stockObservable,username);
    }

    private void sendMobileAlert(StockObservable stockObservable, String username) {
        System.out.println("Mobile Notification Sent");
    }
}
