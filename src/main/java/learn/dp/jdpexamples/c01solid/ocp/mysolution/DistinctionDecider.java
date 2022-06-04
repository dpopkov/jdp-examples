package learn.dp.jdpexamples.c01solid.ocp.mysolution;

import java.util.ArrayList;
import java.util.List;

public class DistinctionDecider {

    private final List<DistinctionCriteria> criteriaList = new ArrayList<>();

    public void addCriteria(DistinctionCriteria criteria) {
        criteriaList.add(criteria);
    }

    public void evaluateDistinction(Student student) {
        for (DistinctionCriteria criteria : criteriaList) {
            if (criteria.isPassedBy(student)) {
                System.out.printf("%s has received a distinction in %s.%n", student.getRegNumber(), criteria.getLabel());
            }
        }
    }
}
