package learn.dp.jdpexamples.c15templatemethod;

class Electronics extends BasicEngineering {
    @Override
    protected void courseOnSpecialPaper() {
        System.out.println("3. Digital Logic and Circuit Theory");
    }

    @Override
    protected boolean isAdditionalPaperNeeded() {
        return false;
    }
}
