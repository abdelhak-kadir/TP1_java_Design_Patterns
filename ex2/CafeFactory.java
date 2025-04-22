package ex2;
public class CafeFactory {
    public Boisson creerBoisson(String type) {
        switch (type.toLowerCase()) {
            case "expresso":
                return new Expresso();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            case "the":
                return new The();
            case "chocolatchaud":
                return new ChocolatChaud();
            default:
                throw new IllegalArgumentException("Boisson inconnue : " + type);
        }
    }
}

