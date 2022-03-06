// Kasra Chitgar - Tamrin 1-3 (hale dastgah moadelat)

package Session1;

import java.util.Scanner;

public class Tamrin13 {
    public static void main(String[] args) {
        float a, b, c, d, e, f, x, y;
        Scanner intput = new Scanner(System.in);
        System.out.print("Enter a in (ax+by=e): ");
        a = intput.nextInt();
        System.out.print("Enter b in (ax+by=e): ");
        b = intput.nextInt();
        System.out.print("Enter e in (ax+by=e): ");
        e = intput.nextInt();
        System.out.print("Enter c in (cx+dy=f): ");
        c = intput.nextInt();
        System.out.print("Enter d in (cx+dy=f): ");
        d = intput.nextInt();
        System.out.print("Enter f in (cx+dy=f): ");
        f = intput.nextInt();

        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);


        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
