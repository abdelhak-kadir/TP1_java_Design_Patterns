public class RestaurantAmericain extends Restaurant {
    @Override
    public Plat creerPlat() {
        return new Burger();
    }
}