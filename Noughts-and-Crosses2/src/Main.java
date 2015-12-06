import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String args[]) throws IOException {
        char field[] = new char[9];
        for (int i = 0; i < 9; i++) {
            field[i] = ' ';

        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {

            int x = Integer.parseInt(reader.readLine());
            field[x - 1] = 'X';
            printField(field);

            int о = Integer.parseInt(reader.readLine());
            field[о - 1] = 'О';
            printField(field);
        }
    }


    public static void printField(char[] field) {
        System.out.println(" " + field[6] + " | " + field[7] + " | " + field[8]);
        System.out.println("---+---+--- ");
        System.out.println(" " + field[3] + " | " + field[4] + " | " + field[5]);
        System.out.println("---+---+---");
        System.out.println(" " + field[0] + " | " + field[1] + " | " + field[2]);
    }
}