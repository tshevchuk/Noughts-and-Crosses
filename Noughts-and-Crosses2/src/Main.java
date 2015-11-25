import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("   |   |  ");
        System.out.println("---+---+--- ");
        System.out.println("   |   | ");
        System.out.println("---+---+---");
        System.out.println("   |   | ");
        int o = 1;
        while (o == 1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());

            if (x == 1) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println(" x |   | ");
            } else if (x == 2) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   | x | ");
            } else if (x == 3) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | x");
            } else if (x == 4) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println(" x |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (x == 5) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   | x | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (x == 6) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | x");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (x == 7) {
                System.out.println(" x |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (x == 8) {
                System.out.println("   | x |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (x == 9) {
                System.out.println("   |   | x ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            }
        }
    }
}