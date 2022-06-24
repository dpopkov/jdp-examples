package learn.dp.jdpexamples.c19command;

class NumberGeneratorReceiver {
    private int current;

    public NumberGeneratorReceiver() {
        current = 0;
        System.out.println("The initial number is: " + current);
        System.out.println("You can increase it, but you cannot decrease it further");
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void increment() {
        System.out.println(" Received an increment number request");
        int oldValue = getCurrent();
        setCurrent(oldValue + 1);
        System.out.println(oldValue + " + 1 = " + getCurrent());
    }

    public void decrement() {
        System.out.println(" Received a decrement number request");
        int oldValue = getCurrent();
        if (oldValue > 0) {
            setCurrent(oldValue - 1);
            System.out.println(oldValue + " - 1 = " + getCurrent());
            System.out.println(" The number is decremented");
        } else {
            System.out.println("Cannot decrement");
        }
    }
}
