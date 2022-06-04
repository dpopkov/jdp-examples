package learn.dp.jdpexamples.c01solid.ocp;

public enum Department {
    COMPUTER_SCIENCE("Comp.Sc"),
    PHYSICS("Physics"),
    HISTORY("History"),
    ENGLISH("English");

    private final String label;

    Department(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
