package ex2;

public class ChocolatChaud implements Boisson {
    private double prixBase = 3.2;

    @Override
    public void preparer() {
        System.out.println("Preparing hot chocolate: heating milk + cocoa...");
    }

    @Override
    public void personnaliser() {
        System.out.println("Adding whipped cream or cinnamon as requested.");
    }

    @Override
    public void servir() {
        System.out.println("Serving in a large cup.");
    }

    @Override
    public double calculerPrix() {
        return prixBase;
    }
}
