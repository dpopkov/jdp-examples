package learn.dp.jdpexamples.c15templatemethod;

abstract class BasicEngineering {
    /*
     *  The Template Method.
     *  This method is final to prevent overriding.
     */
    public final void displayCourseStructure() {
        /* The course needs to be completed in the specified sequence below. */
        courseOnMathematics();
        courseOnSoftSkills();
        courseOnSpecialPaper();
        if (isAdditionalPaperNeeded()) {
            courseOnAdditionalPaper();
        }
    }

    private void courseOnMathematics() {
        System.out.println("1. Mathematics");
    }

    private void courseOnSoftSkills() {
        System.out.println("2. Soft skills");
    }

    /* This method will vary in the derived classes. */
    protected abstract void courseOnSpecialPaper();

    /**
     * This method does nothing by default, but may be overridden in a subclass.
     * The hook method {@link #isAdditionalPaperNeeded} controls whether this method
     * will be invoked in the base algorithm in the {@link #displayCourseStructure}
     * Template Method.
     */
    protected void courseOnAdditionalPaper() {
    }

    protected boolean isAdditionalPaperNeeded() {
        return true;
    }
}
