package learn.dp.jdpexamples.c10adapter.adapterobject;

import java.util.ArrayList;
import java.util.List;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Object Adapter Demo. ***");

        RectInterface rectangle = new Rectangle(20, 10);
        TriInterface triangle = new Triangle(20, 10);
        RectInterface adapter = new Adapter(triangle);

        List<RectInterface> rectangleObjects = new ArrayList<>();
        rectangleObjects.add(rectangle);
        rectangleObjects.add(adapter);

        System.out.println("Processing the following objects:");
        for (var rect : rectangleObjects) {
            System.out.println("Area: " + getDetails(rect) + " square units.");
        }
    }

    static double getDetails(RectInterface rectangle) {
        rectangle.aboutMe();
        return rectangle.calculateArea();
    }
}
