// Kasra Chitgar - Tamrin 0-2 (bozorgtarin adad)

package Session0;

import java.util.Scanner;
public class Tamrin02 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] a = new int[50];
        int n,i,f;
        System.out.print("How many numbers? ");
        n = reader.nextInt();
        for (i = 0; i < n; i++) {
            System.out. print("Enter number " +( i + 1) + ": ");
            a[i] = reader.nextInt();
        }
        f = a[i];
        for(;i >= 0;i--){
            if(a[i] > f){
                f = a[i];
            }
        }
        System.out.println("Maximum number: " + f);
    }
}