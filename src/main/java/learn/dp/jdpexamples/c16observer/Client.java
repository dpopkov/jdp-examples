package learn.dp.jdpexamples.c16observer;

class Client {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo. ***");

        Observer roy = new Employee("Roy");
        Observer kevin = new Employee("Kevin");
        Observer bose = new Customer("Bose");
        Observer jack = new Customer("Jack");

        System.out.println("Working with the company: ABC Ltd.");
        Company abcLtd = new SpecificCompany("ABC Ltd.");
        abcLtd.register(roy);
        abcLtd.register(kevin);
        abcLtd.register(bose);
        changeCompanyStockPrice(abcLtd,5);

        System.out.println("\nABC Ltd. is removing Kevin from the observer list now.");
        abcLtd.unregister(kevin);
        changeCompanyStockPrice(abcLtd,50);

        System.out.println("\nKevin registers again to get notifications from ABC Ltd.");
        abcLtd.register(kevin);
        changeCompanyStockPrice(abcLtd,100);

        System.out.println("\nWorking with another company: XYZ Co.");
        Company xyzCo = new SpecificCompany("XYZ Co.");
        xyzCo.register(roy);
        xyzCo.register(jack);
        changeCompanyStockPrice(xyzCo,500);
    }

    private static void changeCompanyStockPrice(Company company, int price) {
        System.out.printf(" %s's current stock price is $%d.%n", company.getName(), price);
        company.setStockPrice(price);
        System.out.println("------------------------------");
    }
}
