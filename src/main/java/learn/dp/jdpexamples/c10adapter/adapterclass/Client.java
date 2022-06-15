package learn.dp.jdpexamples.c10adapter.adapterclass;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Class Adapter Demo. ***");
        RectInterface rectangle = new Rectangle();
        System.out.println("Initially, printing the details of both shapes.");
        System.out.println("The rectangle.AboutMe() says:");
        rectangle.aboutMe();
        TriInterface triangle = new Triangle();
        System.out.println("The triangle.Triangle() says:");
        triangle.aboutTriangle();
        System.out.println("Now using the adapter.");
        RectInterface adapter = new Adapter();
        System.out.println("The adapter.aboutMe() says:");
        adapter.aboutMe();
    }
}
