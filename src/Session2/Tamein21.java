// Kasra Chitgar - Tamrin 2-1 (mashin hesab sade)

package Session2;

import java.util.Scanner;

public class Tamein21 {

        public static void main(String[] args) {
            Scanner reader=new Scanner(System.in);
            System.out.print("Enter the first number: ");
            float a=reader.nextFloat();
            System.out.print("Enter the second number: ");
            float b=reader.nextFloat();
            System.out.println("Help: Addition(+)  Subtraction(-)  Multiplication(*)  Division(/)");
            System.out.print("The desired action on numbers: ");
            Scanner scanner=new Scanner (System.in);
            String r=scanner.nextLine ();
            System.out.print("Answer: ");

            switch(r){
                case "+":
                    System.out.println(a+b);
                    break;

                case "-":
                    System.out.println(a-b);
                    break;

                case "*":
                    System.out.println(a*b);
                    break;

                case "/":
                    System.out.println(a/b);
                    break;

                default:
                    System.out.println("Error");
                    break;

            }

        }
    }

