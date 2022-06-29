package learn.dp.jdpexamples.c23mediator.example2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class ChatServer {
    private final List<Employee> employees = new ArrayList<>();
    private final long delay;
    private Text text;

    ChatServer(long delay) {
        this.delay = delay;
    }

    public void register(Employee employee) {
        employees.add(employee);
    }

    public void registerText(Text text) {
        this.text = text;
    }

    public void displayEmployees() {
        System.out.println("At present, the registered employees are:");
        employees.forEach(e -> System.out.println(e.getName()));
    }

    public void postMessage(Employee from, Employee to, String msg) throws InterruptedException {
        pause();
        System.out.println(from.getName() + " posts: " + msg + " at:" + LocalDateTime.now());
        pause();
        text.makeDefaultColor();
        pause();
        to.receiveMessage(from);
        pause();
        text.makeBlueText();
    }

    private void pause() throws InterruptedException {
        Thread.sleep(delay);
    }
}
