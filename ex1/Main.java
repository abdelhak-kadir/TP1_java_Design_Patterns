public class Main {
    public static void main(String[] args) {
        Restaurant italien = new RestaurantItalien();
        italien.commanderPlat();  

        Restaurant americain = new RestaurantAmericain();
        americain.commanderPlat();  
    }
}
