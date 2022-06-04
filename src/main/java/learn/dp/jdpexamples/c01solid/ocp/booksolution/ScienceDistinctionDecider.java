package learn.dp.jdpexamples.c01solid.ocp.booksolution;

public class ScienceDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 80) {
            System.out.println(student.getRegNumber() + " has received a distinction in science.");
        }
    }
}
