package com.design.pattern.observer;

public class ObserverDesignPatternMain{

    public static void main(String args[]){
        IphoneObservable iphoneObservable=new IphoneObservable();
        NotificationAlertObserver observer1=new MobileAlertObserver(iphoneObservable,"mayukh03");
        NotificationAlertObserver observer2=new EmailAlertObserver(iphoneObservable,"mayukh@gmail.com");
        iphoneObservable.register(observer1);
        iphoneObservable.register(observer2);
        iphoneObservable.setData(10);
        iphoneObservable.setData(-10);
        iphoneObservable.setData(10);
    }
}
