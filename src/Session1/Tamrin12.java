// Kasra Chitgar - Tamrin 1-2 (miangin nomarat ba zarib / vazeiat mashroti)

package Session1;

import java.util.Scanner;

public class Tamrin12 {
    public static void main(String[] args) {
        int tedad;

/////////////////////////////////////////////////////////////////////////

        float nomre[];
        System.out.print("Chand dars darid? ");
        Scanner intput = new Scanner(System.in);
        tedad = intput.nextInt();
        nomre = new float[tedad];

        for (int i = 0; i < nomre.length; i++) {
            System.out.print("Nomre dars " + (i + 1) + " ra vared namaeid: ");
            nomre[i] = intput.nextFloat();
        }
/////////////////////////////////////////////////////////////////////////

        System.out.println();

        int zarib[];
        zarib = new int[tedad];

        for (int i = 0; i < nomre.length; i++) {
            System.out.print("Zarib dars " + (i + 1) + " ra vared namaeid: ");
            zarib[i] = intput.nextInt();
        }

        int d = 0;
        for (int q = 0; q < tedad; q++) {
            d += zarib[q];
        } //majmo zarib

/////////////////////////////////////////////////////////////////////////

        float result[];
        result = new float[tedad];

        for (int i = 0; i < nomre.length; i++){
            result[i] = zarib[i] * nomre[i];
        }

        float total = 0;
        for (int counter = 0; counter < tedad; counter++) {
            total += result[counter];
        }

/////////////////////////////////////////////////////////////////////////

        System.out.println();
        float Average = total/d;
        System.out.println("Miangin nomarat: " + Average);

        if (Average<=12) System.out.println("Mashrot shodid.");
        else System.out.println("Mashrot Nashodid.");
    }
}