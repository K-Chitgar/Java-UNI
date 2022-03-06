// Kasra Chitgar - Tamrin 0-2 (bozorgtarin adad)

package Session0;

import java.util.Scanner;

public class Tamrin00 {

    public static void main(String[] args) {
        int a[];

        Scanner intput = new Scanner(System.in);
        int f = 0;
        int n;
        System.out. print("How many numbers?: ");
        n = intput.nextInt();
        a=new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out. print("Enter number " +( i + 1) + ": ");
            a[i] = intput.nextInt();
        }

        System.out. print("Enter Number for Search: ");
        int s;
        s = intput.nextInt();
        System.out.println();

        for (int j = 0; j < n; j++) {
            if (a[j] == s) {
                System.out. println("True");
                f = 1;
                break;
            }
        }

        if (f == 0)
            System.out. println("False");

        {
            int t = 0;
            for(int i =0; i<n ; i++)
            {
                if(a[i] == s)
                    t++;
            }
            System.out.println( "Repeated: " + t );
        }
    }
}