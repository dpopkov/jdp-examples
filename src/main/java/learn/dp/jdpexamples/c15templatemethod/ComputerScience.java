package learn.dp.jdpexamples.c15templatemethod;

class ComputerScience extends BasicEngineering {
    @Override
    protected void courseOnSpecialPaper() {
        System.out.println("3. Object-Oriented Programming");
    }

    @Override
    protected void courseOnAdditionalPaper() {
        System.out.println("4. Compiler Construction");
    }
}
