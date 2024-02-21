
package org.example;

import java.util.Scanner;
public class Stone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("ВВедите 1 2 3 :");
        int input = sc.nextInt();

        System.out.print("ВВедите 2 число1 2 3 :");
        int input1 = scan.nextInt();

        if (input == input1)
            System.out.println( "ничья");
        else if (input == 1 && input1 == 2 )
            System.out.println( "игрок 1 выиграл");
        else if (input == 2 && input1 == 3 )
            System.out.println( "игрок 1 выиграл");
        else if (input == 3 && input1 == 1 )
            System.out.println( "игрок 1 выиграл");
        else
            System.out.println( "игрок 2 выиграл");

    }
}
