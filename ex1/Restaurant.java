public abstract class Restaurant {
    public abstract Plat creerPlat();

    public void commanderPlat() {
        Plat plat = creerPlat();
        plat.preparer();
    }
}
