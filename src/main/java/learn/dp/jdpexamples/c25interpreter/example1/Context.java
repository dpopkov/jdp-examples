package learn.dp.jdpexamples.c25interpreter.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Context {

    private final int yearsOfExperience;
    private final List<String> permissibleGrades;

    public Context(int yearsOfExperience, String... allowedGrades) {
        this.yearsOfExperience = yearsOfExperience;
        permissibleGrades = new ArrayList<>();
        permissibleGrades.addAll(Arrays.asList(allowedGrades));
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }
}
