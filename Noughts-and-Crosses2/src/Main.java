import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("   |   |  ");
        System.out.println("---+---+--- ");
        System.out.println("   |   | ");
        System.out.println("---+---+---");
        System.out.println("   |   | ");
        int p = 1;
        while (p <= 9) {
            p++;
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
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            int o = Integer.parseInt(reader1.readLine());
            if (o == 1) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println(" o |   | ");
            } else if (o == 2) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   | o | ");
            } else if (o == 3) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | o");
            } else if (o == 4) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println(" o |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (o == 5) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   | o | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (o == 6) {
                System.out.println("   |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | o");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (o == 7) {
                System.out.println(" o |   |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (o == 8) {
                System.out.println("   | o |  ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            } else if (o == 9) {
                System.out.println("   |   | o ");
                System.out.println("---+---+--- ");
                System.out.println("   |   | ");
                System.out.println("---+---+---");
                System.out.println("   |   | ");
            }
        }

    }
}
