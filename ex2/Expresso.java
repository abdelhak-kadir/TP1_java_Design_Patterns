package ex2;

public class Expresso extends BoissonPrototype implements Boisson {
    private double prixBase = 2.0;

    @Override
    public void preparer() {
        System.out.println("Preparing the espresso...");
    }

    @Override
    public void personnaliser() {
        System.out.println("Adding sugar...");
    }

    @Override
    public void servir() {
        System.out.println("Serving in a small cup.");
    }

    @Override
    public double calculerPrix() {
        return prixBase;
    }
}


