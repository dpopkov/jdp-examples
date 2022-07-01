package learn.dp.jdpexamples.c25interpreter.example1;

class IndividualEmployee implements Employee {
    private final int experience;
    private final String grade;

    IndividualEmployee(int experience, String grade) {
        this.experience = experience;
        this.grade = grade;
    }

    @Override
    public boolean interpret(Context context) {
        return experience >= context.getYearsOfExperience() && context.getPermissibleGrades().contains(grade);
    }

    @Override
    public String toString() {
        return "Experience: " + experience + ", grade: '" + grade + "'";
    }
}
