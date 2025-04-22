package ex2;

public abstract class BoissonPrototype implements Cloneable {
    public BoissonPrototype copier() {
        try {
            return (BoissonPrototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
