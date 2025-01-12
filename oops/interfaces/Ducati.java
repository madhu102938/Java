package oops.interfaces;

public class Ducati implements MotoGP {

    private String category = "A";

    @Override
    public String getCategory() {
        return category;
    }
}
