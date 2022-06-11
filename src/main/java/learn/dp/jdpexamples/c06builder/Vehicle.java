package learn.dp.jdpexamples.c06builder;

import java.util.LinkedList;

abstract class Vehicle {

    private final String brandName;
    private final LinkedList<String> parts;

    public Vehicle(String brandName) {
        this.brandName = brandName;
        parts = new LinkedList<>();
    }

    public String getBrandName() {
        return brandName;
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        parts.forEach(System.out::println);
    }
}
