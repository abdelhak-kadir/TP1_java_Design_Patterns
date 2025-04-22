package ex2;

public class Cappuccino implements Boisson {
    private double prixBase = 3.5;

    @Override
    public void preparer() {
        System.out.println("Preparing the cappuccino...");
    }

    @Override
    public void personnaliser() {
        System.out.println("Adding milk foam and cinnamon...");
    }

    @Override
    public void servir() {
        System.out.println("Serving with creamy foam.");
    }

    @Override
    public double calculerPrix() {
        return prixBase;
    }
}

