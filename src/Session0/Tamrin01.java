// Kasra Chitgar - Tamrin 0-1 (*)

package Session0;

public class Tamrin01 {
    public static void main(String args[]) {
        int n;
        char p = '*';
        for (n = 1; n < 5; n++) {
            for (p = 1; p < n + 1; p++)
                System.out.print("*");
            System.out.println();
        }
    }
}