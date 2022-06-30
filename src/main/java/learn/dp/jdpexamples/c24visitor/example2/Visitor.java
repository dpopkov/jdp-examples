package learn.dp.jdpexamples.c24visitor.example2;

interface Visitor {

    void visitTheElement(SeniorEmployee employee);

    void visitTheElement(JuniorEmployee employee);
}
