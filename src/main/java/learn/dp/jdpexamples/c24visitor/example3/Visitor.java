package learn.dp.jdpexamples.c24visitor.example3;

interface Visitor {

    void visitTheElement(SeniorEmployee employee);

    void visitTheElement(JuniorEmployee employee);
}
