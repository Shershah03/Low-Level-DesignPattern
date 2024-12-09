package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    private int stockCount;
    @Override
    public void register(NotificationAlertObserver notificationAlertObserver) {
            observerList.add(notificationAlertObserver);
    }

    @Override
    public void deregister(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyOthers() {
            for(NotificationAlertObserver obj:observerList){
                obj.update();
            }
    }

    @Override
    public int getData() {
        return this.stockCount;
    }

    @Override
    public void setData(int stockCount) {
            if(this.stockCount==0 && stockCount>0)
            {
                notifyOthers();
            }
            this.stockCount+=stockCount;
    }
}
