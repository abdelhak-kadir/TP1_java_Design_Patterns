package ex2;

public class BoissonBuilder {
    private String type;
    private int shots;
    private String lait;

    public BoissonBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public BoissonBuilder setShots(int shots) {
        this.shots = shots;
        return this;
    }

    public BoissonBuilder setLait(String lait) {
        this.lait = lait;
        return this;
    }

    public Boisson build() {
        Boisson boisson = new CafeFactory().creerBoisson(type);
        boisson.preparer();
        System.out.println("Ajout de " + shots + " shot(s)");
        System.out.println("Lait utilisé : " + lait);
        return boisson;
    }
}
