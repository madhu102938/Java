import java.util.ArrayList;
import greet.*;

public class Untitled {

    public static <T> void print(T textToPrint) {
        System.out.println(textToPrint);
    }

    public static void main(String[] args) {
        int n = args.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(args[i]);
        }
        print(sum);
    }
}
