package learn.dp.jdpexamples.c16observer;

import java.util.ArrayList;
import java.util.List;

abstract class Company {

    protected final List<Observer> observerList = new ArrayList<>();
    private final String name;
    private int stockPrice;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyRegisteredUsers();
    }

    protected abstract void register(Observer observer);

    protected abstract void unregister(Observer observer);

    protected abstract void notifyRegisteredUsers();
}
