package ex2;

public class Latte implements Boisson {
    private double prixBase = 3.0;

    @Override
    public void preparer() {
        System.out.println("Preparing the Latte...");
    }

    @Override
    public void personnaliser() {
        System.out.println("Customizing the Latte...");
    }

    @Override
    public void servir() {
        System.out.println("Serving the Latte...");
    }

    @Override
    public double calculerPrix() {
        return prixBase;
    }
}
