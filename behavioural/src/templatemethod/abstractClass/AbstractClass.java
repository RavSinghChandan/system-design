package templatemethod.abstractClass;

public abstract class AbstractClass {

    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    private void stepOne() {
        System.out.println("Step 1: Common behavior executed.");
    }

    private void stepFour() {
        System.out.println("Step 4: Final step executed.");
    }

    protected abstract void stepTwo();
    protected abstract void stepThree();

}
