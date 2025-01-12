package oops.interfaces;

public interface MotoGP {
    public static final int displacement = 1000;
    // here public static final is reductant as every variable will be just that

    public static void tyre() {
        System.out.println("Michelin");
    }

    public String getCategory();

    public default void category() {
        System.out.println(this.getCategory());
    }
}
