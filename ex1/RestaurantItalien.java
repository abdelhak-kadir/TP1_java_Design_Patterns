public class RestaurantItalien extends Restaurant {
    @Override
    public Plat creerPlat() {
        return new Pizza();
    }
}
