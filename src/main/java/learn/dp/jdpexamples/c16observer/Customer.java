package learn.dp.jdpexamples.c16observer;

class Customer implements Observer {

    private final String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(name + " is notified from " + company.getName());
        System.out.println("The current stock price is: $" + company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return name;
    }
}
