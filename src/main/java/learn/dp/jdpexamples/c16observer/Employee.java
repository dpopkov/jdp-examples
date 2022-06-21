package learn.dp.jdpexamples.c16observer;

class Employee implements Observer {

    private final String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(name + " has received an alert from " + company.getName());
        System.out.println("The current stock price is: $" + company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return name;
    }
}
