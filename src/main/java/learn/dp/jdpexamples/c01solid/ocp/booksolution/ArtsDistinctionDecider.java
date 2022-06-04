package learn.dp.jdpexamples.c01solid.ocp.booksolution;

public class ArtsDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 70) {
            System.out.println(student.getRegNumber() + " has received a distinction in arts.");
        }
    }
}
