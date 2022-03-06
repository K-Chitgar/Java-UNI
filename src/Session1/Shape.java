package Session1;

// Kasra Chitgar - 40012341054195 - Tamrin 1-1 (mohasebe mohit va masahate moraba va mostatil)

import java.util.Scanner;

public class Shape {
    public int length;
    public int width;
    public static void main(String[] args) {
        Shape square=new Shape();
        Shape rectangle=new Shape();

        int s;
        System.out.print("What is the desired shape (rectangle:1  square:2) ? ");
        Scanner intput = new Scanner(System.in);
        s = intput.nextInt();
        if (s==1){
            System.out.print("Enter the length of the rectangle: ");
            rectangle.length = intput.nextInt();
            System.out.print("Enter the width of the rectangle: ");
            rectangle.width = intput.nextInt();
            System.out.println("Rectangle area: " + rectangle.width* rectangle.length);
            System.out.print("Rectangle environment: ");
            System.out.println(2*(rectangle.width+rectangle.length));
        }
        else if (s==2){
            System.out.print("Enter the length of the side of a square: ");
            square.length = intput.nextInt();
            System.out.println("Square area: " + square.length*square.length);
            System.out.println("Square environment: " + 4*square.length);
        }
        else System.out.println("Error");
    }
}