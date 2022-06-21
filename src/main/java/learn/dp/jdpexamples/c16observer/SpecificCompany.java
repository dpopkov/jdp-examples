package learn.dp.jdpexamples.c16observer;

class SpecificCompany extends Company {

    public SpecificCompany(String name) {
        super(name);
    }

    @Override
    protected void register(Observer observer) {
        super.observerList.add(observer);
        System.out.println(this.getName() + " registered " + observer.getObserverName());
    }

    @Override
    protected void unregister(Observer observer) {
        super.observerList.remove(observer);
        System.out.println(this.getName() + " unregistered " + observer.getObserverName());
    }

    @Override
    protected void notifyRegisteredUsers() {
        for (Observer observer : super.observerList) {
            observer.getNotification(this);
        }
    }
}
