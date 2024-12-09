package com.design.pattern.observer;

public interface StockObservable {


    public void register(NotificationAlertObserver notificationAlertObserver);
    public void deregister(NotificationAlertObserver notificationAlertObserver);
    public void notifyOthers();
    public int getData();
    public void setData(int stockCount);


    }
