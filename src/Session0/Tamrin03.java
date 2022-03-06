// Kasra Chitgar - Tamrin 0-3 (4 amal asli roie 2 adad)

package Session0;

import java.util.Scanner;

public class Tamrin03 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Help: 1)Addition  2)Subtraction  3)Multiplication  4)Division");
        System.out.print("Enter the first number: ");
        int a=reader.nextInt();
        System.out.print("Enter the second number: ");
        int b=reader.nextInt();
        System.out.print("The desired action on numbers: ");
        int c=reader.nextInt();
        System.out.print("Answer: ");
        switch(c){
            case 1:
                System.out.println(a+b);
                break;

            case 2:
                int f;
                if (b>a) {
                    f = a;
                    a = b;
                    b = f;
                }
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                System.out.println(a/b);
                break;

            default:
                System.out.println("Error");
                break;

        }

    }

}