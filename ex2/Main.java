package ex2;
public class Main {
    public static void main(String[] args) {
        // 🔹 Factory Method
        Boisson expresso = new CafeFactory().creerBoisson("expresso");
        expresso.preparer();

        // 🔹 Singleton
        JournalCommandes.getInstance().ajouterCommande("Expresso simple");

        // 🔹 Builder → here is your customized Latte order
        Boisson lattePersonalise = new BoissonBuilder()
            .setType("latte")
            .setShots(2)
            .setLait("amande")
            .build();

        // 🔹 Prototype
        Expresso expressoOriginal = new Expresso();
        Expresso copie = (Expresso) expressoOriginal.copier();
        System.out.println("Espresso cloned!");

        Boisson chocolat = new CafeFactory().creerBoisson("chocolatchaud");
        chocolat.preparer();
        chocolat.personnaliser();
        chocolat.servir();
        System.out.println("Price: " + chocolat.calculerPrix() + " €");
    }
}

