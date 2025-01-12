package oops;
import oops.encap.*;
import oops.inhert.*;
import oops.poly.*;
import oops.abs.*;
import oops.composition.*;
import oops.interfaces.*;

public class Main {
    public static void main(String[] args) {
        Ducati v4 = new Ducati();
        System.out.println(v4.displacement + v4.getCategory());
        MotoGP.tyre();
    }
}
