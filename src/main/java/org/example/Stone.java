
package org.example;

import java.util.Scanner;
import java.util.Random;

public class Stone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите 1 2 3 :");
        int input = sc.nextInt();


        Random scan = new Random();
        int scanNumber = scan.nextInt(3) +1;
        System.out.println("ВВедите 2 число1 2 3 :" + scanNumber );


        if (input == scanNumber)
            System.out.println( "ничья");
        else if ((input == 1 && scanNumber == 2 ) || (input == 2 && scanNumber == 3 ) || (input == 3 && scanNumber == 1 ) )
            System.out.println( "игрок 1 выиграл");

        else
            System.out.println( "игрок 2 выиграл");

    }
}
