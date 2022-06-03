package learn.dp.jdpexamples.c01solid.srp.usingsrp;

enum Seniority {
    JUNIOR,
    SENIOR;

    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
