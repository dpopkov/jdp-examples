package learn.dp.jdpexamples.c15templatemethod;

class Client {
    public static void main(String[] args) {
        System.out.println("*** Template Method Pattern Demo. ***");

        BasicEngineering csCourse = new ComputerScience();
        System.out.println("Computer Science Course structure:");
        csCourse.displayCourseStructure();

        BasicEngineering electronicsCourse = new Electronics();
        System.out.println("Electronics Course structure:");
        electronicsCourse.displayCourseStructure();
    }
}
