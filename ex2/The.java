package ex2;

public class The extends BoissonPrototype implements Boisson {
    @Override
    public void preparer() {
        System.out.println("Preparing the tea...");
    }

    @Override
    public void personnaliser() {
        System.out.println("Adding sugar or honey...");
    }

    @Override
    public void servir() {
        System.out.println("Serving the tea...");
    }

    @Override
    public double calculerPrix() {
        return 2.0;
    }
}

